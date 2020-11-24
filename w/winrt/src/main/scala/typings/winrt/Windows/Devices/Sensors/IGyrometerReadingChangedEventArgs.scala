package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGyrometerReadingChangedEventArgs extends js.Object {
  
  var reading: GyrometerReading = js.native
}
object IGyrometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: GyrometerReading): IGyrometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGyrometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class IGyrometerReadingChangedEventArgsOps[Self <: IGyrometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReading(value: GyrometerReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
}
