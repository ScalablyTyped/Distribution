package typings.winrtUwp.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data for the inclinometer reading–changed event. */
@js.native
trait InclinometerReadingChangedEventArgs extends js.Object {
  
  /** Gets the current inclinometer reading. */
  var reading: InclinometerReading = js.native
}
object InclinometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: InclinometerReading): InclinometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[InclinometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class InclinometerReadingChangedEventArgsOps[Self <: InclinometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReading(value: InclinometerReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
}
