package typings.windows1251.mod

import typings.windows1251.AnonMode
import typings.windows1251.AnonModeDecoderMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait windows1251 extends js.Object {
  def decode(text: String): String = js.native
  def decode(text: String, options: AnonModeDecoderMode): String = js.native
  def encode(input: String): String = js.native
  def encode(input: String, options: AnonMode): String = js.native
}

