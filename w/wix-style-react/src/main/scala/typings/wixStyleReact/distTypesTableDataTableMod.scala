package typings.wixStyleReact

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import typings.react.mod.RefObject
import typings.std.HTMLElement
import typings.wixStyleReact.anon.IdString
import typings.wixStyleReact.anon.IsDragAndDropDisabled
import typings.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableDataTableMod {
  
  @JSImport("wix-style-react/dist/types/Table/DataTable", JSImport.Default)
  @js.native
  open class default[RowData] ()
    extends Component[DataTableProps[RowData], js.Object, Any]
  
  type DataTable[RowData] = Component[DataTableProps[RowData], js.Object, Any]
  
  trait DataTableColumn[RowData] extends StObject {
    
    var align: js.UndefOr[DataTableColumnAlign] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var important: js.UndefOr[Boolean] = js.undefined
    
    var infoTooltipProps: js.UndefOr[PopoverPropsWithContent] = js.undefined
    
    var key: js.UndefOr[Key] = js.undefined
    
    def render(row: RowData, rowNum: Double): ReactNode
    
    var sortDescending: js.UndefOr[Boolean] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var stickyActionCell: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[
        CSSProperties | (js.Function3[
          /* column */ DataTableColumn[RowDataDefaultType], 
          /* rowData */ RowData, 
          /* rowNum */ Double, 
          CSSProperties
        ])
      ] = js.undefined
    
    var title: ReactNode
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object DataTableColumn {
    
    inline def apply[RowData](render: (RowData, Double) => ReactNode): DataTableColumn[RowData] = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[DataTableColumn[RowData]]
    }
    
    extension [Self <: DataTableColumn[?], RowData](x: Self & DataTableColumn[RowData]) {
      
      inline def setAlign(value: DataTableColumnAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      inline def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      inline def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      inline def setInfoTooltipProps(value: PopoverPropsWithContent): Self = StObject.set(x, "infoTooltipProps", value.asInstanceOf[js.Any])
      
      inline def setInfoTooltipPropsUndefined: Self = StObject.set(x, "infoTooltipProps", js.undefined)
      
      inline def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRender(value: (RowData, Double) => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setSortDescending(value: Boolean): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
      
      inline def setSortDescendingUndefined: Self = StObject.set(x, "sortDescending", js.undefined)
      
      inline def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      inline def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      inline def setStickyActionCell(value: Boolean): Self = StObject.set(x, "stickyActionCell", value.asInstanceOf[js.Any])
      
      inline def setStickyActionCellUndefined: Self = StObject.set(x, "stickyActionCell", js.undefined)
      
      inline def setStyle(
        value: CSSProperties | (js.Function3[
              /* column */ DataTableColumn[RowDataDefaultType], 
              /* rowData */ RowData, 
              /* rowNum */ Double, 
              CSSProperties
            ])
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleFunction3(
        value: (/* column */ DataTableColumn[RowDataDefaultType], /* rowData */ RowData, /* rowNum */ Double) => CSSProperties
      ): Self = StObject.set(x, "style", js.Any.fromFunction3(value))
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.start
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.end
  */
  trait DataTableColumnAlign extends StObject
  object DataTableColumnAlign {
    
    inline def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    inline def end: typings.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.end]
    
    inline def start: typings.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait DataTableProps[RowData] extends StObject {
    
    var allowMultiDetailsExpansion: js.UndefOr[Boolean] = js.undefined
    
    var columns: js.Array[DataTableColumn[RowData]]
    
    var data: js.UndefOr[js.Array[RowData]] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dragAndDrop: js.UndefOr[Any] = js.undefined
    
    var dynamicRowClass: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, String]] = js.undefined
    
    var hasMore: js.UndefOr[Boolean] = js.undefined
    
    var hideHeader: js.UndefOr[Boolean] = js.undefined
    
    var hideHeaderAccessible: js.UndefOr[Boolean] = js.undefined
    
    var horizontalScroll: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var infiniteScroll: js.UndefOr[Boolean] = js.undefined
    
    var infiniteScrollRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var initialLoad: js.UndefOr[Boolean] = js.undefined
    
    var isRowDisabled: js.UndefOr[js.Function1[/* rowData */ RowData, Boolean]] = js.undefined
    
    var isRowHighlight: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Boolean]] = js.undefined
    
    var isRowSelected: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Boolean]] = js.undefined
    
    var itemsPerPage: js.UndefOr[Double] = js.undefined
    
    var loadMore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var loader: js.UndefOr[ReactNode] = js.undefined
    
    var onMouseEnterRow: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Unit]] = js.undefined
    
    var onMouseLeaveRow: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Unit]] = js.undefined
    
    var onRowClick: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Unit]] = js.undefined
    
    var onSortClick: js.UndefOr[
        js.Function2[/* column */ DataTableColumn[RowDataDefaultType], /* colNum */ Double, Unit]
      ] = js.undefined
    
    var removeRowDetailsPadding: js.UndefOr[Boolean] = js.undefined
    
    var rowClass: js.UndefOr[String] = js.undefined
    
    var rowDataHook: js.UndefOr[String | DataTableRowDataHookFn[RowData]] = js.undefined
    
    var rowDetails: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, ReactNode]] = js.undefined
    
    var rowVerticalPadding: js.UndefOr[DataTableRowVerticalPadding] = js.undefined
    
    var scrollElement: js.UndefOr[HTMLElement | RefObject[Any]] = js.undefined
    
    var selectedRowsIds: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var showHeaderWhenEmpty: js.UndefOr[Boolean] = js.undefined
    
    var showLastRowDivider: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[DataTableSkin] = js.undefined
    
    var stickyColumns: js.UndefOr[Double] = js.undefined
    
    var useWindow: js.UndefOr[Boolean] = js.undefined
    
    var virtualized: js.UndefOr[Boolean] = js.undefined
    
    var virtualizedLineHeight: js.UndefOr[Double] = js.undefined
    
    var virtualizedListRef: js.UndefOr[LegacyRef[Any]] = js.undefined
    
    var virtualizedTableHeight: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object DataTableProps {
    
    inline def apply[RowData](columns: js.Array[DataTableColumn[RowData]]): DataTableProps[RowData] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTableProps[RowData]]
    }
    
    extension [Self <: DataTableProps[?], RowData](x: Self & DataTableProps[RowData]) {
      
      inline def setAllowMultiDetailsExpansion(value: Boolean): Self = StObject.set(x, "allowMultiDetailsExpansion", value.asInstanceOf[js.Any])
      
      inline def setAllowMultiDetailsExpansionUndefined: Self = StObject.set(x, "allowMultiDetailsExpansion", js.undefined)
      
      inline def setColumns(value: js.Array[DataTableColumn[RowData]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: DataTableColumn[RowData]*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: js.Array[RowData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDataVarargs(value: RowData*): Self = StObject.set(x, "data", js.Array(value*))
      
      inline def setDragAndDrop(value: Any): Self = StObject.set(x, "dragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setDragAndDropUndefined: Self = StObject.set(x, "dragAndDrop", js.undefined)
      
      inline def setDynamicRowClass(value: (/* rowData */ RowData, /* rowNum */ Double) => String): Self = StObject.set(x, "dynamicRowClass", js.Any.fromFunction2(value))
      
      inline def setDynamicRowClassUndefined: Self = StObject.set(x, "dynamicRowClass", js.undefined)
      
      inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
      
      inline def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      inline def setHideHeaderAccessible(value: Boolean): Self = StObject.set(x, "hideHeaderAccessible", value.asInstanceOf[js.Any])
      
      inline def setHideHeaderAccessibleUndefined: Self = StObject.set(x, "hideHeaderAccessible", js.undefined)
      
      inline def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      inline def setHorizontalScroll(value: Boolean): Self = StObject.set(x, "horizontalScroll", value.asInstanceOf[js.Any])
      
      inline def setHorizontalScrollUndefined: Self = StObject.set(x, "horizontalScroll", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInfiniteScroll(value: Boolean): Self = StObject.set(x, "infiniteScroll", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollRef(value: Ref[Any]): Self = StObject.set(x, "infiniteScrollRef", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "infiniteScrollRef", js.Any.fromFunction1(value))
      
      inline def setInfiniteScrollRefNull: Self = StObject.set(x, "infiniteScrollRef", null)
      
      inline def setInfiniteScrollRefUndefined: Self = StObject.set(x, "infiniteScrollRef", js.undefined)
      
      inline def setInfiniteScrollUndefined: Self = StObject.set(x, "infiniteScroll", js.undefined)
      
      inline def setInitialLoad(value: Boolean): Self = StObject.set(x, "initialLoad", value.asInstanceOf[js.Any])
      
      inline def setInitialLoadUndefined: Self = StObject.set(x, "initialLoad", js.undefined)
      
      inline def setIsRowDisabled(value: /* rowData */ RowData => Boolean): Self = StObject.set(x, "isRowDisabled", js.Any.fromFunction1(value))
      
      inline def setIsRowDisabledUndefined: Self = StObject.set(x, "isRowDisabled", js.undefined)
      
      inline def setIsRowHighlight(value: (/* rowData */ RowData, /* rowNum */ Double) => Boolean): Self = StObject.set(x, "isRowHighlight", js.Any.fromFunction2(value))
      
      inline def setIsRowHighlightUndefined: Self = StObject.set(x, "isRowHighlight", js.undefined)
      
      inline def setIsRowSelected(value: (/* rowData */ RowData, /* rowNum */ Double) => Boolean): Self = StObject.set(x, "isRowSelected", js.Any.fromFunction2(value))
      
      inline def setIsRowSelectedUndefined: Self = StObject.set(x, "isRowSelected", js.undefined)
      
      inline def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      inline def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
      
      inline def setLoadMore(value: () => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction0(value))
      
      inline def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      inline def setLoader(value: ReactNode): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setOnMouseEnterRow(value: (/* rowData */ RowData, /* rowNum */ Double) => Unit): Self = StObject.set(x, "onMouseEnterRow", js.Any.fromFunction2(value))
      
      inline def setOnMouseEnterRowUndefined: Self = StObject.set(x, "onMouseEnterRow", js.undefined)
      
      inline def setOnMouseLeaveRow(value: (/* rowData */ RowData, /* rowNum */ Double) => Unit): Self = StObject.set(x, "onMouseLeaveRow", js.Any.fromFunction2(value))
      
      inline def setOnMouseLeaveRowUndefined: Self = StObject.set(x, "onMouseLeaveRow", js.undefined)
      
      inline def setOnRowClick(value: (/* rowData */ RowData, /* rowNum */ Double) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2(value))
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setOnSortClick(value: (/* column */ DataTableColumn[RowDataDefaultType], /* colNum */ Double) => Unit): Self = StObject.set(x, "onSortClick", js.Any.fromFunction2(value))
      
      inline def setOnSortClickUndefined: Self = StObject.set(x, "onSortClick", js.undefined)
      
      inline def setRemoveRowDetailsPadding(value: Boolean): Self = StObject.set(x, "removeRowDetailsPadding", value.asInstanceOf[js.Any])
      
      inline def setRemoveRowDetailsPaddingUndefined: Self = StObject.set(x, "removeRowDetailsPadding", js.undefined)
      
      inline def setRowClass(value: String): Self = StObject.set(x, "rowClass", value.asInstanceOf[js.Any])
      
      inline def setRowClassUndefined: Self = StObject.set(x, "rowClass", js.undefined)
      
      inline def setRowDataHook(value: String | DataTableRowDataHookFn[RowData]): Self = StObject.set(x, "rowDataHook", value.asInstanceOf[js.Any])
      
      inline def setRowDataHookFunction2(value: (RowData, /* rowNum */ Double) => String): Self = StObject.set(x, "rowDataHook", js.Any.fromFunction2(value))
      
      inline def setRowDataHookUndefined: Self = StObject.set(x, "rowDataHook", js.undefined)
      
      inline def setRowDetails(value: (/* rowData */ RowData, /* rowNum */ Double) => ReactNode): Self = StObject.set(x, "rowDetails", js.Any.fromFunction2(value))
      
      inline def setRowDetailsUndefined: Self = StObject.set(x, "rowDetails", js.undefined)
      
      inline def setRowVerticalPadding(value: DataTableRowVerticalPadding): Self = StObject.set(x, "rowVerticalPadding", value.asInstanceOf[js.Any])
      
      inline def setRowVerticalPaddingUndefined: Self = StObject.set(x, "rowVerticalPadding", js.undefined)
      
      inline def setScrollElement(value: HTMLElement | RefObject[Any]): Self = StObject.set(x, "scrollElement", value.asInstanceOf[js.Any])
      
      inline def setScrollElementUndefined: Self = StObject.set(x, "scrollElement", js.undefined)
      
      inline def setSelectedRowsIds(value: js.Array[String | Double]): Self = StObject.set(x, "selectedRowsIds", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowsIdsUndefined: Self = StObject.set(x, "selectedRowsIds", js.undefined)
      
      inline def setSelectedRowsIdsVarargs(value: (String | Double)*): Self = StObject.set(x, "selectedRowsIds", js.Array(value*))
      
      inline def setShowHeaderWhenEmpty(value: Boolean): Self = StObject.set(x, "showHeaderWhenEmpty", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderWhenEmptyUndefined: Self = StObject.set(x, "showHeaderWhenEmpty", js.undefined)
      
      inline def setShowLastRowDivider(value: Boolean): Self = StObject.set(x, "showLastRowDivider", value.asInstanceOf[js.Any])
      
      inline def setShowLastRowDividerUndefined: Self = StObject.set(x, "showLastRowDivider", js.undefined)
      
      inline def setSkin(value: DataTableSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setStickyColumns(value: Double): Self = StObject.set(x, "stickyColumns", value.asInstanceOf[js.Any])
      
      inline def setStickyColumnsUndefined: Self = StObject.set(x, "stickyColumns", js.undefined)
      
      inline def setUseWindow(value: Boolean): Self = StObject.set(x, "useWindow", value.asInstanceOf[js.Any])
      
      inline def setUseWindowUndefined: Self = StObject.set(x, "useWindow", js.undefined)
      
      inline def setVirtualized(value: Boolean): Self = StObject.set(x, "virtualized", value.asInstanceOf[js.Any])
      
      inline def setVirtualizedLineHeight(value: Double): Self = StObject.set(x, "virtualizedLineHeight", value.asInstanceOf[js.Any])
      
      inline def setVirtualizedLineHeightUndefined: Self = StObject.set(x, "virtualizedLineHeight", js.undefined)
      
      inline def setVirtualizedListRef(value: LegacyRef[Any]): Self = StObject.set(x, "virtualizedListRef", value.asInstanceOf[js.Any])
      
      inline def setVirtualizedListRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "virtualizedListRef", js.Any.fromFunction1(value))
      
      inline def setVirtualizedListRefNull: Self = StObject.set(x, "virtualizedListRef", null)
      
      inline def setVirtualizedListRefUndefined: Self = StObject.set(x, "virtualizedListRef", js.undefined)
      
      inline def setVirtualizedTableHeight(value: Double): Self = StObject.set(x, "virtualizedTableHeight", value.asInstanceOf[js.Any])
      
      inline def setVirtualizedTableHeightUndefined: Self = StObject.set(x, "virtualizedTableHeight", js.undefined)
      
      inline def setVirtualizedUndefined: Self = StObject.set(x, "virtualized", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type DataTableRowDataHookFn[RowData] = js.Function2[/* rowData */ RowData, /* rowNum */ Double, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait DataTableRowVerticalPadding extends StObject
  object DataTableRowVerticalPadding {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.neutral
  */
  trait DataTableSkin extends StObject
  object DataTableSkin {
    
    inline def neutral: typings.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutral]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
  }
  
  trait DragEndEvent extends StObject {
    
    var active: IdString
    
    var over: IdString | Null
  }
  object DragEndEvent {
    
    inline def apply(active: IdString): DragEndEvent = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], over = null)
      __obj.asInstanceOf[DragEndEvent]
    }
    
    extension [Self <: DragEndEvent](x: Self) {
      
      inline def setActive(value: IdString): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setOver(value: IdString): Self = StObject.set(x, "over", value.asInstanceOf[js.Any])
      
      inline def setOverNull: Self = StObject.set(x, "over", null)
    }
  }
  
  trait DragStartEvent extends StObject {
    
    var active: IdString
  }
  object DragStartEvent {
    
    inline def apply(active: IdString): DragStartEvent = {
      val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragStartEvent]
    }
    
    extension [Self <: DragStartEvent](x: Self) {
      
      inline def setActive(value: IdString): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
    }
  }
  
  trait DraggableTableRowProps[E] extends StObject {
    
    var children: js.UndefOr[E] = js.undefined
    
    var id: String
    
    var index: Double
    
    var isDragAndDropDisabled: js.UndefOr[Boolean] = js.undefined
    
    var isDragOverlay: js.UndefOr[Boolean] = js.undefined
  }
  object DraggableTableRowProps {
    
    inline def apply[E](id: String, index: Double): DraggableTableRowProps[E] = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[DraggableTableRowProps[E]]
    }
    
    extension [Self <: DraggableTableRowProps[?], E](x: Self & DraggableTableRowProps[E]) {
      
      inline def setChildren(value: E): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIsDragAndDropDisabled(value: Boolean): Self = StObject.set(x, "isDragAndDropDisabled", value.asInstanceOf[js.Any])
      
      inline def setIsDragAndDropDisabledUndefined: Self = StObject.set(x, "isDragAndDropDisabled", js.undefined)
      
      inline def setIsDragOverlay(value: Boolean): Self = StObject.set(x, "isDragOverlay", value.asInstanceOf[js.Any])
      
      inline def setIsDragOverlayUndefined: Self = StObject.set(x, "isDragOverlay", js.undefined)
    }
  }
  
  trait PopoverPropsWithContent
    extends StObject
       with PopoverCommonProps {
    
    var content: js.UndefOr[ReactNode] = js.undefined
  }
  object PopoverPropsWithContent {
    
    inline def apply(): PopoverPropsWithContent = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverPropsWithContent]
    }
    
    extension [Self <: PopoverPropsWithContent](x: Self) {
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    }
  }
  
  type RowDataDefaultType = Any
  
  trait TableDragAndDrop[E /* <: ReactElement */] extends StObject {
    
    var DraggableTableRow: ComponentType[DraggableTableRowProps[E]]
    
    var DroppableTableContext: ComponentType[IsDragAndDropDisabled]
  }
  object TableDragAndDrop {
    
    inline def apply[E /* <: ReactElement */](
      DraggableTableRow: ComponentType[DraggableTableRowProps[E]],
      DroppableTableContext: ComponentType[IsDragAndDropDisabled]
    ): TableDragAndDrop[E] = {
      val __obj = js.Dynamic.literal(DraggableTableRow = DraggableTableRow.asInstanceOf[js.Any], DroppableTableContext = DroppableTableContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableDragAndDrop[E]]
    }
    
    extension [Self <: TableDragAndDrop[?], E /* <: ReactElement */](x: Self & TableDragAndDrop[E]) {
      
      inline def setDraggableTableRow(value: ComponentType[DraggableTableRowProps[E]]): Self = StObject.set(x, "DraggableTableRow", value.asInstanceOf[js.Any])
      
      inline def setDroppableTableContext(value: ComponentType[IsDragAndDropDisabled]): Self = StObject.set(x, "DroppableTableContext", value.asInstanceOf[js.Any])
    }
  }
}
