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

