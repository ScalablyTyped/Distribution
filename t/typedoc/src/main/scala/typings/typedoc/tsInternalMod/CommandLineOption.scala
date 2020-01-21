package typings.typedoc.tsInternalMod

import typings.std.Map
import typings.typedoc.typedocStrings.boolean
import typings.typedoc.typedocStrings.list
import typings.typedoc.typedocStrings.number
import typings.typedoc.typedocStrings.object_
import typings.typedoc.typedocStrings.string
import typings.typescript.mod.DiagnosticMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.typedoc.tsInternalMod.CommandLineOptionOfCustomType
  - typings.typedoc.tsInternalMod.CommandLineOptionOfPrimitiveType
  - typings.typedoc.tsInternalMod.TsConfigOnlyOption
  - typings.typedoc.tsInternalMod.CommandLineOptionOfListType
*/
trait CommandLineOption extends js.Object

object CommandLineOption {
  @scala.inline
  def CommandLineOptionOfCustomType(
    name: String,
    `type`: Map[Double | String, _],
    description: DiagnosticMessage = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    isFilePath: js.UndefOr[Boolean] = js.undefined,
    isTSConfigOnly: js.UndefOr[Boolean] = js.undefined,
    paramType: DiagnosticMessage = null,
    shortName: String = null
  ): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilePath)) __obj.updateDynamic("isFilePath")(isFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(isTSConfigOnly)) __obj.updateDynamic("isTSConfigOnly")(isTSConfigOnly.asInstanceOf[js.Any])
    if (paramType != null) __obj.updateDynamic("paramType")(paramType.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def CommandLineOptionOfPrimitiveType(
    name: String,
    `type`: string | number | boolean,
    description: DiagnosticMessage = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    isFilePath: js.UndefOr[Boolean] = js.undefined,
    isTSConfigOnly: js.UndefOr[Boolean] = js.undefined,
    paramType: DiagnosticMessage = null,
    shortName: String = null
  ): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilePath)) __obj.updateDynamic("isFilePath")(isFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(isTSConfigOnly)) __obj.updateDynamic("isTSConfigOnly")(isTSConfigOnly.asInstanceOf[js.Any])
    if (paramType != null) __obj.updateDynamic("paramType")(paramType.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def TsConfigOnlyOption(
    name: String,
    `type`: object_,
    description: DiagnosticMessage = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    isFilePath: js.UndefOr[Boolean] = js.undefined,
    isTSConfigOnly: js.UndefOr[Boolean] = js.undefined,
    paramType: DiagnosticMessage = null,
    shortName: String = null
  ): CommandLineOption = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilePath)) __obj.updateDynamic("isFilePath")(isFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(isTSConfigOnly)) __obj.updateDynamic("isTSConfigOnly")(isTSConfigOnly.asInstanceOf[js.Any])
    if (paramType != null) __obj.updateDynamic("paramType")(paramType.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
  @scala.inline
  def CommandLineOptionOfListType(
    element: CommandLineOptionOfCustomType | CommandLineOptionOfPrimitiveType,
    name: String,
    `type`: list,
    description: DiagnosticMessage = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    isFilePath: js.UndefOr[Boolean] = js.undefined,
    isTSConfigOnly: js.UndefOr[Boolean] = js.undefined,
    paramType: DiagnosticMessage = null,
    shortName: String = null
  ): CommandLineOption = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilePath)) __obj.updateDynamic("isFilePath")(isFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(isTSConfigOnly)) __obj.updateDynamic("isTSConfigOnly")(isTSConfigOnly.asInstanceOf[js.Any])
    if (paramType != null) __obj.updateDynamic("paramType")(paramType.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOption]
  }
}

