package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrackets extends js.Object {
  /**
  			 * This property is deprecated and will be **ignored** from
  			 * the editor.
  			 * @deprecated
  			 */
  var brackets: js.UndefOr[js.Any] = js.undefined
  /**
  			 * This property is deprecated and not fully supported anymore by
  			 * the editor (scope and lineStart are ignored).
  			 * Use the autoClosingPairs property in the language configuration file instead.
  			 * @deprecated
  			 */
  var docComment: js.UndefOr[AnonClose] = js.undefined
}

object AnonBrackets {
  @scala.inline
  def apply(brackets: js.Any = null, docComment: AnonClose = null): AnonBrackets = {
    val __obj = js.Dynamic.literal()
    if (brackets != null) __obj.updateDynamic("brackets")(brackets.asInstanceOf[js.Any])
    if (docComment != null) __obj.updateDynamic("docComment")(docComment.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrackets]
  }
}

