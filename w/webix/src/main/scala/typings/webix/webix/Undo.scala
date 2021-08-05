package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Undo extends StObject {
  
  def ignoreUndo(functor: WebixCallback): Unit
  
  def removeUndo(id: String): Unit
  
  def undo(id: String): Unit
}
object Undo {
  
  inline def apply(ignoreUndo: WebixCallback => Unit, removeUndo: String => Unit, undo: String => Unit): Undo = {
    val __obj = js.Dynamic.literal(ignoreUndo = js.Any.fromFunction1(ignoreUndo), removeUndo = js.Any.fromFunction1(removeUndo), undo = js.Any.fromFunction1(undo))
    __obj.asInstanceOf[Undo]
  }
  
  extension [Self <: Undo](x: Self) {
    
    inline def setIgnoreUndo(value: WebixCallback => Unit): Self = StObject.set(x, "ignoreUndo", js.Any.fromFunction1(value))
    
    inline def setRemoveUndo(value: String => Unit): Self = StObject.set(x, "removeUndo", js.Any.fromFunction1(value))
    
    inline def setUndo(value: String => Unit): Self = StObject.set(x, "undo", js.Any.fromFunction1(value))
  }
}
