package typings.tabulatorTables.Tabulator

import typings.std.HTMLElement
import typings.tabulatorTables.tabulatorTablesBooleans.`true`
import typings.tabulatorTables.tabulatorTablesStrings.editor
import typings.tabulatorTables.tabulatorTablesStrings.hybrid
import typings.tabulatorTables.tabulatorTablesStrings.table
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _EditorParams extends js.Object

object _EditorParams {
  @scala.inline
  def TextAreaParams(
    elementAttributes: JSONRecord = null,
    mask: String = null,
    maskAutoFill: js.UndefOr[Boolean] = js.undefined,
    maskLetterChar: String = null,
    maskNumberChar: String = null,
    maskWildcardChar: String = null,
    verticalNavigation: editor | table | hybrid = null
  ): _EditorParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskAutoFill)) __obj.updateDynamic("maskAutoFill")(maskAutoFill.asInstanceOf[js.Any])
    if (maskLetterChar != null) __obj.updateDynamic("maskLetterChar")(maskLetterChar.asInstanceOf[js.Any])
    if (maskNumberChar != null) __obj.updateDynamic("maskNumberChar")(maskNumberChar.asInstanceOf[js.Any])
    if (maskWildcardChar != null) __obj.updateDynamic("maskWildcardChar")(maskWildcardChar.asInstanceOf[js.Any])
    if (verticalNavigation != null) __obj.updateDynamic("verticalNavigation")(verticalNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EditorParams]
  }
  @scala.inline
  def NumberParams(
    elementAttributes: JSONRecord = null,
    mask: String = null,
    maskAutoFill: js.UndefOr[Boolean] = js.undefined,
    maskLetterChar: String = null,
    maskNumberChar: String = null,
    maskWildcardChar: String = null,
    max: Int | Double = null,
    min: Int | Double = null,
    step: Int | Double = null,
    verticalNavigation: editor | table = null
  ): _EditorParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskAutoFill)) __obj.updateDynamic("maskAutoFill")(maskAutoFill.asInstanceOf[js.Any])
    if (maskLetterChar != null) __obj.updateDynamic("maskLetterChar")(maskLetterChar.asInstanceOf[js.Any])
    if (maskNumberChar != null) __obj.updateDynamic("maskNumberChar")(maskNumberChar.asInstanceOf[js.Any])
    if (maskWildcardChar != null) __obj.updateDynamic("maskWildcardChar")(maskWildcardChar.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (verticalNavigation != null) __obj.updateDynamic("verticalNavigation")(verticalNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EditorParams]
  }
  @scala.inline
  def SelectParams(
    values: `true` | (js.Array[SelectParamsGroup | String]) | JSONRecord | String,
    defaultValue: String = null,
    elementAttributes: JSONRecord = null,
    listItemFormatter: (/* value */ String, /* text */ String) => String = null,
    mask: String = null,
    maskAutoFill: js.UndefOr[Boolean] = js.undefined,
    maskLetterChar: String = null,
    maskNumberChar: String = null,
    maskWildcardChar: String = null,
    verticalNavigation: editor | table | hybrid = null
  ): _EditorParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (listItemFormatter != null) __obj.updateDynamic("listItemFormatter")(js.Any.fromFunction2(listItemFormatter))
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskAutoFill)) __obj.updateDynamic("maskAutoFill")(maskAutoFill.asInstanceOf[js.Any])
    if (maskLetterChar != null) __obj.updateDynamic("maskLetterChar")(maskLetterChar.asInstanceOf[js.Any])
    if (maskNumberChar != null) __obj.updateDynamic("maskNumberChar")(maskNumberChar.asInstanceOf[js.Any])
    if (maskWildcardChar != null) __obj.updateDynamic("maskWildcardChar")(maskWildcardChar.asInstanceOf[js.Any])
    if (verticalNavigation != null) __obj.updateDynamic("verticalNavigation")(verticalNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EditorParams]
  }
  @scala.inline
  def CheckboxParams(
    elementAttributes: JSONRecord = null,
    indeterminateValue: String = null,
    mask: String = null,
    maskAutoFill: js.UndefOr[Boolean] = js.undefined,
    maskLetterChar: String = null,
    maskNumberChar: String = null,
    maskWildcardChar: String = null,
    tristate: js.UndefOr[Boolean] = js.undefined
  ): _EditorParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (indeterminateValue != null) __obj.updateDynamic("indeterminateValue")(indeterminateValue.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskAutoFill)) __obj.updateDynamic("maskAutoFill")(maskAutoFill.asInstanceOf[js.Any])
    if (maskLetterChar != null) __obj.updateDynamic("maskLetterChar")(maskLetterChar.asInstanceOf[js.Any])
    if (maskNumberChar != null) __obj.updateDynamic("maskNumberChar")(maskNumberChar.asInstanceOf[js.Any])
    if (maskWildcardChar != null) __obj.updateDynamic("maskWildcardChar")(maskWildcardChar.asInstanceOf[js.Any])
    if (!js.isUndefined(tristate)) __obj.updateDynamic("tristate")(tristate.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EditorParams]
  }
  @scala.inline
  def AutoCompleteParams(
    values: `true` | js.Array[String] | JSONRecord | String,
    allowEmpty: js.UndefOr[Boolean] = js.undefined,
    defaultValue: String = null,
    elementAttributes: JSONRecord = null,
    emptyPlaceholder: String | HTMLElement = null,
    freetext: js.UndefOr[Boolean] = js.undefined,
    listItemFormatter: (/* value */ String, /* text */ String) => String = null,
    mask: String = null,
    maskAutoFill: js.UndefOr[Boolean] = js.undefined,
    maskLetterChar: String = null,
    maskNumberChar: String = null,
    maskWildcardChar: String = null,
    searchFunc: (/* term */ String, /* values */ js.Array[String]) => js.Array[String] | js.Promise[js.Array[String]] = null,
    searchingPlaceholder: String | HTMLElement = null,
    showListOnEmpty: js.UndefOr[Boolean] = js.undefined,
    verticalNavigation: editor | table | hybrid = null
  ): _EditorParams = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    if (!js.isUndefined(allowEmpty)) __obj.updateDynamic("allowEmpty")(allowEmpty.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (emptyPlaceholder != null) __obj.updateDynamic("emptyPlaceholder")(emptyPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(freetext)) __obj.updateDynamic("freetext")(freetext.asInstanceOf[js.Any])
    if (listItemFormatter != null) __obj.updateDynamic("listItemFormatter")(js.Any.fromFunction2(listItemFormatter))
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskAutoFill)) __obj.updateDynamic("maskAutoFill")(maskAutoFill.asInstanceOf[js.Any])
    if (maskLetterChar != null) __obj.updateDynamic("maskLetterChar")(maskLetterChar.asInstanceOf[js.Any])
    if (maskNumberChar != null) __obj.updateDynamic("maskNumberChar")(maskNumberChar.asInstanceOf[js.Any])
    if (maskWildcardChar != null) __obj.updateDynamic("maskWildcardChar")(maskWildcardChar.asInstanceOf[js.Any])
    if (searchFunc != null) __obj.updateDynamic("searchFunc")(js.Any.fromFunction2(searchFunc))
    if (searchingPlaceholder != null) __obj.updateDynamic("searchingPlaceholder")(searchingPlaceholder.asInstanceOf[js.Any])
    if (!js.isUndefined(showListOnEmpty)) __obj.updateDynamic("showListOnEmpty")(showListOnEmpty.asInstanceOf[js.Any])
    if (verticalNavigation != null) __obj.updateDynamic("verticalNavigation")(verticalNavigation.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EditorParams]
  }
  @scala.inline
  def InputParams(
    elementAttributes: JSONRecord = null,
    mask: String = null,
    maskAutoFill: js.UndefOr[Boolean] = js.undefined,
    maskLetterChar: String = null,
    maskNumberChar: String = null,
    maskWildcardChar: String = null,
    search: js.UndefOr[Boolean] = js.undefined
  ): _EditorParams = {
    val __obj = js.Dynamic.literal()
    if (elementAttributes != null) __obj.updateDynamic("elementAttributes")(elementAttributes.asInstanceOf[js.Any])
    if (mask != null) __obj.updateDynamic("mask")(mask.asInstanceOf[js.Any])
    if (!js.isUndefined(maskAutoFill)) __obj.updateDynamic("maskAutoFill")(maskAutoFill.asInstanceOf[js.Any])
    if (maskLetterChar != null) __obj.updateDynamic("maskLetterChar")(maskLetterChar.asInstanceOf[js.Any])
    if (maskNumberChar != null) __obj.updateDynamic("maskNumberChar")(maskNumberChar.asInstanceOf[js.Any])
    if (maskWildcardChar != null) __obj.updateDynamic("maskWildcardChar")(maskWildcardChar.asInstanceOf[js.Any])
    if (!js.isUndefined(search)) __obj.updateDynamic("search")(search.asInstanceOf[js.Any])
    __obj.asInstanceOf[_EditorParams]
  }
}

