package typings.wordpressComponents

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressComponents.anon.OnDraggableEnd
import typings.wordpressComponents.draggableMod.Draggable.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object draggableMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/components/draggable", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object Draggable {
    
    trait Props extends StObject {
      
      /**
        * Render prop providing `onDragStart` and `onDragEnd` for the
        * draggable element.
        */
      def children(props: OnDraggableEnd): ReactNode
      
      /**
        * The HTML id of the element to clone on drag.
        */
      var elementId: String
      
      /**
        * A function to be called when dragging ends.
        */
      var onDragEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * A function to be called when dragging starts.
        */
      var onDragStart: js.UndefOr[js.Function0[Unit]] = js.undefined
      
      /**
        * Arbitrary data object attached to the drag and drop event.
        */
      var transferData: js.Any
    }
    object Props {
      
      inline def apply(children: OnDraggableEnd => ReactNode, elementId: String, transferData: js.Any): Props = {
        val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), elementId = elementId.asInstanceOf[js.Any], transferData = transferData.asInstanceOf[js.Any])
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: OnDraggableEnd => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
        
        inline def setElementId(value: String): Self = StObject.set(x, "elementId", value.asInstanceOf[js.Any])
        
        inline def setOnDragEnd(value: () => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction0(value))
        
        inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
        
        inline def setOnDragStart(value: () => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction0(value))
        
        inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
        
        inline def setTransferData(value: js.Any): Self = StObject.set(x, "transferData", value.asInstanceOf[js.Any])
      }
    }
  }
}
