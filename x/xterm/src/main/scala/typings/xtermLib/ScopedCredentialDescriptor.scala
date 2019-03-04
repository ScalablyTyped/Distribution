package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopedCredentialDescriptor extends js.Object {
  var id: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer | scala.Null
  var transports: js.UndefOr[js.Array[Transport]] = js.undefined
  var `type`: ScopedCredentialType
}

object ScopedCredentialDescriptor {
  @scala.inline
  def apply(
    `type`: ScopedCredentialType,
    id: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer = null,
    transports: js.Array[Transport] = null
  ): ScopedCredentialDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (transports != null) __obj.updateDynamic("transports")(transports)
    __obj.asInstanceOf[ScopedCredentialDescriptor]
  }
}

