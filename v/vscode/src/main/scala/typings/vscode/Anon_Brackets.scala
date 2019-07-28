package typings.vscode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brackets extends js.Object {
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
  var docComment: js.UndefOr[Anon_Close] = js.undefined
}

object Anon_Brackets {
  @scala.inline
  def apply(brackets: js.Any = null, docComment: Anon_Close = null): Anon_Brackets = {
    val __obj = js.Dynamic.literal()
    if (brackets != null) __obj.updateDynamic("brackets")(brackets)
    if (docComment != null) __obj.updateDynamic("docComment")(docComment)
    __obj.asInstanceOf[Anon_Brackets]
  }
}

