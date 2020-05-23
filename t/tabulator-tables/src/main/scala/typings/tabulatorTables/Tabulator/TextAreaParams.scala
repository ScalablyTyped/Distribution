package typings.tabulatorTables.Tabulator

import typings.tabulatorTables.tabulatorTablesStrings.editor
import typings.tabulatorTables.tabulatorTablesStrings.hybrid
import typings.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextAreaParams
  extends SharedEditorParams
     with _EditorParams {
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.undefined
}

object TextAreaParams {
  @scala.inline
  def apply(
    elementAttributes: JSONRecord = null,
    mask: String = null,
    maskAutoFill: js.UndefOr[Boolean] = js.undefined,
    maskLetterChar: String = null,
    maskNumberChar: String = null,
    maskWildcardChar: String = null,
    verticalNavigation: editor | table | hybrid = null
  ): TextAreaParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskAutoFill)) __obj.updateDynamic("maskAutoFill")(maskAutoFill.get.asInstanceOf[js.Any])
    if (maskLetterChar != null) __obj.updateDynamic("maskLetterChar")(maskLetterChar.asInstanceOf[js.Any])
    if (maskNumberChar != null) __obj.updateDynamic("maskNumberChar")(maskNumberChar.asInstanceOf[js.Any])
    if (maskWildcardChar != null) __obj.updateDynamic("maskWildcardChar")(maskWildcardChar.asInstanceOf[js.Any])
    if (verticalNavigation != null) __obj.updateDynamic("verticalNavigation")(verticalNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextAreaParams]
  }
}

