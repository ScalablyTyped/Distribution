package typings.wixStyleReact.anon

import typings.react.mod.CSSProperties
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesTableDataTableMod.DragEndEvent
import typings.wixStyleReact.distTypesTableDataTableMod.DragStartEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsDragAndDropDisabled extends StObject {
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var isDragAndDropDisabled: js.UndefOr[Boolean] = js.undefined
  
  var items: js.Array[IdString]
  
  var onDragCancel: js.UndefOr[js.Function1[/* event */ DragEndEvent, Any]] = js.undefined
  
  var onDragEnd: js.UndefOr[js.Function1[/* event */ DragEndEvent, Any]] = js.undefined
  
  var onDragStart: js.UndefOr[js.Function1[/* event */ DragStartEvent, Any]] = js.undefined
  
  def renderRow(args: RowData): ReactElement
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object IsDragAndDropDisabled {
  
  inline def apply(items: js.Array[IdString], renderRow: RowData => ReactElement): IsDragAndDropDisabled = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], renderRow = js.Any.fromFunction1(renderRow))
    __obj.asInstanceOf[IsDragAndDropDisabled]
  }
  
  extension [Self <: IsDragAndDropDisabled](x: Self) {
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setIsDragAndDropDisabled(value: Boolean): Self = StObject.set(x, "isDragAndDropDisabled", value.asInstanceOf[js.Any])
    
    inline def setIsDragAndDropDisabledUndefined: Self = StObject.set(x, "isDragAndDropDisabled", js.undefined)
    
    inline def setItems(value: js.Array[IdString]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: IdString*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setOnDragCancel(value: /* event */ DragEndEvent => Any): Self = StObject.set(x, "onDragCancel", js.Any.fromFunction1(value))
    
    inline def setOnDragCancelUndefined: Self = StObject.set(x, "onDragCancel", js.undefined)
    
    inline def setOnDragEnd(value: /* event */ DragEndEvent => Any): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
    
    inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
    
    inline def setOnDragStart(value: /* event */ DragStartEvent => Any): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
    
    inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
    
    inline def setRenderRow(value: RowData => ReactElement): Self = StObject.set(x, "renderRow", js.Any.fromFunction1(value))
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
