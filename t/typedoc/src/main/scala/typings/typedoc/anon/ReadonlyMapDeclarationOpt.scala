package typings.typedoc.anon

import typings.std.Map
import typings.std.Record
import typings.typedoc.optionsDeclarationMod.ParameterScope
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<typedoc.typedoc/dist/lib/utils/options/declaration.MapDeclarationOption<unknown>> */
trait ReadonlyMapDeclarationOpt extends js.Object {
  val defaultValue: js.Any
  val help: String
  val map: (Map[String, _]) | (Record[String | Double, _])
  val mapError: js.UndefOr[String] = js.undefined
  val name: String
  val scope: js.UndefOr[ParameterScope] = js.undefined
  val short: js.UndefOr[String] = js.undefined
  val `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Map
}

object ReadonlyMapDeclarationOpt {
  @scala.inline
  def apply(
    defaultValue: js.Any,
    help: String,
    map: (Map[String, _]) | (Record[String | Double, _]),
    name: String,
    `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Map,
    mapError: String = null,
    scope: ParameterScope = null,
    short: String = null
  ): ReadonlyMapDeclarationOpt = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (mapError != null) __obj.updateDynamic("mapError")(mapError.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyMapDeclarationOpt]
  }
}

