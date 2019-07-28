package typings.wif.wifMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wif", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(string: String, version: Double): WIFReturn = js.native
  def decodeRaw(buffer: Buffer): WIFReturn = js.native
  def decodeRaw(buffer: Buffer, version: Double): WIFReturn = js.native
  def encode(version: Double, privateKey: Buffer, compressed: Boolean): String = js.native
  def encodeRaw(version: Double, privateKey: Buffer, compressed: Boolean): Buffer = js.native
}

