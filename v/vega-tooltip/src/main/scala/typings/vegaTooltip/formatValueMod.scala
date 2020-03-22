package typings.vegaTooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-tooltip/build/src/formatValue", JSImport.Namespace)
@js.native
object formatValueMod extends js.Object {
  def formatValue(value: js.Any, valueToHtml: js.Function1[/* value */ js.Any, String], maxDepth: Double): String = js.native
  def replacer(maxDepth: Double): js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _] = js.native
  def stringify(obj: js.Any, maxDepth: Double): String = js.native
}

