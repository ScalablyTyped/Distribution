package typings.webix.mod

import typings.std.Event
import typings.std.HTMLElement
import typings.webix.webix.ui.baseview
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipControl extends StObject {
  
  @JSName("$tooltipIn")
  def $tooltipIn(target: HTMLElement, event: Event): Unit = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(target: HTMLElement, event: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  def $tooltipOut(previousTarget: HTMLElement, target: HTMLElement, event: Event): Unit = js.native
  
  def addTooltip(target: String, config: js.Any): Unit = js.native
  def addTooltip(target: HTMLElement, config: js.Any): Unit = js.native
  
  var delay: Double = js.native
  
  def getMaster(target: HTMLElement): js.Any = js.native
  
  def getTooltip(): baseview = js.native
  
  def removeTooltip(target: String): Unit = js.native
  def removeTooltip(target: HTMLElement): Unit = js.native
}
