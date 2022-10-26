package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DragOver extends StObject {
  
  def beginDrag(param0: `13`): js.Promise[Unit]
  
  def dragOver(param0: Offset): js.Promise[Unit]
  
  def endDrag(): Any
}
object DragOver {
  
  inline def apply(beginDrag: `13` => js.Promise[Unit], dragOver: Offset => js.Promise[Unit], endDrag: () => Any): DragOver = {
    val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction1(beginDrag), dragOver = js.Any.fromFunction1(dragOver), endDrag = js.Any.fromFunction0(endDrag))
    __obj.asInstanceOf[DragOver]
  }
  
  extension [Self <: DragOver](x: Self) {
    
    inline def setBeginDrag(value: `13` => js.Promise[Unit]): Self = StObject.set(x, "beginDrag", js.Any.fromFunction1(value))
    
    inline def setDragOver(value: Offset => js.Promise[Unit]): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
    
    inline def setEndDrag(value: () => Any): Self = StObject.set(x, "endDrag", js.Any.fromFunction0(value))
  }
}
