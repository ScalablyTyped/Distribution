package typings.webix.webix

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoTooltip extends StObject {
  
  @JSName("$tooltipIn")
  def $tooltipIn(node: HTMLElement): HTMLElement
  
  @JSName("$tooltipMove")
  def $tooltipMove(t: HTMLElement, e: Event, text: String): Unit
  
  @JSName("$tooltipOut")
  var $tooltipOut: Unit
}
object AutoTooltip {
  
  inline def apply(
    $tooltipIn: HTMLElement => HTMLElement,
    $tooltipMove: (HTMLElement, Event, String) => Unit,
    $tooltipOut: Unit
  ): AutoTooltip = {
    val __obj = js.Dynamic.literal($tooltipIn = js.Any.fromFunction1($tooltipIn), $tooltipMove = js.Any.fromFunction3($tooltipMove), $tooltipOut = $tooltipOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoTooltip]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AutoTooltip] (val x: Self) extends AnyVal {
    
    inline def set$tooltipIn(value: HTMLElement => HTMLElement): Self = StObject.set(x, "$tooltipIn", js.Any.fromFunction1(value))
    
    inline def set$tooltipMove(value: (HTMLElement, Event, String) => Unit): Self = StObject.set(x, "$tooltipMove", js.Any.fromFunction3(value))
    
    inline def set$tooltipOut(value: Unit): Self = StObject.set(x, "$tooltipOut", value.asInstanceOf[js.Any])
  }
}
