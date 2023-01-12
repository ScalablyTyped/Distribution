package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for managing change tracking for appointments. */
trait AppointmentStoreChangeTracker extends StObject {
  
  var enable: Any
  
  /* unmapped type */
  var getChangeReader: Any
  
  /* unmapped type */
  var reset: Any
}
object AppointmentStoreChangeTracker {
  
  inline def apply(enable: Any, getChangeReader: Any, reset: Any): AppointmentStoreChangeTracker = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], getChangeReader = getChangeReader.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentStoreChangeTracker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AppointmentStoreChangeTracker] (val x: Self) extends AnyVal {
    
    inline def setEnable(value: Any): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    inline def setGetChangeReader(value: Any): Self = StObject.set(x, "getChangeReader", value.asInstanceOf[js.Any])
    
    inline def setReset(value: Any): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
  }
}
