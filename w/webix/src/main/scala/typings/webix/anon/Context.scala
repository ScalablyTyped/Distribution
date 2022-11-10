package typings.webix.anon

import typings.std.Event
import typings.webix.mod.EnvContext
import typings.webix.webixStrings.mousedown
import typings.webix.webixStrings.mousemove
import typings.webix.webixStrings.mouseup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Context extends StObject {
  
  def context(event: Event): EnvContext
  
  var down: mousedown
  
  var move: mousemove
  
  var up: mouseup
}
object Context {
  
  inline def apply(context: Event => EnvContext): Context = {
    val __obj = js.Dynamic.literal(context = js.Any.fromFunction1(context), down = "mousedown", move = "mousemove", up = "mouseup")
    __obj.asInstanceOf[Context]
  }
  
  extension [Self <: Context](x: Self) {
    
    inline def setContext(value: Event => EnvContext): Self = StObject.set(x, "context", js.Any.fromFunction1(value))
    
    inline def setDown(value: mousedown): Self = StObject.set(x, "down", value.asInstanceOf[js.Any])
    
    inline def setMove(value: mousemove): Self = StObject.set(x, "move", value.asInstanceOf[js.Any])
    
    inline def setUp(value: mouseup): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
  }
}
