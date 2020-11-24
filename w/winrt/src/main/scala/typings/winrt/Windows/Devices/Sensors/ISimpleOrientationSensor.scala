package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISimpleOrientationSensor extends js.Object {
  
  def getCurrentOrientation(): SimpleOrientation = js.native
  
  var onorientationchanged: js.Any = js.native
}
object ISimpleOrientationSensor {
  
  @scala.inline
  def apply(getCurrentOrientation: () => SimpleOrientation, onorientationchanged: js.Any): ISimpleOrientationSensor = {
    val __obj = js.Dynamic.literal(getCurrentOrientation = js.Any.fromFunction0(getCurrentOrientation), onorientationchanged = onorientationchanged.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISimpleOrientationSensor]
  }
  
  @scala.inline
  implicit class ISimpleOrientationSensorOps[Self <: ISimpleOrientationSensor] (val x: Self) extends AnyVal {
    
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
    def setGetCurrentOrientation(value: () => SimpleOrientation): Self = this.set("getCurrentOrientation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnorientationchanged(value: js.Any): Self = this.set("onorientationchanged", value.asInstanceOf[js.Any])
  }
}
