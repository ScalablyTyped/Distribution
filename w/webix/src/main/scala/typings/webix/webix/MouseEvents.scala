package typings.webix.webix

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MouseEvents extends StObject {
  
  def on_click(args: js.Any*): js.Any
  @JSName("on_click")
  var on_click_Original: WebixCallback
  
  var on_context: StringDictionary[js.Any]
  
  def on_dblclick(args: js.Any*): js.Any
  @JSName("on_dblclick")
  var on_dblclick_Original: WebixCallback
  
  def on_mouse_move(args: js.Any*): js.Any
  @JSName("on_mouse_move")
  var on_mouse_move_Original: WebixCallback
}
object MouseEvents {
  
  @scala.inline
  def apply(
    on_click: WebixCallback,
    on_context: StringDictionary[js.Any],
    on_dblclick: WebixCallback,
    on_mouse_move: WebixCallback
  ): MouseEvents = {
    val __obj = js.Dynamic.literal(on_click = on_click.asInstanceOf[js.Any], on_context = on_context.asInstanceOf[js.Any], on_dblclick = on_dblclick.asInstanceOf[js.Any], on_mouse_move = on_mouse_move.asInstanceOf[js.Any])
    __obj.asInstanceOf[MouseEvents]
  }
  
  @scala.inline
  implicit class MouseEventsMutableBuilder[Self <: MouseEvents] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOn_click(value: WebixCallback): Self = StObject.set(x, "on_click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_context(value: StringDictionary[js.Any]): Self = StObject.set(x, "on_context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_dblclick(value: WebixCallback): Self = StObject.set(x, "on_dblclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOn_mouse_move(value: WebixCallback): Self = StObject.set(x, "on_mouse_move", value.asInstanceOf[js.Any])
  }
}
