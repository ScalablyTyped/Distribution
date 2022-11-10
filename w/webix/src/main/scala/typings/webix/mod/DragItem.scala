package typings.webix.mod

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragItem extends StObject {
  
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event, pointer: String): String
  
  @JSName("$dragHTML")
  def $dragHTML(args: Any*): Any
  @JSName("$dragHTML")
  var $dragHTML_Original: WebixCallback
  
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): HTMLElement
  
  @JSName("$dragMark")
  def $dragMark(context: obj, ev: Event): Boolean
  
  @JSName("$dragOut")
  def $dragOut(source: HTMLElement, old_target: HTMLElement, new_target: HTMLElement, ev: Event): Unit
  
  @JSName("$drop")
  def $drop(source: HTMLElement, target: HTMLElement, ev: Event): Unit
  
  @JSName("$dropAllow")
  def $dropAllow(args: Any*): Any
  @JSName("$dropAllow")
  var $dropAllow_Original: WebixCallback
  
  @JSName("$dropHTML")
  def $dropHTML(args: Any*): Any
  @JSName("$dropHTML")
  var $dropHTML_Original: WebixCallback
}
object DragItem {
  
  @JSImport("webix", "DragItem")
  @js.native
  val ^ : DragItem = js.native
  
  extension [Self <: DragItem](x: Self) {
    
    inline def set$drag(value: (HTMLElement, Event, String) => String): Self = StObject.set(x, "$drag", js.Any.fromFunction3(value))
    
    inline def set$dragHTML(value: WebixCallback): Self = StObject.set(x, "$dragHTML", value.asInstanceOf[js.Any])
    
    inline def set$dragIn(value: (HTMLElement, HTMLElement, Event) => HTMLElement): Self = StObject.set(x, "$dragIn", js.Any.fromFunction3(value))
    
    inline def set$dragMark(value: (obj, Event) => Boolean): Self = StObject.set(x, "$dragMark", js.Any.fromFunction2(value))
    
    inline def set$dragOut(value: (HTMLElement, HTMLElement, HTMLElement, Event) => Unit): Self = StObject.set(x, "$dragOut", js.Any.fromFunction4(value))
    
    inline def set$drop(value: (HTMLElement, HTMLElement, Event) => Unit): Self = StObject.set(x, "$drop", js.Any.fromFunction3(value))
    
    inline def set$dropAllow(value: WebixCallback): Self = StObject.set(x, "$dropAllow", value.asInstanceOf[js.Any])
    
    inline def set$dropHTML(value: WebixCallback): Self = StObject.set(x, "$dropHTML", value.asInstanceOf[js.Any])
  }
}
