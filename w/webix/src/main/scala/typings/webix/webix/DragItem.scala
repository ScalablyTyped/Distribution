package typings.webix.webix

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragItem extends StObject {
  
  @JSName("$drag")
  def $drag(source: HTMLElement, ev: Event): String
  
  @JSName("$dragHTML")
  def $dragHTML(args: Any*): Any
  @JSName("$dragHTML")
  var $dragHTML_Original: WebixCallback
  
  @JSName("$dragIn")
  def $dragIn(source: HTMLElement, target: HTMLElement, ev: Event): HTMLElement
  
  @JSName("$dragMark")
  def $dragMark(context: Any, ev: Event): Boolean
  
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
  
  inline def apply(
    $drag: (HTMLElement, Event) => String,
    $dragHTML: WebixCallback,
    $dragIn: (HTMLElement, HTMLElement, Event) => HTMLElement,
    $dragMark: (Any, Event) => Boolean,
    $dragOut: (HTMLElement, HTMLElement, HTMLElement, Event) => Unit,
    $drop: (HTMLElement, HTMLElement, Event) => Unit,
    $dropAllow: WebixCallback,
    $dropHTML: WebixCallback
  ): DragItem = {
    val __obj = js.Dynamic.literal($drag = js.Any.fromFunction2($drag), $dragHTML = $dragHTML.asInstanceOf[js.Any], $dragIn = js.Any.fromFunction3($dragIn), $dragMark = js.Any.fromFunction2($dragMark), $dragOut = js.Any.fromFunction4($dragOut), $drop = js.Any.fromFunction3($drop), $dropAllow = $dropAllow.asInstanceOf[js.Any], $dropHTML = $dropHTML.asInstanceOf[js.Any])
    __obj.asInstanceOf[DragItem]
  }
  
  extension [Self <: DragItem](x: Self) {
    
    inline def set$drag(value: (HTMLElement, Event) => String): Self = StObject.set(x, "$drag", js.Any.fromFunction2(value))
    
    inline def set$dragHTML(value: WebixCallback): Self = StObject.set(x, "$dragHTML", value.asInstanceOf[js.Any])
    
    inline def set$dragIn(value: (HTMLElement, HTMLElement, Event) => HTMLElement): Self = StObject.set(x, "$dragIn", js.Any.fromFunction3(value))
    
    inline def set$dragMark(value: (Any, Event) => Boolean): Self = StObject.set(x, "$dragMark", js.Any.fromFunction2(value))
    
    inline def set$dragOut(value: (HTMLElement, HTMLElement, HTMLElement, Event) => Unit): Self = StObject.set(x, "$dragOut", js.Any.fromFunction4(value))
    
    inline def set$drop(value: (HTMLElement, HTMLElement, Event) => Unit): Self = StObject.set(x, "$drop", js.Any.fromFunction3(value))
    
    inline def set$dropAllow(value: WebixCallback): Self = StObject.set(x, "$dropAllow", value.asInstanceOf[js.Any])
    
    inline def set$dropHTML(value: WebixCallback): Self = StObject.set(x, "$dropHTML", value.asInstanceOf[js.Any])
  }
}
