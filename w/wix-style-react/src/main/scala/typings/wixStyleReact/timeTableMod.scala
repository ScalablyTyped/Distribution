package typings.wixStyleReact

import typings.react.mod.FC
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timeTableMod {
  
  @JSImport("wix-style-react/dist/es/src/TimeTable", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[TimeTableProps, js.Object, js.Any]
  
  type TimeTable = PureComponent[TimeTableProps, js.Object, js.Any]
  
  trait TimeTableChangeDetails extends StObject {
    
    var addedItemIndex: Double
    
    var addedToColumnIndex: Double
    
    var removedFromColumnIndex: Double
    
    var removedItemIndex: Double
  }
  object TimeTableChangeDetails {
    
    @scala.inline
    def apply(
      addedItemIndex: Double,
      addedToColumnIndex: Double,
      removedFromColumnIndex: Double,
      removedItemIndex: Double
    ): TimeTableChangeDetails = {
      val __obj = js.Dynamic.literal(addedItemIndex = addedItemIndex.asInstanceOf[js.Any], addedToColumnIndex = addedToColumnIndex.asInstanceOf[js.Any], removedFromColumnIndex = removedFromColumnIndex.asInstanceOf[js.Any], removedItemIndex = removedItemIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTableChangeDetails]
    }
    
    @scala.inline
    implicit class TimeTableChangeDetailsMutableBuilder[Self <: TimeTableChangeDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddedItemIndex(value: Double): Self = StObject.set(x, "addedItemIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddedToColumnIndex(value: Double): Self = StObject.set(x, "addedToColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedFromColumnIndex(value: Double): Self = StObject.set(x, "removedFromColumnIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovedItemIndex(value: Double): Self = StObject.set(x, "removedItemIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeTableColumn extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var droppable: js.UndefOr[Boolean] = js.undefined
    
    var items: js.Array[TimeTableItem]
    
    var subtitle: String
    
    var title: String
  }
  object TimeTableColumn {
    
    @scala.inline
    def apply(items: js.Array[TimeTableItem], subtitle: String, title: String): TimeTableColumn = {
      val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTableColumn]
    }
    
    @scala.inline
    implicit class TimeTableColumnMutableBuilder[Self <: TimeTableColumn] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDroppable(value: Boolean): Self = StObject.set(x, "droppable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDroppableUndefined: Self = StObject.set(x, "droppable", js.undefined)
      
      @scala.inline
      def setItems(value: js.Array[TimeTableItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsVarargs(value: TimeTableItem*): Self = StObject.set(x, "items", js.Array(value :_*))
      
      @scala.inline
      def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  type TimeTableContentRenderFunction = js.Function1[/* data */ TimeTableContentRenderFunctionData, ReactNode]
  
  trait TimeTableContentRenderFunctionData extends StObject {
    
    var Item: FC[TimeTableItemProps]
    
    var disabled: Boolean
    
    var draggable: Boolean
  }
  object TimeTableContentRenderFunctionData {
    
    @scala.inline
    def apply(Item: FC[TimeTableItemProps], disabled: Boolean, draggable: Boolean): TimeTableContentRenderFunctionData = {
      val __obj = js.Dynamic.literal(Item = Item.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTableContentRenderFunctionData]
    }
    
    @scala.inline
    implicit class TimeTableContentRenderFunctionDataMutableBuilder[Self <: TimeTableContentRenderFunctionData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: FC[TimeTableItemProps]): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.start
    - typings.wixStyleReact.wixStyleReactStrings.end
    - typings.wixStyleReact.wixStyleReactStrings.any
  */
  trait TimeTableInsertPosition extends StObject
  object TimeTableInsertPosition {
    
    @scala.inline
    def any: typings.wixStyleReact.wixStyleReactStrings.any = "any".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.any]
    
    @scala.inline
    def end: typings.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.end]
    
    @scala.inline
    def start: typings.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait TimeTableItem extends StObject {
    
    var content: ReactNode | TimeTableContentRenderFunction
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
  }
  object TimeTableItem {
    
    @scala.inline
    def apply(): TimeTableItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeTableItem]
    }
    
    @scala.inline
    implicit class TimeTableItemMutableBuilder[Self <: TimeTableItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactNode | TimeTableContentRenderFunction): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction1(value: /* data */ TimeTableContentRenderFunctionData => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
    }
  }
  
  trait TimeTableItemProps extends StObject {
    
    var disabled: Boolean
    
    var draggable: Boolean
  }
  object TimeTableItemProps {
    
    @scala.inline
    def apply(disabled: Boolean, draggable: Boolean): TimeTableItemProps = {
      val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any])
      __obj.asInstanceOf[TimeTableItemProps]
    }
    
    @scala.inline
    implicit class TimeTableItemPropsMutableBuilder[Self <: TimeTableItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
    }
  }
  
  trait TimeTableProps extends StObject {
    
    var addItemButtonLabel: js.UndefOr[ReactNode] = js.undefined
    
    var columns: js.UndefOr[js.Array[TimeTableColumn]] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var height: js.UndefOr[String | Double] = js.undefined
    
    var insertPosition: js.UndefOr[TimeTableInsertPosition] = js.undefined
    
    var onAdd: js.UndefOr[js.Function1[/* columnIndex */ Double, Unit]] = js.undefined
    
    var onChange: js.UndefOr[
        js.Function2[/* columns */ js.Array[TimeTableColumn], /* details */ TimeTableChangeDetails, Unit]
      ] = js.undefined
  }
  object TimeTableProps {
    
    @scala.inline
    def apply(): TimeTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimeTableProps]
    }
    
    @scala.inline
    implicit class TimeTablePropsMutableBuilder[Self <: TimeTableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddItemButtonLabel(value: ReactNode): Self = StObject.set(x, "addItemButtonLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddItemButtonLabelUndefined: Self = StObject.set(x, "addItemButtonLabel", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[TimeTableColumn]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      @scala.inline
      def setColumnsVarargs(value: TimeTableColumn*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInsertPosition(value: TimeTableInsertPosition): Self = StObject.set(x, "insertPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInsertPositionUndefined: Self = StObject.set(x, "insertPosition", js.undefined)
      
      @scala.inline
      def setOnAdd(value: /* columnIndex */ Double => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      @scala.inline
      def setOnChange(value: (/* columns */ js.Array[TimeTableColumn], /* details */ TimeTableChangeDetails) => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    }
  }
}
