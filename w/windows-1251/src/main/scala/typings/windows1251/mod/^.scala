package typings.windows1251.mod

import typings.windows1251.anon.Mode
import typings.windows1251.anon.ModeDecoderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("windows-1251", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var labels: js.Array[String] = js.native
  var version: String = js.native
  def decode(text: String): String = js.native
  def decode(text: String, options: ModeDecoderMode): String = js.native
  def encode(input: String): String = js.native
  def encode(input: String, options: Mode): String = js.native
}

