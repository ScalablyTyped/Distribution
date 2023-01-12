package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This object is passed as a parameter to the event handlers for the DrawerClosed event. */
trait CashDrawerClosedEventArgs extends StObject {
  
  /** Gets the data associated with the DrawerClosed event. */
  var cashDrawer: CashDrawer
}
object CashDrawerClosedEventArgs {
  
  inline def apply(cashDrawer: CashDrawer): CashDrawerClosedEventArgs = {
    val __obj = js.Dynamic.literal(cashDrawer = cashDrawer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerClosedEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CashDrawerClosedEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCashDrawer(value: CashDrawer): Self = StObject.set(x, "cashDrawer", value.asInstanceOf[js.Any])
  }
}
