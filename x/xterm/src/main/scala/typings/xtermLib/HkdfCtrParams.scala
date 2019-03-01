package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HkdfCtrParams extends Algorithm {
  var context: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  var hash: java.lang.String | Algorithm
  var label: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
}

object HkdfCtrParams {
  @scala.inline
  def apply(
    context: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer,
    hash: java.lang.String | Algorithm,
    label: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer,
    name: java.lang.String
  ): HkdfCtrParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[HkdfCtrParams]
  }
}

