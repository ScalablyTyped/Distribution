package typings.typedoc.legendPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/output/plugins/LegendPlugin", "LegendBuilder")
@js.native
class LegendBuilder () extends js.Object {
  var _classesList: js.Any = js.native
  var isArrayEqualToSet: js.Any = js.native
  def build(): js.Array[js.Array[LegendItem]] = js.native
  def registerCssClasses(classArray: js.Array[String]): Unit = js.native
}

