package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.draggableMod.DraggableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortableGridMod {
  
  @JSImport("wix-style-react/dist/es/src/SortableGrid", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SortableGridProps, js.Object, js.Any]
  
  type SortableGrid = PureComponent[SortableGridProps, js.Object, js.Any]
  
  trait SortableGridProps
    extends StObject
       with DraggableProps {
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dragPreview: js.UndefOr[Boolean] = js.undefined
    
    var endFixedElement: js.UndefOr[ReactNode] = js.undefined
    
    var items: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var startFixedElement: js.UndefOr[ReactNode] = js.undefined
    
    var usePortal: js.UndefOr[Boolean] = js.undefined
  }
  object SortableGridProps {
    
    inline def apply(): SortableGridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortableGridProps]
    }
    
    extension [Self <: SortableGridProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDragPreview(value: Boolean): Self = StObject.set(x, "dragPreview", value.asInstanceOf[js.Any])
      
      inline def setDragPreviewUndefined: Self = StObject.set(x, "dragPreview", js.undefined)
      
      inline def setEndFixedElement(value: ReactNode): Self = StObject.set(x, "endFixedElement", value.asInstanceOf[js.Any])
      
      inline def setEndFixedElementUndefined: Self = StObject.set(x, "endFixedElement", js.undefined)
      
      inline def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setStartFixedElement(value: ReactNode): Self = StObject.set(x, "startFixedElement", value.asInstanceOf[js.Any])
      
      inline def setStartFixedElementUndefined: Self = StObject.set(x, "startFixedElement", js.undefined)
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
}
