package typings.wixStyleReact

import typings.react.mod.PureComponent
import typings.wixStyleReact.draggableMod.DraggableProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortableListMod {
  
  @JSImport("wix-style-react/dist/es/src/SortableList", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[SortableListProps, js.Object, js.Any]
  
  type SortableList = PureComponent[SortableListProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.start
    - typings.wixStyleReact.wixStyleReactStrings.end
    - typings.wixStyleReact.wixStyleReactStrings.any
  */
  trait SortableListInsertPosition extends StObject
  object SortableListInsertPosition {
    
    inline def any: typings.wixStyleReact.wixStyleReactStrings.any = "any".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.any]
    
    inline def end: typings.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.end]
    
    inline def start: typings.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait SortableListProps
    extends StObject
       with DraggableProps {
    
    var className: js.UndefOr[String] = js.undefined
    
    var contentClassName: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dragPreview: js.UndefOr[Boolean] = js.undefined
    
    var insertPosition: js.UndefOr[SortableListInsertPosition] = js.undefined
    
    var items: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var usePortal: js.UndefOr[Boolean] = js.undefined
  }
  object SortableListProps {
    
    inline def apply(): SortableListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SortableListProps]
    }
    
    extension [Self <: SortableListProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContentClassName(value: String): Self = StObject.set(x, "contentClassName", value.asInstanceOf[js.Any])
      
      inline def setContentClassNameUndefined: Self = StObject.set(x, "contentClassName", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDragPreview(value: Boolean): Self = StObject.set(x, "dragPreview", value.asInstanceOf[js.Any])
      
      inline def setDragPreviewUndefined: Self = StObject.set(x, "dragPreview", js.undefined)
      
      inline def setInsertPosition(value: SortableListInsertPosition): Self = StObject.set(x, "insertPosition", value.asInstanceOf[js.Any])
      
      inline def setInsertPositionUndefined: Self = StObject.set(x, "insertPosition", js.undefined)
      
      inline def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setUsePortal(value: Boolean): Self = StObject.set(x, "usePortal", value.asInstanceOf[js.Any])
      
      inline def setUsePortalUndefined: Self = StObject.set(x, "usePortal", js.undefined)
    }
  }
}
