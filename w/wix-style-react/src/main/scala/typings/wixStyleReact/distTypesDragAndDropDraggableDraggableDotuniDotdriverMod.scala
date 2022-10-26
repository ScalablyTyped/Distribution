package typings.wixStyleReact

import typings.wixStyleReact.anon.DataHookString
import typings.wixStyleReact.anon.`5`
import typings.wixUiTestUtils.distSrcBaseDriverMod.BaseUniDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragAndDropDraggableDraggableDotuniDotdriverMod {
  
  trait DraggableUniDriver
    extends StObject
       with BaseUniDriver {
    
    def beginDrag(details: DataHookString): js.Promise[Unit]
    
    def dragOver(details: DataHookString): js.Promise[Unit]
    
    def endDrag(details: `5`): js.Promise[Unit]
  }
  object DraggableUniDriver {
    
    inline def apply(
      beginDrag: DataHookString => js.Promise[Unit],
      click: () => js.Promise[Unit],
      dragOver: DataHookString => js.Promise[Unit],
      element: () => js.Promise[Any],
      endDrag: `5` => js.Promise[Unit],
      exists: () => js.Promise[Boolean]
    ): DraggableUniDriver = {
      val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction1(beginDrag), click = js.Any.fromFunction0(click), dragOver = js.Any.fromFunction1(dragOver), element = js.Any.fromFunction0(element), endDrag = js.Any.fromFunction1(endDrag), exists = js.Any.fromFunction0(exists))
      __obj.asInstanceOf[DraggableUniDriver]
    }
    
    extension [Self <: DraggableUniDriver](x: Self) {
      
      inline def setBeginDrag(value: DataHookString => js.Promise[Unit]): Self = StObject.set(x, "beginDrag", js.Any.fromFunction1(value))
      
      inline def setDragOver(value: DataHookString => js.Promise[Unit]): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
      
      inline def setEndDrag(value: `5` => js.Promise[Unit]): Self = StObject.set(x, "endDrag", js.Any.fromFunction1(value))
    }
  }
}
