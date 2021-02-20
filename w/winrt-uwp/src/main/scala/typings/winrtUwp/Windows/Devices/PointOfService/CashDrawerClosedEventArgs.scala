package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This object is passed as a parameter to the event handlers for the DrawerClosed event. */
@js.native
trait CashDrawerClosedEventArgs extends StObject {
  
  /** Gets the data associated with the DrawerClosed event. */
  var cashDrawer: CashDrawer = js.native
}
object CashDrawerClosedEventArgs {
  
  @scala.inline
  def apply(cashDrawer: CashDrawer): CashDrawerClosedEventArgs = {
    val __obj = js.Dynamic.literal(cashDrawer = cashDrawer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerClosedEventArgs]
  }
  
  @scala.inline
  implicit class CashDrawerClosedEventArgsMutableBuilder[Self <: CashDrawerClosedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCashDrawer(value: CashDrawer): Self = StObject.set(x, "cashDrawer", value.asInstanceOf[js.Any])
  }
}
