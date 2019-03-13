package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnEnterRule extends js.Object {
  /**
  		 * The action to execute.
  		 */
  var action: EnterAction
  /**
  		 * This rule will only execute if the text after the cursor matches this regular expression.
  		 */
  var afterText: js.UndefOr[stdLib.RegExp] = js.undefined
  /**
  		 * This rule will only execute if the text before the cursor matches this regular expression.
  		 */
  var beforeText: stdLib.RegExp
}

object OnEnterRule {
  @scala.inline
  def apply(action: EnterAction, beforeText: stdLib.RegExp, afterText: stdLib.RegExp = null): OnEnterRule = {
    val __obj = js.Dynamic.literal(action = action, beforeText = beforeText)
    if (afterText != null) __obj.updateDynamic("afterText")(afterText)
    __obj.asInstanceOf[OnEnterRule]
  }
}

