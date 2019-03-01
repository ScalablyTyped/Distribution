package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesCtrParams extends Algorithm {
  var counter: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  var length: scala.Double
}

object AesCtrParams {
  @scala.inline
  def apply(
    counter: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer,
    length: scala.Double,
    name: java.lang.String
  ): AesCtrParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("counter")(counter.asInstanceOf[js.Any])
    __obj.updateDynamic("length")(length)
    __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[AesCtrParams]
  }
}

