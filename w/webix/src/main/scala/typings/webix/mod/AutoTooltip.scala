package typings.webix.mod

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoTooltip extends StObject {
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement = js.native
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit = js.native
  
  @JSName("$tooltipOut")
  var $tooltipOut: Unit = js.native
}
object AutoTooltip {
  
  @JSImport("webix", "AutoTooltip")
  @js.native
  val ^ : AutoTooltip = js.native
  
  @scala.inline
  implicit class AutoTooltipMutableBuilder[Self <: AutoTooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def set$tooltipIn(value: HTMLElement => HTMLElement): Self = StObject.set(x, "$tooltipIn", js.Any.fromFunction1(value))
    
    @scala.inline
    def set$tooltipMove(value: (HTMLElement, Event, String) => Unit): Self = StObject.set(x, "$tooltipMove", js.Any.fromFunction3(value))
    
    @scala.inline
    def set$tooltipOut(value: Unit): Self = StObject.set(x, "$tooltipOut", value.asInstanceOf[js.Any])
  }
}
