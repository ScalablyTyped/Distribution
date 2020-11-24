package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAccelerometerReadingChangedEventArgs extends js.Object {
  
  var reading: AccelerometerReading = js.native
}
object IAccelerometerReadingChangedEventArgs {
  
  @scala.inline
  def apply(reading: AccelerometerReading): IAccelerometerReadingChangedEventArgs = {
    val __obj = js.Dynamic.literal(reading = reading.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAccelerometerReadingChangedEventArgs]
  }
  
  @scala.inline
  implicit class IAccelerometerReadingChangedEventArgsOps[Self <: IAccelerometerReadingChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setReading(value: AccelerometerReading): Self = this.set("reading", value.asInstanceOf[js.Any])
  }
}
