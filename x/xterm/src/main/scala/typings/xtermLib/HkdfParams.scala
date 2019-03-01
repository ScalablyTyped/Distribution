package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HkdfParams extends Algorithm {
  var hash: HashAlgorithmIdentifier
  var info: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  var salt: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
}

object HkdfParams {
  @scala.inline
  def apply(
    hash: HashAlgorithmIdentifier,
    info: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer,
    name: java.lang.String,
    salt: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  ): HkdfParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[HkdfParams]
  }
}

