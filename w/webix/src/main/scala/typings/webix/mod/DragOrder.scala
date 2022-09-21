package typings.webix.mod

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragOrder extends StObject {
  
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event): String
  
  @JSName("$dragDestroy")
  var $dragDestroy: Unit
  
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): HTMLElement
  
  @JSName("$dragMark")
  var $dragMark: Boolean
  
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, target: HTMLElement, drop: HTMLElement): Unit
  
  @JSName("$dragPos")
  def $dragPos(args: Any*): Any
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback
  
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event): Unit
}
object DragOrder {
  
  @JSImport("webix", "DragOrder")
  @js.native
  val ^ : DragOrder = js.native
  
  extension [Self <: DragOrder](x: Self) {
    
    inline def set$drag(value: (HTMLElement, Event) => String): Self = StObject.set(x, "$drag", js.Any.fromFunction2(value))
    
    inline def set$dragDestroy(value: Unit): Self = StObject.set(x, "$dragDestroy", value.asInstanceOf[js.Any])
    
    inline def set$dragIn(value: (HTMLElement, HTMLElement, Event) => HTMLElement): Self = StObject.set(x, "$dragIn", js.Any.fromFunction3(value))
    
    inline def set$dragMark(value: Boolean): Self = StObject.set(x, "$dragMark", value.asInstanceOf[js.Any])
    
    inline def set$dragOut(value: (HTMLElement, HTMLElement, HTMLElement) => Unit): Self = StObject.set(x, "$dragOut", js.Any.fromFunction3(value))
    
    inline def set$dragPos(value: WebixCallback): Self = StObject.set(x, "$dragPos", value.asInstanceOf[js.Any])
    
    inline def set$drop(value: (HTMLElement, HTMLElement, Event) => Unit): Self = StObject.set(x, "$drop", js.Any.fromFunction3(value))
  }
}
