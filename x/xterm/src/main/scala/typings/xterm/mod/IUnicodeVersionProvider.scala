package typings.xterm.mod

import typings.xterm.xtermNumbers.`0`
import typings.xterm.xtermNumbers.`1`
import typings.xterm.xtermNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IUnicodeVersionProvider extends js.Object {
  /**
    * String indicating the Unicode version provided.
    */
  val version: String
  /**
    * Unicode version dependent wcwidth implementation.
    */
  def wcwidth(codepoint: Double): `0` | `1` | `2`
}

object IUnicodeVersionProvider {
  @scala.inline
  def apply(version: String, wcwidth: Double => `0` | `1` | `2`): IUnicodeVersionProvider = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any], wcwidth = js.Any.fromFunction1(wcwidth))
    __obj.asInstanceOf[IUnicodeVersionProvider]
  }
}

