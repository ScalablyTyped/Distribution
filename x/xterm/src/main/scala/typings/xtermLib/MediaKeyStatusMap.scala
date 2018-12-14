package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeyStatusMap extends js.Object {
  val size: scala.Double = js.native
  def forEach(callback: js.Function): scala.Unit = js.native
  def forEach(callback: js.Function, thisArg: js.Any): scala.Unit = js.native
  def get(): MediaKeyStatus = js.native
  def get(
    keyId: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  ): MediaKeyStatus = js.native
  def has(): scala.Boolean = js.native
  def has(
    keyId: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  ): scala.Boolean = js.native
}

@JSGlobal("MediaKeyStatusMap")
@js.native
object MediaKeyStatusMap
  extends org.scalablytyped.runtime.Instantiable0[MediaKeyStatusMap]

