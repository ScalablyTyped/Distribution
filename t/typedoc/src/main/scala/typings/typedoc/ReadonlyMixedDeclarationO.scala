package typings.typedoc

import typings.typedoc.optionsDeclarationMod.ParameterScope
import typings.typedoc.optionsDeclarationMod.ParameterType.Mixed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.MixedDeclarationOption> */
trait ReadonlyMixedDeclarationO extends js.Object {
  val defaultValue: js.UndefOr[js.Any] = js.undefined
  val help: String
  val name: String
  val scope: js.UndefOr[ParameterScope] = js.undefined
  val short: js.UndefOr[String] = js.undefined
  val `type`: Mixed
}

object ReadonlyMixedDeclarationO {
  @scala.inline
  def apply(
    help: String,
    name: String,
    `type`: Mixed,
    defaultValue: js.Any = null,
    scope: ParameterScope = null,
    short: String = null
  ): ReadonlyMixedDeclarationO = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMixedDeclarationO]
  }
}

