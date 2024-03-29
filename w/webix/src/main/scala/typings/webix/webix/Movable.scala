package typings.webix.webix

import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Movable extends StObject {
  
  @JSName("$dragCreate")
  def $dragCreate(source: HTMLElement, event: Event, pointer: String): HTMLElement
  
  @JSName("$dragDestroy")
  def $dragDestroy(args: Any*): Any
  @JSName("$dragDestroy")
  var $dragDestroy_Original: WebixCallback
  
  @JSName("$dragPos")
  def $dragPos(args: Any*): Any
  @JSName("$dragPos")
  var $dragPos_Original: WebixCallback
}
object Movable {
  
  inline def apply(
    $dragCreate: (HTMLElement, Event, String) => HTMLElement,
    $dragDestroy: WebixCallback,
    $dragPos: WebixCallback
  ): Movable = {
    val __obj = js.Dynamic.literal($dragCreate = js.Any.fromFunction3($dragCreate), $dragDestroy = $dragDestroy.asInstanceOf[js.Any], $dragPos = $dragPos.asInstanceOf[js.Any])
    __obj.asInstanceOf[Movable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Movable] (val x: Self) extends AnyVal {
    
    inline def set$dragCreate(value: (HTMLElement, Event, String) => HTMLElement): Self = StObject.set(x, "$dragCreate", js.Any.fromFunction3(value))
    
    inline def set$dragDestroy(value: WebixCallback): Self = StObject.set(x, "$dragDestroy", value.asInstanceOf[js.Any])
    
    inline def set$dragPos(value: WebixCallback): Self = StObject.set(x, "$dragPos", value.asInstanceOf[js.Any])
  }
}
