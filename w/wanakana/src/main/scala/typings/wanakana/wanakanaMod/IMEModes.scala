package typings.wanakana.wanakanaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.wanakana.wanakanaNumbers.`true`
  - typings.wanakana.wanakanaNumbers.`false`
  - typings.wanakana.wanakanaStrings.toHiragana
  - typings.wanakana.wanakanaStrings.toKatakana
*/
trait IMEModes extends js.Object

object IMEModes {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def `false`: typings.wanakana.wanakanaNumbers.`false` = this.cast(false)
  @scala.inline
  def toHiragana: typings.wanakana.wanakanaStrings.toHiragana = this.cast("toHiragana")
  @scala.inline
  def toKatakana: typings.wanakana.wanakanaStrings.toKatakana = this.cast("toKatakana")
  @scala.inline
  def `true`: typings.wanakana.wanakanaNumbers.`true` = this.cast(true)
}

