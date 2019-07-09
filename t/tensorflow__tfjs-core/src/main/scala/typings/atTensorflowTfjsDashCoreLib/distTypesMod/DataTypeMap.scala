package typings
package atTensorflowTfjsDashCoreLib.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTypeMap extends js.Object {
  var bool: stdLib.Uint8Array
  var complex64: stdLib.Float32Array
  var float32: stdLib.Float32Array
  var int32: stdLib.Int32Array
  var string: js.Array[java.lang.String]
}

object DataTypeMap {
  @scala.inline
  def apply(
    bool: stdLib.Uint8Array,
    complex64: stdLib.Float32Array,
    float32: stdLib.Float32Array,
    int32: stdLib.Int32Array,
    string: js.Array[java.lang.String]
  ): DataTypeMap = {
    val __obj = js.Dynamic.literal(bool = bool, complex64 = complex64, float32 = float32, int32 = int32, string = string)
  
    __obj.asInstanceOf[DataTypeMap]
  }
}

