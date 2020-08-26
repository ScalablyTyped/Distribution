package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAccelerometerStatics extends js.Object {
  def getDefault(): Accelerometer = js.native
}

object IAccelerometerStatics {
  @scala.inline
  def apply(getDefault: () => Accelerometer): IAccelerometerStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[IAccelerometerStatics]
  }
  @scala.inline
  implicit class IAccelerometerStaticsOps[Self <: IAccelerometerStatics] (val x: Self) extends AnyVal {
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
    def setGetDefault(value: () => Accelerometer): Self = this.set("getDefault", js.Any.fromFunction0(value))
  }
  
}

