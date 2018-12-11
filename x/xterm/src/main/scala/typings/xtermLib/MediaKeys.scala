package typings
package xtermLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaKeys extends js.Object {
  def createSession(): MediaKeySession = js.native
  def createSession(sessionType: MediaKeySessionType): MediaKeySession = js.native
  def setServerCertificate(): js.Promise[scala.Unit] = js.native
  def setServerCertificate(
    serverCertificate: stdLib.Int8Array | stdLib.Int16Array | stdLib.Int32Array | stdLib.Uint8Array | stdLib.Uint16Array | stdLib.Uint32Array | stdLib.Uint8ClampedArray | stdLib.Float32Array | stdLib.Float64Array | stdLib.DataView | stdLib.ArrayBuffer
  ): js.Promise[scala.Unit] = js.native
}

@JSGlobal("MediaKeys")
@js.native
object MediaKeys
  extends ScalablyTyped.runtime.Instantiable0[MediaKeys]

