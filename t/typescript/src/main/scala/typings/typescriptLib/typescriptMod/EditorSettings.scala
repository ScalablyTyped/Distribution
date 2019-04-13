package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorSettings extends js.Object {
  var baseIndentSize: js.UndefOr[scala.Double] = js.undefined
  var convertTabsToSpaces: js.UndefOr[scala.Boolean] = js.undefined
  var indentSize: js.UndefOr[scala.Double] = js.undefined
  var indentStyle: js.UndefOr[IndentStyle] = js.undefined
  var newLineCharacter: js.UndefOr[java.lang.String] = js.undefined
  var tabSize: js.UndefOr[scala.Double] = js.undefined
}

object EditorSettings {
  @scala.inline
  def apply(
    baseIndentSize: scala.Int | scala.Double = null,
    convertTabsToSpaces: js.UndefOr[scala.Boolean] = js.undefined,
    indentSize: scala.Int | scala.Double = null,
    indentStyle: IndentStyle = null,
    newLineCharacter: java.lang.String = null,
    tabSize: scala.Int | scala.Double = null
  ): EditorSettings = {
    val __obj = js.Dynamic.literal()
    if (baseIndentSize != null) __obj.updateDynamic("baseIndentSize")(baseIndentSize.asInstanceOf[js.Any])
    if (!js.isUndefined(convertTabsToSpaces)) __obj.updateDynamic("convertTabsToSpaces")(convertTabsToSpaces)
    if (indentSize != null) __obj.updateDynamic("indentSize")(indentSize.asInstanceOf[js.Any])
    if (indentStyle != null) __obj.updateDynamic("indentStyle")(indentStyle)
    if (newLineCharacter != null) __obj.updateDynamic("newLineCharacter")(newLineCharacter)
    if (tabSize != null) __obj.updateDynamic("tabSize")(tabSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorSettings]
  }
}

