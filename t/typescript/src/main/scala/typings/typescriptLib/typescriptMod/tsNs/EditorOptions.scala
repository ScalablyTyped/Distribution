package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions extends js.Object {
  var BaseIndentSize: js.UndefOr[scala.Double] = js.undefined
  var ConvertTabsToSpaces: scala.Boolean
  var IndentSize: scala.Double
  var IndentStyle: typescriptLib.typescriptMod.tsNs.IndentStyle
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
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces, IndentSize = IndentSize, IndentStyle = IndentStyle, NewLineCharacter = NewLineCharacter, TabSize = TabSize)
    if (BaseIndentSize != null) __obj.updateDynamic("BaseIndentSize")(BaseIndentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
}

