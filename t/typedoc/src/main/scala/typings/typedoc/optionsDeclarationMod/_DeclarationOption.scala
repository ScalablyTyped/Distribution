package typings.typedoc.optionsDeclarationMod

import typings.typedoc.optionsDeclarationMod.ParameterType.Array
import typings.typedoc.optionsDeclarationMod.ParameterType.Boolean
import typings.typedoc.optionsDeclarationMod.ParameterType.Mixed
import typings.typedoc.optionsDeclarationMod.ParameterType.Number
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _DeclarationOption extends js.Object

object _DeclarationOption {
  @scala.inline
  def MixedDeclarationOption(
    help: String,
    name: String,
    `type`: Mixed,
    defaultValue: js.Any = null,
    scope: ParameterScope = null,
    short: String = null
  ): _DeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeclarationOption]
  }
  @scala.inline
  def ArrayDeclarationOption(
    help: String,
    name: String,
    `type`: Array,
    defaultValue: js.Array[String] = null,
    scope: ParameterScope = null,
    short: String = null
  ): _DeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeclarationOption]
  }
  @scala.inline
  def BooleanDeclarationOption(
    help: String,
    name: String,
    `type`: Boolean,
    defaultValue: js.UndefOr[scala.Boolean] = js.undefined,
    scope: ParameterScope = null,
    short: String = null
  ): _DeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeclarationOption]
  }
  @scala.inline
  def NumberDeclarationOption(
    help: String,
    name: String,
    `type`: Number,
    defaultValue: Int | Double = null,
    scope: ParameterScope = null,
    short: String = null
  ): _DeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeclarationOption]
  }
  @scala.inline
  def StringDeclarationOption(
    help: String,
    name: String,
    defaultValue: String = null,
    hint: ParameterHint = null,
    scope: ParameterScope = null,
    short: String = null,
    `type`: typings.typedoc.optionsDeclarationMod.ParameterType.String = null
  ): _DeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[_DeclarationOption]
  }
}

