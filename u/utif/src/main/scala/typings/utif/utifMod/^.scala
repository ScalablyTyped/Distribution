package typings.utif.utifMod

import typings.node.Buffer
import typings.std.ArrayBuffer
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utif", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(buffer: Buffer): js.Array[IFD] = js.native
  def decode(buffer: ArrayBuffer): js.Array[IFD] = js.native
  def decodeImage(buffer: Buffer, ifd: IFD): Unit = js.native
  def decodeImage(buffer: ArrayBuffer, ifd: IFD): Unit = js.native
  def encode(ifds: js.Array[IFD]): ArrayBuffer = js.native
  def encodeImage(rgba: Uint8Array, w: Double, h: Double): ArrayBuffer = js.native
  def encodeImage(rgba: Uint8Array, w: Double, h: Double, metadata: IFD): ArrayBuffer = js.native
  def replaceIMG(): Unit = js.native
  def toRGBA8(ifd: IFD): Uint8Array = js.native
}

