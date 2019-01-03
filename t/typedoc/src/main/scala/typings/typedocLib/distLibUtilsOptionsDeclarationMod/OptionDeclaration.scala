package typings
package typedocLib.distLibUtilsOptionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/declaration", "OptionDeclaration")
@js.native
class OptionDeclaration protected () extends js.Object {
  def this(data: DeclarationOption) = this()
  var component: js.UndefOr[java.lang.String] = js.native
  var defaultValue: js.Any = js.native
  var help: java.lang.String = js.native
  var hint: js.UndefOr[ParameterHint] = js.native
  var map: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[js.Any] | typedocLib.typedocLibStrings.`object`
  ] = js.native
  var mapError: js.UndefOr[java.lang.String] = js.native
  var name: java.lang.String = js.native
  var scope: ParameterScope = js.native
  var short: js.UndefOr[java.lang.String] = js.native
  var `type`: ParameterType = js.native
  def convert(value: js.Any): js.Any = js.native
  def convert(
    value: js.Any,
    errorCallback: js.Function2[/* format */ java.lang.String, /* repeated */ java.lang.String, scala.Unit]
  ): js.Any = js.native
  def getNames(): js.Array[java.lang.String] = js.native
}

