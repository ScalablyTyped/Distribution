package typings
package wifLib.wifMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wif", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def decode(string: java.lang.String, version: scala.Double): wifLib.wifMod.WIFReturn = js.native
  def decodeRaw(buffer: nodeLib.Buffer): wifLib.wifMod.WIFReturn = js.native
  def decodeRaw(buffer: nodeLib.Buffer, version: scala.Double): wifLib.wifMod.WIFReturn = js.native
  def encode(version: scala.Double, privateKey: nodeLib.Buffer, compressed: scala.Boolean): java.lang.String = js.native
  def encodeRaw(version: scala.Double, privateKey: nodeLib.Buffer, compressed: scala.Boolean): nodeLib.Buffer = js.native
}

