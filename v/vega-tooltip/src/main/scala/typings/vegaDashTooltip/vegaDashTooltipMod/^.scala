package typings.vegaDashTooltip.vegaDashTooltipMod

import typings.std.MouseEvent
import typings.std.Partial
import typings.vegaDashTooltip.Anon_Height
import typings.vegaDashTooltip.Anon_X
import typings.vegaDashTooltip.buildSrcDefaultsMod.Options
import typings.vegaDashTypings.vegaDashTypingsMod.View
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vega-tooltip", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val version: String = js.native
  def calculatePosition(event: MouseEvent, tooltipBox: Anon_Height, offsetX: Double, offsetY: Double): Anon_X = js.native
  def createDefaultStyle(id: String): String = js.native
  def default(view: View): typings.vegaDashTooltip.buildSrcHandlerMod.Handler = js.native
  def default(view: View, opt: Partial[Options]): typings.vegaDashTooltip.buildSrcHandlerMod.Handler = js.native
  def escapeHTML(value: js.Any): String = js.native
  def formatValue(value: js.Any, valueToHtml: js.Function1[/* value */ js.Any, String], maxDepth: Double): String = js.native
  def replacer(maxDepth: Double): js.ThisFunction2[/* this */ js.Any, /* key */ String, /* value */ js.Any, _] = js.native
  def stringify(obj: js.Any, maxDepth: Double): String = js.native
}

