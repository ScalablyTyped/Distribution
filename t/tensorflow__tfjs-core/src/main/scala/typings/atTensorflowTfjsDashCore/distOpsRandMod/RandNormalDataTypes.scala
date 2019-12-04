package typings.atTensorflowTfjsDashCore.distOpsRandMod

import typings.std.Float32Array
import typings.std.Int32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandNormalDataTypes extends js.Object {
  var float32: Float32Array
  var int32: Int32Array
}

object RandNormalDataTypes {
  @scala.inline
  def apply(float32: Float32Array, int32: Int32Array): RandNormalDataTypes = {
    val __obj = js.Dynamic.literal(float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RandNormalDataTypes]
  }
}

