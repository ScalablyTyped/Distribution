package typings.wanakana.wanakanaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wanakana.wanakanaBooleans.`true`
  - typings.wanakana.wanakanaBooleans.`false`
  - typings.wanakana.wanakanaStrings.toHiragana
  - typings.wanakana.wanakanaStrings.toKatakana
*/
trait IMEModes extends js.Object

object IMEModes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typings.wanakana.wanakanaBooleans.`false` = this.cast(false)
  @scala.inline
  def toHiragana: typings.wanakana.wanakanaStrings.toHiragana = this.cast("toHiragana")
  @scala.inline
  def toKatakana: typings.wanakana.wanakanaStrings.toKatakana = this.cast("toKatakana")
  @scala.inline
  def `true`: typings.wanakana.wanakanaBooleans.`true` = this.cast(true)
}

