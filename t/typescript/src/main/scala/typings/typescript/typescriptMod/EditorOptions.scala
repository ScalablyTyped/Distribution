package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorOptions extends js.Object {
  var BaseIndentSize: js.UndefOr[Double] = js.undefined
  var ConvertTabsToSpaces: Boolean
  var IndentSize: Double
  var IndentStyle: typings.typescript.typescriptMod.IndentStyle
  var NewLineCharacter: String
  var TabSize: Double
}

object EditorOptions {
  @scala.inline
  def apply(
    ConvertTabsToSpaces: Boolean,
    IndentSize: Double,
    IndentStyle: IndentStyle,
    NewLineCharacter: String,
    TabSize: Double,
    BaseIndentSize: Int | Double = null
  ): EditorOptions = {
    val __obj = js.Dynamic.literal(ConvertTabsToSpaces = ConvertTabsToSpaces.asInstanceOf[js.Any], IndentSize = IndentSize.asInstanceOf[js.Any], IndentStyle = IndentStyle.asInstanceOf[js.Any], NewLineCharacter = NewLineCharacter.asInstanceOf[js.Any], TabSize = TabSize.asInstanceOf[js.Any])
    if (BaseIndentSize != null) __obj.updateDynamic("BaseIndentSize")(BaseIndentSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorOptions]
  }
}

