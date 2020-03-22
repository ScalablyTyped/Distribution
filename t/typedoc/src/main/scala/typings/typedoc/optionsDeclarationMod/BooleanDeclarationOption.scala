package typings.typedoc.optionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BooleanDeclarationOption
  extends DeclarationOptionBase
     with _DeclarationOption
     with _KeyToDeclaration[js.Any] {
  var defaultValue: js.UndefOr[Boolean] = js.undefined
  @JSName("type")
  var type_BooleanDeclarationOption: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean
}

object BooleanDeclarationOption {
  @scala.inline
  def apply(
    help: String,
    name: String,
    `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Boolean,
    defaultValue: js.UndefOr[Boolean] = js.undefined,
    scope: ParameterScope = null,
    short: String = null
  ): BooleanDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[BooleanDeclarationOption]
  }
}

