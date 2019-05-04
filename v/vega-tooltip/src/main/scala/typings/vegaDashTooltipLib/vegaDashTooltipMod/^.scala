package typings
package vegaDashTooltipLib.vegaDashTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-tooltip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def calculatePosition(
    event: stdLib.MouseEvent,
    tooltipBox: vegaDashTooltipLib.Anon_Height,
    offsetX: scala.Double,
    offsetY: scala.Double
  ): vegaDashTooltipLib.Anon_X = js.native
  def createDefaultStyle(id: java.lang.String): java.lang.String = js.native
  def default(view: vegaDashTypingsLib.vegaDashTypingsMod.View): vegaDashTooltipLib.buildHandlerMod.Handler = js.native
  def default(
    view: vegaDashTypingsLib.vegaDashTypingsMod.View,
    opt: stdLib.Partial[vegaDashTooltipLib.buildDefaultsMod.Options]
  ): vegaDashTooltipLib.buildHandlerMod.Handler = js.native
  def escapeHTML(value: js.Any): java.lang.String = js.native
  def formatValue(
    value: js.Any,
    valueToHtml: js.Function1[/* value */ js.Any, java.lang.String],
    maxDepth: scala.Double
  ): java.lang.String = js.native
  def replacer(maxDepth: scala.Double): js.ThisFunction2[/* this */ js.Any, /* key */ java.lang.String, /* value */ js.Any, _] = js.native
  def stringify(obj: js.Any, maxDepth: scala.Double): java.lang.String = js.native
}

