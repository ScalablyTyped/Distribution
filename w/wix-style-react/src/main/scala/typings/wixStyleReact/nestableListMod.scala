package typings.wixStyleReact

import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.Item
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nestableListMod {
  
  @JSImport("wix-style-react/dist/es/src/NestableList", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[NestableListProps, js.Object, js.Any]
  
  trait IRenderData extends StObject {
    
    var connectDragSource: js.Any
    
    var depth: Double
    
    var isPlaceholder: Boolean
    
    var isPreview: Boolean
    
    var item: js.Object
  }
  object IRenderData {
    
    inline def apply(
      connectDragSource: js.Any,
      depth: Double,
      isPlaceholder: Boolean,
      isPreview: Boolean,
      item: js.Object
    ): IRenderData = {
      val __obj = js.Dynamic.literal(connectDragSource = connectDragSource.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], isPlaceholder = isPlaceholder.asInstanceOf[js.Any], isPreview = isPreview.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRenderData]
    }
    
    extension [Self <: IRenderData](x: Self) {
      
      inline def setConnectDragSource(value: js.Any): Self = StObject.set(x, "connectDragSource", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setIsPlaceholder(value: Boolean): Self = StObject.set(x, "isPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setIsPreview(value: Boolean): Self = StObject.set(x, "isPreview", value.asInstanceOf[js.Any])
      
      inline def setItem(value: js.Object): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    }
  }
  
  type NestableList = PureComponent[NestableListProps, js.Object, js.Any]
  
  trait NestableListProps extends StObject {
    
    var childrenProperty: js.UndefOr[String] = js.undefined
    
    var childrenStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var isRenderDraggingChildren: js.UndefOr[Boolean] = js.undefined
    
    var items: js.UndefOr[js.Array[js.Object]] = js.undefined
    
    var maxDepth: js.UndefOr[Double] = js.undefined
    
    var onDragEnd: js.UndefOr[js.Function1[/* itemProps */ js.Any, Unit]] = js.undefined
    
    var onDragStart: js.UndefOr[js.Function1[/* itemProps */ js.Any, Unit]] = js.undefined
    
    var onUpdate: js.UndefOr[js.Function1[/* data */ Item, Unit]] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var renderAction: js.UndefOr[js.Function1[/* data */ IRenderData, ReactNode]] = js.undefined
    
    var renderItem: js.UndefOr[js.Function1[/* data */ IRenderData, ReactNode]] = js.undefined
    
    var renderPrefix: js.UndefOr[js.Function1[/* data */ IRenderData, ReactNode]] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
    
    var useDragHandle: js.UndefOr[Boolean] = js.undefined
  }
  object NestableListProps {
    
    inline def apply(): NestableListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NestableListProps]
    }
    
    extension [Self <: NestableListProps](x: Self) {
      
      inline def setChildrenProperty(value: String): Self = StObject.set(x, "childrenProperty", value.asInstanceOf[js.Any])
      
      inline def setChildrenPropertyUndefined: Self = StObject.set(x, "childrenProperty", js.undefined)
      
      inline def setChildrenStyle(value: CSSProperties): Self = StObject.set(x, "childrenStyle", value.asInstanceOf[js.Any])
      
      inline def setChildrenStyleUndefined: Self = StObject.set(x, "childrenStyle", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setIsRenderDraggingChildren(value: Boolean): Self = StObject.set(x, "isRenderDraggingChildren", value.asInstanceOf[js.Any])
      
      inline def setIsRenderDraggingChildrenUndefined: Self = StObject.set(x, "isRenderDraggingChildren", js.undefined)
      
      inline def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      inline def setMaxDepth(value: Double): Self = StObject.set(x, "maxDepth", value.asInstanceOf[js.Any])
      
      inline def setMaxDepthUndefined: Self = StObject.set(x, "maxDepth", js.undefined)
      
      inline def setOnDragEnd(value: /* itemProps */ js.Any => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragStart(value: /* itemProps */ js.Any => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnUpdate(value: /* data */ Item => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction1(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRenderAction(value: /* data */ IRenderData => ReactNode): Self = StObject.set(x, "renderAction", js.Any.fromFunction1(value))
      
      inline def setRenderActionUndefined: Self = StObject.set(x, "renderAction", js.undefined)
      
      inline def setRenderItem(value: /* data */ IRenderData => ReactNode): Self = StObject.set(x, "renderItem", js.Any.fromFunction1(value))
      
      inline def setRenderItemUndefined: Self = StObject.set(x, "renderItem", js.undefined)
      
      inline def setRenderPrefix(value: /* data */ IRenderData => ReactNode): Self = StObject.set(x, "renderPrefix", js.Any.fromFunction1(value))
      
      inline def setRenderPrefixUndefined: Self = StObject.set(x, "renderPrefix", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
      
      inline def setUseDragHandle(value: Boolean): Self = StObject.set(x, "useDragHandle", value.asInstanceOf[js.Any])
      
      inline def setUseDragHandleUndefined: Self = StObject.set(x, "useDragHandle", js.undefined)
    }
  }
}
