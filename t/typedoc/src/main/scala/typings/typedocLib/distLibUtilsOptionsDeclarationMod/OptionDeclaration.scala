package typings
package typedocLib.distLibUtilsOptionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/declaration", "OptionDeclaration")
@js.native
class OptionDeclaration protected () extends js.Object {
  def this(data: DeclarationOption) = this()
  var component: java.lang.String = js.native
  var defaultValue: js.Any = js.native
  var help: java.lang.String = js.native
  var hint: ParameterHint = js.native
  var isArray: scala.Boolean = js.native
  var map: js.Object | (lodashLib.lodashMod.Global.Map[java.lang.String, _]) | typedocLib.typedocLibStrings.`object` = js.native
  var mapError: java.lang.String = js.native
  var name: java.lang.String = js.native
  var scope: ParameterScope = js.native
  var short: java.lang.String = js.native
  var `type`: ParameterType = js.native
  def convert(value: js.Any): js.Any = js.native
  def convert(value: js.Any, errorCallback: js.Function): js.Any = js.native
  def getNames(): js.Array[java.lang.String] = js.native
}

