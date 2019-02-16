package typings
package utifLib.utifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utif", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(buffer: nodeLib.Buffer): js.Array[utifLib.utifMod.IFD] = js.native
  def decode(buffer: stdLib.ArrayBuffer): js.Array[utifLib.utifMod.IFD] = js.native
  def decodeImage(buffer: nodeLib.Buffer, ifd: utifLib.utifMod.IFD): scala.Unit = js.native
  def decodeImage(buffer: stdLib.ArrayBuffer, ifd: utifLib.utifMod.IFD): scala.Unit = js.native
  def encode(ifds: js.Array[utifLib.utifMod.IFD]): stdLib.ArrayBuffer = js.native
  def encodeImage(rgba: stdLib.Uint8Array, w: scala.Double, h: scala.Double): stdLib.ArrayBuffer = js.native
  def encodeImage(rgba: stdLib.Uint8Array, w: scala.Double, h: scala.Double, metadata: utifLib.utifMod.IFD): stdLib.ArrayBuffer = js.native
  def replaceIMG(): scala.Unit = js.native
  def toRGBA8(ifd: utifLib.utifMod.IFD): stdLib.Uint8Array = js.native
}

