package typings.wiiu.wiiu

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WiiuGamePad extends js.Object {
  
  var accX: Double = js.native
  
  var accY: Double = js.native
  
  var accZ: Double = js.native
  
  var angleX: Double = js.native
  
  var angleY: Double = js.native
  
  var angleZ: Double = js.native
  
  var contentX: Double = js.native
  
  var contentY: Double = js.native
  
  var dirXx: Double = js.native
  
  var dirXy: Double = js.native
  
  var dirXz: Double = js.native
  
  var dirYx: Double = js.native
  
  var dirYy: Double = js.native
  
  var dirYz: Double = js.native
  
  var dirZx: Double = js.native
  
  var dirZy: Double = js.native
  
  var dirZz: Double = js.native
  
  var gyroX: Double = js.native
  
  var gyroY: Double = js.native
  
  var gyroZ: Double = js.native
  
  var hold: Double = js.native
  
  var isDataValid: Boolean = js.native
  
  var isEnabled: Boolean = js.native
  
  var lStickX: Double = js.native
  
  var lStickY: Double = js.native
  
  var rStickX: Double = js.native
  
  var rStickY: Double = js.native
  
  var tpTouch: Boolean = js.native
  
  var tpValidity: Double = js.native
  
  def update(): WiiuGamePad = js.native
}
object WiiuGamePad {
  
  @scala.inline
  def apply(
    accX: Double,
    accY: Double,
    accZ: Double,
    angleX: Double,
    angleY: Double,
    angleZ: Double,
    contentX: Double,
    contentY: Double,
    dirXx: Double,
    dirXy: Double,
    dirXz: Double,
    dirYx: Double,
    dirYy: Double,
    dirYz: Double,
    dirZx: Double,
    dirZy: Double,
    dirZz: Double,
    gyroX: Double,
    gyroY: Double,
    gyroZ: Double,
    hold: Double,
    isDataValid: Boolean,
    isEnabled: Boolean,
    lStickX: Double,
    lStickY: Double,
    rStickX: Double,
    rStickY: Double,
    tpTouch: Boolean,
    tpValidity: Double,
    update: () => WiiuGamePad
  ): WiiuGamePad = {
    val __obj = js.Dynamic.literal(accX = accX.asInstanceOf[js.Any], accY = accY.asInstanceOf[js.Any], accZ = accZ.asInstanceOf[js.Any], angleX = angleX.asInstanceOf[js.Any], angleY = angleY.asInstanceOf[js.Any], angleZ = angleZ.asInstanceOf[js.Any], contentX = contentX.asInstanceOf[js.Any], contentY = contentY.asInstanceOf[js.Any], dirXx = dirXx.asInstanceOf[js.Any], dirXy = dirXy.asInstanceOf[js.Any], dirXz = dirXz.asInstanceOf[js.Any], dirYx = dirYx.asInstanceOf[js.Any], dirYy = dirYy.asInstanceOf[js.Any], dirYz = dirYz.asInstanceOf[js.Any], dirZx = dirZx.asInstanceOf[js.Any], dirZy = dirZy.asInstanceOf[js.Any], dirZz = dirZz.asInstanceOf[js.Any], gyroX = gyroX.asInstanceOf[js.Any], gyroY = gyroY.asInstanceOf[js.Any], gyroZ = gyroZ.asInstanceOf[js.Any], hold = hold.asInstanceOf[js.Any], isDataValid = isDataValid.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any], lStickX = lStickX.asInstanceOf[js.Any], lStickY = lStickY.asInstanceOf[js.Any], rStickX = rStickX.asInstanceOf[js.Any], rStickY = rStickY.asInstanceOf[js.Any], tpTouch = tpTouch.asInstanceOf[js.Any], tpValidity = tpValidity.asInstanceOf[js.Any], update = js.Any.fromFunction0(update))
    __obj.asInstanceOf[WiiuGamePad]
  }
  
  @scala.inline
  implicit class WiiuGamePadOps[Self <: WiiuGamePad] (val x: Self) extends AnyVal {
    
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
    def setAccX(value: Double): Self = this.set("accX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccY(value: Double): Self = this.set("accY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccZ(value: Double): Self = this.set("accZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleX(value: Double): Self = this.set("angleX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleY(value: Double): Self = this.set("angleY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAngleZ(value: Double): Self = this.set("angleZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentX(value: Double): Self = this.set("contentX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentY(value: Double): Self = this.set("contentY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirXx(value: Double): Self = this.set("dirXx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirXy(value: Double): Self = this.set("dirXy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirXz(value: Double): Self = this.set("dirXz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirYx(value: Double): Self = this.set("dirYx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirYy(value: Double): Self = this.set("dirYy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirYz(value: Double): Self = this.set("dirYz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirZx(value: Double): Self = this.set("dirZx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirZy(value: Double): Self = this.set("dirZy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirZz(value: Double): Self = this.set("dirZz", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGyroX(value: Double): Self = this.set("gyroX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGyroY(value: Double): Self = this.set("gyroY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGyroZ(value: Double): Self = this.set("gyroZ", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHold(value: Double): Self = this.set("hold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDataValid(value: Boolean): Self = this.set("isDataValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEnabled(value: Boolean): Self = this.set("isEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLStickX(value: Double): Self = this.set("lStickX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLStickY(value: Double): Self = this.set("lStickY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRStickX(value: Double): Self = this.set("rStickX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRStickY(value: Double): Self = this.set("rStickY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpTouch(value: Boolean): Self = this.set("tpTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTpValidity(value: Double): Self = this.set("tpValidity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdate(value: () => WiiuGamePad): Self = this.set("update", js.Any.fromFunction0(value))
  }
}
