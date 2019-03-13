package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnterAction extends js.Object {
  /**
  		 * Describes text to be appended after the new line and after the indentation.
  		 */
  var appendText: js.UndefOr[java.lang.String] = js.undefined
  /**
  		 * Describe what to do with the indentation.
  		 */
  var indentAction: IndentAction
  /**
  		 * Describes the number of characters to remove from the new line's indentation.
  		 */
  var removeText: js.UndefOr[scala.Double] = js.undefined
}

object EnterAction {
  @scala.inline
  def apply(
    indentAction: IndentAction,
    appendText: java.lang.String = null,
    removeText: scala.Int | scala.Double = null
  ): EnterAction = {
    val __obj = js.Dynamic.literal(indentAction = indentAction)
    if (appendText != null) __obj.updateDynamic("appendText")(appendText)
    if (removeText != null) __obj.updateDynamic("removeText")(removeText.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnterAction]
  }
}

