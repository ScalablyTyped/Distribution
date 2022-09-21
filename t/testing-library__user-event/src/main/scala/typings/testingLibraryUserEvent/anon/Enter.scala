package typings.testingLibraryUserEvent.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enter extends StObject {
  
  def enter(): Unit
  
  def leave(): Unit
  
  def move(): Unit
}
object Enter {
  
  inline def apply(enter: () => Unit, leave: () => Unit, move: () => Unit): Enter = {
    val __obj = js.Dynamic.literal(enter = js.Any.fromFunction0(enter), leave = js.Any.fromFunction0(leave), move = js.Any.fromFunction0(move))
    __obj.asInstanceOf[Enter]
  }
  
  extension [Self <: Enter](x: Self) {
    
    inline def setEnter(value: () => Unit): Self = StObject.set(x, "enter", js.Any.fromFunction0(value))
    
    inline def setLeave(value: () => Unit): Self = StObject.set(x, "leave", js.Any.fromFunction0(value))
    
    inline def setMove(value: () => Unit): Self = StObject.set(x, "move", js.Any.fromFunction0(value))
  }
}
