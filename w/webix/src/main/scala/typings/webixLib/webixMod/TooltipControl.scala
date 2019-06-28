package typings
package webixLib.webixMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TooltipControl extends js.Object {
  var delay: scala.Double = js.native
  @JSName("$tooltipIn")
  def $tooltipIn(target: stdLib.HTMLElement, event: stdLib.Event): scala.Unit = js.native
  @JSName("$tooltipMove")
  def $tooltipMove(target: stdLib.HTMLElement, event: stdLib.Event, text: java.lang.String): scala.Unit = js.native
  @JSName("$tooltipOut")
  def $tooltipOut(previousTarget: stdLib.HTMLElement, target: stdLib.HTMLElement, event: stdLib.Event): scala.Unit = js.native
  def addTooltip(target: java.lang.String, config: js.Any): scala.Unit = js.native
  def addTooltip(target: stdLib.HTMLElement, config: js.Any): scala.Unit = js.native
  def getMaster(target: stdLib.HTMLElement): js.Any = js.native
  def getTooltip(): webixLib.webixMod.uiNs.baseview = js.native
  def removeTooltip(target: java.lang.String): scala.Unit = js.native
  def removeTooltip(target: stdLib.HTMLElement): scala.Unit = js.native
}

