package typings.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.StringDictionary
import typings.typedoc.typedocStrings.object_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/declaration", "OptionDeclaration")
@js.native
class OptionDeclaration protected () extends js.Object {
  def this(data: DeclarationOption) = this()
  var component: js.UndefOr[String] = js.native
  var defaultValue: js.Any = js.native
  var help: String = js.native
  var hint: js.UndefOr[ParameterHint] = js.native
  var map: js.UndefOr[StringDictionary[js.Any] | object_] = js.native
  var mapError: js.UndefOr[String] = js.native
  var name: String = js.native
  var scope: ParameterScope = js.native
  var short: js.UndefOr[String] = js.native
  var `type`: ParameterType = js.native
  def convert(value: js.Any): js.Any = js.native
  def convert(value: js.Any, errorCallback: js.Function2[/* format */ String, /* repeated */ String, Unit]): js.Any = js.native
  def getNames(): js.Array[String] = js.native
}

