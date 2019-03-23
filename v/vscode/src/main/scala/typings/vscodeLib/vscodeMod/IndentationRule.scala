package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndentationRule extends js.Object {
  /**
  		 * If a line matches this pattern, then all the lines after it should be unindented once (until another rule matches).
  		 */
  var decreaseIndentPattern: stdLib.RegExp
  /**
  		 * If a line matches this pattern, then all the lines after it should be indented once (until another rule matches).
  		 */
  var increaseIndentPattern: stdLib.RegExp
  /**
  		 * If a line matches this pattern, then **only the next line** after it should be indented once.
  		 */
  var indentNextLinePattern: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
  		 * If a line matches this pattern, then its indentation should not be changed and it should not be evaluated against the other rules.
  		 */
  var unIndentedLinePattern: js.UndefOr[stdLib.RegExp] = js.undefined
}

object IndentationRule {
  @scala.inline
  def apply(
    decreaseIndentPattern: stdLib.RegExp,
    increaseIndentPattern: stdLib.RegExp,
    indentNextLinePattern: stdLib.RegExp = null,
    unIndentedLinePattern: stdLib.RegExp = null
  ): IndentationRule = {
    val __obj = js.Dynamic.literal(decreaseIndentPattern = decreaseIndentPattern, increaseIndentPattern = increaseIndentPattern)
    if (indentNextLinePattern != null) __obj.updateDynamic("indentNextLinePattern")(indentNextLinePattern)
    if (unIndentedLinePattern != null) __obj.updateDynamic("unIndentedLinePattern")(unIndentedLinePattern)
    __obj.asInstanceOf[IndentationRule]
  }
}

