package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesGcmParams extends Algorithm {
  var additionalData: js.UndefOr[
    stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  ] = js.undefined
  var iv: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  var tagLength: js.UndefOr[scala.Double] = js.undefined
}

object AesGcmParams {
  @scala.inline
  def apply(
    iv: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer,
    name: java.lang.String,
    additionalData: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer = null,
    tagLength: scala.Int | scala.Double = null
  ): AesGcmParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    if (additionalData != null) __obj.updateDynamic("additionalData")(additionalData.asInstanceOf[js.Any])
    if (tagLength != null) __obj.updateDynamic("tagLength")(tagLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesGcmParams]
  }
}

