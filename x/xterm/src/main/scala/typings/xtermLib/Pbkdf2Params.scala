package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pbkdf2Params extends Algorithm {
  var hash: HashAlgorithmIdentifier
  var iterations: scala.Double
  var salt: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
}

object Pbkdf2Params {
  @scala.inline
  def apply(
    hash: HashAlgorithmIdentifier,
    iterations: scala.Double,
    name: java.lang.String,
    salt: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  ): Pbkdf2Params = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    __obj.updateDynamic("iterations")(iterations)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pbkdf2Params]
  }
}

