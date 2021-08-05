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
  
  inline def apply(status: CashDrawerStatus): CashDrawerStatusUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CashDrawerStatusUpdatedEventArgs]
  }
  
  extension [Self <: CashDrawerStatusUpdatedEventArgs](x: Self) {
    
    inline def setStatus(value: CashDrawerStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
