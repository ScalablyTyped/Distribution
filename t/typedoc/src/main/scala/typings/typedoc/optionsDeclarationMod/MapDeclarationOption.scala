package typings.typedoc.optionsDeclarationMod

import typings.std.Map
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapDeclarationOption[T] extends DeclarationOptionBase {
  var defaultValue: T
  var map: (Map[String, T]) | (Record[String | Double, T])
  var mapError: js.UndefOr[String] = js.undefined
  @JSName("type")
  var type_MapDeclarationOption: typings.typedoc.optionsDeclarationMod.ParameterType.Map
}

object MapDeclarationOption {
  @scala.inline
  def apply[T](
    defaultValue: T,
    help: String,
    map: (Map[String, T]) | (Record[String | Double, T]),
    name: String,
    `type`: typings.typedoc.optionsDeclarationMod.ParameterType.Map,
    mapError: String = null,
    scope: ParameterScope = null,
    short: String = null
  ): MapDeclarationOption[T] = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue.asInstanceOf[js.Any], help = help.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (mapError != null) __obj.updateDynamic("mapError")(mapError.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDeclarationOption[T]]
  }
}

