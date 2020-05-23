package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorSettings extends js.Object {
  var baseIndentSize: js.UndefOr[Double] = js.undefined
  var convertTabsToSpaces: js.UndefOr[Boolean] = js.undefined
  var indentSize: js.UndefOr[Double] = js.undefined
  var indentStyle: js.UndefOr[IndentStyle] = js.undefined
  var newLineCharacter: js.UndefOr[java.lang.String] = js.undefined
  var tabSize: js.UndefOr[Double] = js.undefined
  var trimTrailingWhitespace: js.UndefOr[Boolean] = js.undefined
}

object EditorSettings {
  @scala.inline
  def apply(
    baseIndentSize: js.UndefOr[Double] = js.undefined,
    convertTabsToSpaces: js.UndefOr[Boolean] = js.undefined,
    indentSize: js.UndefOr[Double] = js.undefined,
    indentStyle: IndentStyle = null,
    newLineCharacter: java.lang.String = null,
    tabSize: js.UndefOr[Double] = js.undefined,
    trimTrailingWhitespace: js.UndefOr[Boolean] = js.undefined
  ): EditorSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseIndentSize)) __obj.updateDynamic("baseIndentSize")(baseIndentSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(convertTabsToSpaces)) __obj.updateDynamic("convertTabsToSpaces")(convertTabsToSpaces.get.asInstanceOf[js.Any])
    if (!js.isUndefined(indentSize)) __obj.updateDynamic("indentSize")(indentSize.get.asInstanceOf[js.Any])
    if (indentStyle != null) __obj.updateDynamic("indentStyle")(indentStyle.asInstanceOf[js.Any])
    if (newLineCharacter != null) __obj.updateDynamic("newLineCharacter")(newLineCharacter.asInstanceOf[js.Any])
    if (!js.isUndefined(tabSize)) __obj.updateDynamic("tabSize")(tabSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trimTrailingWhitespace)) __obj.updateDynamic("trimTrailingWhitespace")(trimTrailingWhitespace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorSettings]
  }
}

