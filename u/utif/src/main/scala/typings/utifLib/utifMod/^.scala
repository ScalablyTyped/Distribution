package typings
package utifLib.utifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utif", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(buffer: nodeLib.Buffer): js.Array[IFD] = js.native
  def decode(buffer: stdLib.ArrayBuffer): js.Array[IFD] = js.native
  def decodeImage(buffer: nodeLib.Buffer, ifd: IFD): scala.Unit = js.native
  def decodeImage(buffer: stdLib.ArrayBuffer, ifd: IFD): scala.Unit = js.native
  def encode(ifds: js.Array[IFD]): stdLib.ArrayBuffer = js.native
  def encodeImage(rgba: stdLib.Uint8Array, w: scala.Double, h: scala.Double): stdLib.ArrayBuffer = js.native
  def encodeImage(rgba: stdLib.Uint8Array, w: scala.Double, h: scala.Double, metadata: IFD): stdLib.ArrayBuffer = js.native
  def replaceIMG(): scala.Unit = js.native
  def toRGBA8(ifd: IFD): stdLib.Uint8Array = js.native
}

