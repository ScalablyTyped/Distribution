package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISimpleOrientationSensorStatics extends js.Object {
  
  def getDefault(): SimpleOrientationSensor = js.native
}
object ISimpleOrientationSensorStatics {
  
  @scala.inline
  def apply(getDefault: () => SimpleOrientationSensor): ISimpleOrientationSensorStatics = {
    val __obj = js.Dynamic.literal(getDefault = js.Any.fromFunction0(getDefault))
    __obj.asInstanceOf[ISimpleOrientationSensorStatics]
  }
  
  @scala.inline
  implicit class ISimpleOrientationSensorStaticsOps[Self <: ISimpleOrientationSensorStatics] (val x: Self) extends AnyVal {
    
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
    def setGetDefault(value: () => SimpleOrientationSensor): Self = this.set("getDefault", js.Any.fromFunction0(value))
  }
}
