package typings.typedoc

import typings.typedoc.optionsDeclarationMod.ParameterHint
import typings.typedoc.optionsDeclarationMod.ParameterScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.StringDeclarationOption> */
trait ReadonlyStringDeclaration extends js.Object {
  val defaultValue: js.UndefOr[String] = js.undefined
  val help: String
  val hint: js.UndefOr[ParameterHint] = js.undefined
  val name: String
  val scope: js.UndefOr[ParameterScope] = js.undefined
  val short: js.UndefOr[String] = js.undefined
  val `type`: js.UndefOr[typings.typedoc.optionsDeclarationMod.ParameterType.String] = js.undefined
}

object ReadonlyStringDeclaration {
  @scala.inline
  def apply(
    help: String,
    name: String,
    defaultValue: String = null,
    hint: ParameterHint = null,
    scope: ParameterScope = null,
    short: String = null,
    `type`: typings.typedoc.optionsDeclarationMod.ParameterType.String = null
  ): ReadonlyStringDeclaration = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyStringDeclaration]
  }
}

