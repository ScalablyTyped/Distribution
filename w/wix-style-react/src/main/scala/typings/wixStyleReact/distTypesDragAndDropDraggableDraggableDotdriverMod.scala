package typings.wixStyleReact

import typings.wixStyleReact.anon.DataHookString
import typings.wixStyleReact.anon.`4`
import typings.wixUiTestUtils.distSrcDriverFactoryCreateDriverFactoryMod.BaseDriver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDragAndDropDraggableDraggableDotdriverMod {
  
  trait DraggableDriver
    extends StObject
       with BaseDriver {
    
    def beginDrag(details: DataHookString): Unit
    
    def dragOver(details: DataHookString): Unit
    
    def endDrag(details: `4`): Unit
  }
  object DraggableDriver {
    
    inline def apply(
      beginDrag: DataHookString => Unit,
      dragOver: DataHookString => Unit,
      endDrag: `4` => Unit,
      exists: () => Boolean
    ): DraggableDriver = {
      val __obj = js.Dynamic.literal(beginDrag = js.Any.fromFunction1(beginDrag), dragOver = js.Any.fromFunction1(dragOver), endDrag = js.Any.fromFunction1(endDrag), exists = js.Any.fromFunction0(exists))
      __obj.asInstanceOf[DraggableDriver]
    }
    
    extension [Self <: DraggableDriver](x: Self) {
      
      inline def setBeginDrag(value: DataHookString => Unit): Self = StObject.set(x, "beginDrag", js.Any.fromFunction1(value))
      
      inline def setDragOver(value: DataHookString => Unit): Self = StObject.set(x, "dragOver", js.Any.fromFunction1(value))
      
      inline def setEndDrag(value: `4` => Unit): Self = StObject.set(x, "endDrag", js.Any.fromFunction1(value))
    }
  }
}
