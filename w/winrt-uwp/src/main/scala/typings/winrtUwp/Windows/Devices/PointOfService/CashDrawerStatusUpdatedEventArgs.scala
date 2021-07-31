package typings.winrtUwp.Windows.Devices.PointOfService

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This object is passed as a parameter to the event handlers for the StatusUpdated event. */
trait CashDrawerStatusUpdatedEventArgs extends StObject {
  
  /** Gets the data associated with the StatusUpdated event. */
  var status: CashDrawerStatus
}
object CashDrawerStatusUpdatedEventArgs {
  
  @scala.inline
  def apply(status: CashDrawerStatus): CashDrawerStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerStatusUpdatedEventArgs]
  }
  
  @scala.inline
  implicit class CashDrawerStatusUpdatedEventArgsMutableBuilder[Self <: CashDrawerStatusUpdatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: CashDrawerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
