package typings.tensorflowTfjsCore.distTypesMod

import typings.std.Float32Array
import typings.std.Int32Array
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeMap extends js.Object {
  var bool: Uint8Array
  var complex64: Float32Array
  var float32: Float32Array
  var int32: Int32Array
  var string: js.Array[String]
}

object DataTypeMap {
  @scala.inline
  def apply(
    bool: Uint8Array,
    complex64: Float32Array,
    float32: Float32Array,
    int32: Int32Array,
    string: js.Array[String]
  ): DataTypeMap = {
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], complex64 = complex64.asInstanceOf[js.Any], float32 = float32.asInstanceOf[js.Any], int32 = int32.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTypeMap]
  }
}

