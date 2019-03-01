package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions extends js.Object {
  var BaseIndentSize: js.UndefOr[scala.Double] = js.undefined
  var ConvertTabsToSpaces: scala.Boolean
  var IndentSize: scala.Double
  var IndentStyle: IndentStyle
  var NewLineCharacter: java.lang.String
  var TabSize: scala.Double
}

object EditorOptions {
  @scala.inline
  def apply(
    ConvertTabsToSpaces: scala.Boolean,
    IndentSize: scala.Double,
    IndentStyle: IndentStyle,
    NewLineCharacter: java.lang.String,
    TabSize: scala.Double,
    BaseIndentSize: scala.Int | scala.Double = null
  ): EditorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ConvertTabsToSpaces")(ConvertTabsToSpaces)
    __obj.updateDynamic("IndentSize")(IndentSize)
    __obj.updateDynamic("IndentStyle")(IndentStyle)
    __obj.updateDynamic("NewLineCharacter")(NewLineCharacter)
    __obj.updateDynamic("TabSize")(TabSize)
    if (BaseIndentSize != null) __obj.updateDynamic("BaseIndentSize")(BaseIndentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
}

