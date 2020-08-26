package typings.tensorflowTfjsCore.randUtilMod

import typings.std.Float32Array
import typings.std.Int32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandGammaDataTypes extends js.Object {
  var float32: Float32Array = js.native
  var int32: Int32Array = js.native
}

object RandGammaDataTypes {
  @scala.inline
  def apply(float32: Float32Array, int32: Int32Array): RandGammaDataTypes = {
    val __obj = js.Dynamic.literal(float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandGammaDataTypes]
  }
  @scala.inline
  implicit class RandGammaDataTypesOps[Self <: RandGammaDataTypes] (val x: Self) extends AnyVal {
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
    def setFloat32(value: Float32Array): Self = this.set("float32", value.asInstanceOf[js.Any])
    @scala.inline
    def setInt32(value: Int32Array): Self = this.set("int32", value.asInstanceOf[js.Any])
  }
  
}

