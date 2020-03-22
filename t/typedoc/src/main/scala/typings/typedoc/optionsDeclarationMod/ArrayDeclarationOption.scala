package typings.typedoc.optionsDeclarationMod

import typings.typedoc.optionsDeclarationMod.ParameterType.Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayDeclarationOption
  extends DeclarationOptionBase
     with _DeclarationOption
     with _KeyToDeclaration[js.Any] {
  var defaultValue: js.UndefOr[js.Array[String]] = js.undefined
  @JSName("type")
  var type_ArrayDeclarationOption: Array
}

object ArrayDeclarationOption {
  @scala.inline
  def apply(
    help: String,
    name: String,
    `type`: Array,
    defaultValue: js.Array[String] = null,
    scope: ParameterScope = null,
    short: String = null
  ): ArrayDeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayDeclarationOption]
  }
}

