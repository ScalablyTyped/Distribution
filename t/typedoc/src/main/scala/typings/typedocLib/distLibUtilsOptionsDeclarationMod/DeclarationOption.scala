package typings
package typedocLib.distLibUtilsOptionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeclarationOption extends js.Object {
  var component: js.UndefOr[java.lang.String] = js.undefined
  var convert: js.UndefOr[js.Function2[/* param */ OptionDeclaration, /* value */ js.UndefOr[js.Any], _]] = js.undefined
  var defaultValue: js.UndefOr[js.Any] = js.undefined
  var help: java.lang.String
  var hint: js.UndefOr[ParameterHint] = js.undefined
  var map: js.UndefOr[
    typedocLib.typedocLibStrings.`object` | (lodashLib.lodashMod.Global.Map[java.lang.String | scala.Double, _]) | org.scalablytyped.runtime.StringDictionary[js.Any]
  ] = js.undefined
  var mapError: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var scope: js.UndefOr[ParameterScope] = js.undefined
  var short: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[ParameterType] = js.undefined
}

object DeclarationOption {
  @scala.inline
  def apply(
    help: java.lang.String,
    name: java.lang.String,
    component: java.lang.String = null,
    convert: js.Function2[/* param */ OptionDeclaration, /* value */ js.UndefOr[js.Any], _] = null,
    defaultValue: js.Any = null,
    hint: ParameterHint = null,
    map: typedocLib.typedocLibStrings.`object` | (lodashLib.lodashMod.Global.Map[java.lang.String | scala.Double, _]) | org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    mapError: java.lang.String = null,
    scope: ParameterScope = null,
    short: java.lang.String = null,
    `type`: ParameterType = null
  ): DeclarationOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("help")(help)
    __obj.updateDynamic("name")(name)
    if (component != null) __obj.updateDynamic("component")(component)
    if (convert != null) __obj.updateDynamic("convert")(convert)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (hint != null) __obj.updateDynamic("hint")(hint)
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (mapError != null) __obj.updateDynamic("mapError")(mapError)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    if (short != null) __obj.updateDynamic("short")(short)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DeclarationOption]
  }
}

