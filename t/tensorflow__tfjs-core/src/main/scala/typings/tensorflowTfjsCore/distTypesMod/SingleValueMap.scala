package typings.tensorflowTfjsCore.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SingleValueMap extends js.Object {
  var bool: Boolean = js.native
  var complex64: Double = js.native
  var float32: Double = js.native
  var int32: Double = js.native
  var string: String = js.native
}

object SingleValueMap {
  @scala.inline
  def apply(bool: Boolean, complex64: Double, float32: Double, int32: Double, string: String): SingleValueMap = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], complex64 = complex64.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[SingleValueMap]
  }
  @scala.inline
  implicit class SingleValueMapOps[Self <: SingleValueMap] (val x: Self) extends AnyVal {
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
    def setBool(value: Boolean): Self = this.set("bool", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplex64(value: Double): Self = this.set("complex64", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloat32(value: Double): Self = this.set("float32", value.asInstanceOf[js.Any])
    @scala.inline
    def setInt32(value: Double): Self = this.set("int32", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
  }
  
}

