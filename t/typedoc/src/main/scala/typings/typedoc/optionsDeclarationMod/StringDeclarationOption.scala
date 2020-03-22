package typings.typedoc.optionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringDeclarationOption
  extends DeclarationOptionBase
     with _DeclarationOption
     with _KeyToDeclaration[js.Any] {
  var defaultValue: js.UndefOr[String] = js.undefined
  var hint: js.UndefOr[ParameterHint] = js.undefined
  @JSName("type")
  var type_StringDeclarationOption: js.UndefOr[typings.typedoc.optionsDeclarationMod.ParameterType.String] = js.undefined
}

object StringDeclarationOption {
  @scala.inline
  def apply(
    help: String,
    name: String,
    defaultValue: String = null,
    hint: ParameterHint = null,
    scope: ParameterScope = null,
    short: String = null,
    `type`: typings.typedoc.optionsDeclarationMod.ParameterType.String = null
  ): StringDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringDeclarationOption]
  }
}

