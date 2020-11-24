package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the reading–changed event of the proximity sensor. */
@js.native
trait ProximitySensorReadingChangedEventArgs extends js.Object {
  
  /** Gets or sets the most recent proximity sensor reading. */
  var reading: ProximitySensorReading = js.native
}
object ProximitySensorReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: ProximitySensorReading): ProximitySensorReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProximitySensorReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class ProximitySensorReadingChangedEventArgsOps[Self <: ProximitySensorReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReading(value: ProximitySensorReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
}
