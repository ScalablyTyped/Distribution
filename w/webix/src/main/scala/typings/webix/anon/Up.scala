package typings.webix.anon

import typings.std.Event
import typings.webix.webix.EnvContext
import typings.webix.webixStrings.touchend
import typings.webix.webixStrings.touchmove
import typings.webix.webixStrings.touchstart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Up extends StObject {
  
  def context(event: Event): EnvContext
  
  var down: touchstart
  
  var move: touchmove
  
  var up: touchend
}
object Up {
  
  inline def apply(context: Event => EnvContext): Up = {
    val __obj = js.Dynamic.literal(context = js.Any.fromFunction1(context), down = "touchstart", move = "touchmove", up = "touchend")
    __obj.asInstanceOf[Up]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Up] (val x: Self) extends AnyVal {
    
    inline def setContext(value: Event => EnvContext): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    inline def setDown(value: touchstart): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setMove(value: touchmove): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setUp(value: touchend): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
