package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BeginDrag extends StObject {
  
  def beginDrag(param0: `12`): js.Promise[Unit]
  
  def dragOver(param0: Offset): js.Promise[Unit]
  
  def endDrag(item: Any): js.Promise[Any]
  
  def getItemDepth(param0: `12`): js.Promise[Double]
  
  def getItemPosition(param0: `12`): js.Promise[Any]
}
object BeginDrag {
  
  inline def apply(
    beginDrag: `12` => js.Promise[Unit],
    dragOver: Offset => js.Promise[Unit],
    endDrag: Any => js.Promise[Any],
    getItemDepth: `12` => js.Promise[Double],
    getItemPosition: `12` => js.Promise[Any]
  ): BeginDrag = {
    val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction1(beginDrag), dragOver = js.Any.fromFunction1(dragOver), endDrag = js.Any.fromFunction1(endDrag), getItemDepth = js.Any.fromFunction1(getItemDepth), getItemPosition = js.Any.fromFunction1(getItemPosition))
    __obj.asInstanceOf[BeginDrag]
  }
  
  extension [Self <: BeginDrag](x: Self) {
    
    inline def setBeginDrag(value: `12` => js.Promise[Unit]): Self = StObject.set(x, "beginDrag", js.Any.fromFunction1(value))
    
    inline def setDragOver(value: Offset => js.Promise[Unit]): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
    
    inline def setEndDrag(value: Any => js.Promise[Any]): Self = StObject.set(x, "endDrag", js.Any.fromFunction1(value))
    
    inline def setGetItemDepth(value: `12` => js.Promise[Double]): Self = StObject.set(x, "getItemDepth", js.Any.fromFunction1(value))
    
    inline def setGetItemPosition(value: `12` => js.Promise[Any]): Self = StObject.set(x, "getItemPosition", js.Any.fromFunction1(value))
  }
}
