package typings.typedoc.distLibTsDashInternalMod

import typings.typedoc.typedocStrings.boolean
import typings.typedoc.typedocStrings.number
import typings.typedoc.typedocStrings.string
import typings.typescript.typescriptMod.DiagnosticMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandLineOptionOfPrimitiveType
  extends CommandLineOptionBase
     with CommandLineOption {
  @JSName("type")
  var type_CommandLineOptionOfPrimitiveType: string | number | boolean
}

object CommandLineOptionOfPrimitiveType {
  @scala.inline
  def apply(
    name: String,
    `type`: string | number | boolean,
    description: DiagnosticMessage = null,
    experimental: js.UndefOr[Boolean] = js.undefined,
    isFilePath: js.UndefOr[Boolean] = js.undefined,
    isTSConfigOnly: js.UndefOr[Boolean] = js.undefined,
    paramType: DiagnosticMessage = null,
    shortName: String = null
  ): CommandLineOptionOfPrimitiveType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(experimental)) __obj.updateDynamic("experimental")(experimental.asInstanceOf[js.Any])
    if (!js.isUndefined(isFilePath)) __obj.updateDynamic("isFilePath")(isFilePath.asInstanceOf[js.Any])
    if (!js.isUndefined(isTSConfigOnly)) __obj.updateDynamic("isTSConfigOnly")(isTSConfigOnly.asInstanceOf[js.Any])
    if (paramType != null) __obj.updateDynamic("paramType")(paramType.asInstanceOf[js.Any])
    if (shortName != null) __obj.updateDynamic("shortName")(shortName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandLineOptionOfPrimitiveType]
  }
}

