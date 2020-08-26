package typings.winrt.Windows.Devices.Sensors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISensorRotationMatrix extends js.Object {
  var m11: Double = js.native
  var m12: Double = js.native
  var m13: Double = js.native
  var m21: Double = js.native
  var m22: Double = js.native
  var m23: Double = js.native
  var m31: Double = js.native
  var m32: Double = js.native
  var m33: Double = js.native
}

object ISensorRotationMatrix {
  @scala.inline
  def apply(
    m11: Double,
    m12: Double,
    m13: Double,
    m21: Double,
    m22: Double,
    m23: Double,
    m31: Double,
    m32: Double,
    m33: Double
  ): ISensorRotationMatrix = {
    val __obj = js.Dynamic.literal(m11 = m11.asInstanceOf[js.Any], m12 = m12.asInstanceOf[js.Any], m13 = m13.asInstanceOf[js.Any], m21 = m21.asInstanceOf[js.Any], m22 = m22.asInstanceOf[js.Any], m23 = m23.asInstanceOf[js.Any], m31 = m31.asInstanceOf[js.Any], m32 = m32.asInstanceOf[js.Any], m33 = m33.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISensorRotationMatrix]
  }
  @scala.inline
  implicit class ISensorRotationMatrixOps[Self <: ISensorRotationMatrix] (val x: Self) extends AnyVal {
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
    def setM11(value: Double): Self = this.set("m11", value.asInstanceOf[js.Any])
    @scala.inline
    def setM12(value: Double): Self = this.set("m12", value.asInstanceOf[js.Any])
    @scala.inline
    def setM13(value: Double): Self = this.set("m13", value.asInstanceOf[js.Any])
    @scala.inline
    def setM21(value: Double): Self = this.set("m21", value.asInstanceOf[js.Any])
    @scala.inline
    def setM22(value: Double): Self = this.set("m22", value.asInstanceOf[js.Any])
    @scala.inline
    def setM23(value: Double): Self = this.set("m23", value.asInstanceOf[js.Any])
    @scala.inline
    def setM31(value: Double): Self = this.set("m31", value.asInstanceOf[js.Any])
    @scala.inline
    def setM32(value: Double): Self = this.set("m32", value.asInstanceOf[js.Any])
    @scala.inline
    def setM33(value: Double): Self = this.set("m33", value.asInstanceOf[js.Any])
  }
  
}

