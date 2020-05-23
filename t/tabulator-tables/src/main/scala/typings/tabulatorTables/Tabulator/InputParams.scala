package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputParams
  extends SharedEditorParams
     with _EditorParams {
  /**Changes input type to 'search' and shows an 'X' clear button to clear the cell value easily */
  var search: js.UndefOr[Boolean] = js.undefined
}

object InputParams {
  @scala.inline
  def apply(
    elementAttributes: JSONRecord = null,
    mask: String = null,
    maskAutoFill: js.UndefOr[Boolean] = js.undefined,
    maskLetterChar: String = null,
    maskNumberChar: String = null,
    maskWildcardChar: String = null,
    search: js.UndefOr[Boolean] = js.undefined
  ): InputParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskAutoFill)) __obj.updateDynamic("maskAutoFill")(maskAutoFill.get.asInstanceOf[js.Any])
    if (maskLetterChar != null) __obj.updateDynamic("maskLetterChar")(maskLetterChar.asInstanceOf[js.Any])
    if (maskNumberChar != null) __obj.updateDynamic("maskNumberChar")(maskNumberChar.asInstanceOf[js.Any])
    if (maskWildcardChar != null) __obj.updateDynamic("maskWildcardChar")(maskWildcardChar.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputParams]
  }
}

