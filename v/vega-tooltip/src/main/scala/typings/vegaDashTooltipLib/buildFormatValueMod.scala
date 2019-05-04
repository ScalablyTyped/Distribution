package typings
package vegaDashTooltipLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-tooltip/build/formatValue", JSImport.Namespace)
@js.native
object buildFormatValueMod extends js.Object {
  def formatValue(
    value: js.Any,
    valueToHtml: js.Function1[/* value */ js.Any, java.lang.String],
    maxDepth: scala.Double
  ): java.lang.String = js.native
  def replacer(maxDepth: scala.Double): js.ThisFunction2[/* this */ js.Any, /* key */ java.lang.String, /* value */ js.Any, _] = js.native
  def stringify(obj: js.Any, maxDepth: scala.Double): java.lang.String = js.native
}

