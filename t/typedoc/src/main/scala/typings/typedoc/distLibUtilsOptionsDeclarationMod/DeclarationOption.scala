package typings.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Map
import typings.typedoc.typedocStrings.object_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationOption extends js.Object {
  var component: js.UndefOr[String] = js.undefined
  var convert: js.UndefOr[js.Function2[/* param */ OptionDeclaration, /* value */ js.UndefOr[js.Any], _]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var help: String
  var hint: js.UndefOr[ParameterHint] = js.undefined
  var map: js.UndefOr[object_ | (Map[String | Double, _]) | StringDictionary[js.Any]] = js.undefined
  var mapError: js.UndefOr[String] = js.undefined
  var name: String
  var scope: js.UndefOr[ParameterScope] = js.undefined
  var short: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[ParameterType] = js.undefined
}

object DeclarationOption {
  @scala.inline
  def apply(
    help: String,
    name: String,
    component: String = null,
    convert: (/* param */ OptionDeclaration, /* value */ js.UndefOr[js.Any]) => _ = null,
    defaultValue: js.Any = null,
    hint: ParameterHint = null,
    map: object_ | (Map[String | Double, _]) | StringDictionary[js.Any] = null,
    mapError: String = null,
    scope: ParameterScope = null,
    short: String = null,
    `type`: ParameterType = null
  ): DeclarationOption = {
    val __obj = js.Dynamic.literal(help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (convert != null) __obj.updateDynamic("convert")(js.Any.fromFunction2(convert))
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mapError != null) __obj.updateDynamic("mapError")(mapError.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (short != null) __obj.updateDynamic("short")(short.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeclarationOption]
  }
}

