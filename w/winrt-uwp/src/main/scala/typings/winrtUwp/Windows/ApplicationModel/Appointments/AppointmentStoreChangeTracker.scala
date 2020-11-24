package typings.winrtUwp.Windows.ApplicationModel.Appointments

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides APIs for managing change tracking for appointments. */
@js.native
trait AppointmentStoreChangeTracker extends js.Object {
  
  var enable: js.Any = js.native
  
   /* unmapped type */ var getChangeReader: js.Any = js.native
  
   /* unmapped type */ var reset: js.Any = js.native
}
object AppointmentStoreChangeTracker {
  
  @scala.inline
  def apply(enable: js.Any, getChangeReader: js.Any, reset: js.Any): AppointmentStoreChangeTracker = {
    val __obj = js.Dynamic.literal(enable = enable.asInstanceOf[js.Any], getChangeReader = getChangeReader.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppointmentStoreChangeTracker]
  }
  
  @scala.inline
  implicit class AppointmentStoreChangeTrackerOps[Self <: AppointmentStoreChangeTracker] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEnable(value: js.Any): Self = this.set("enable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetChangeReader(value: js.Any): Self = this.set("getChangeReader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReset(value: js.Any): Self = this.set("reset", value.asInstanceOf[js.Any])
  }
}
