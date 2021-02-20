package typings.winrtUwp.Windows.ApplicationModel.Appointments

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for managing change tracking for appointments. */
@js.native
trait AppointmentStoreChangeTracker extends StObject {
  
  var enable: js.Any = js.native
  
  /* unmapped type */
  var getChangeReader: js.Any = js.native
  
  /* unmapped type */
  var reset: js.Any = js.native
}
object AppointmentStoreChangeTracker {
  
  @scala.inline
  def apply(enable: js.Any, getChangeReader: js.Any, reset: js.Any): AppointmentStoreChangeTracker = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], getChangeReader = getChangeReader.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentStoreChangeTracker]
  }
  
  @scala.inline
  implicit class AppointmentStoreChangeTrackerMutableBuilder[Self <: AppointmentStoreChangeTracker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnable(value: js.Any): Self = StObject.set(x, "enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChangeReader(value: js.Any): Self = StObject.set(x, "getChangeReader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: js.Any): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
  }
}
