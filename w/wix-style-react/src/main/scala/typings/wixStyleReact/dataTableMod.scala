package typings.wixStyleReact

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLElement
import typings.wixStyleReact.commonMod.PopoverCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataTableMod {
  
  @JSImport("wix-style-react/dist/es/src/Table/DataTable", JSImport.Default)
  @js.native
  class default[RowData] ()
    extends Component[DataTableProps[RowData], js.Object, js.Any]
  
  type DataTable[RowData] = Component[DataTableProps[RowData], js.Object, js.Any]
  
  trait DataTableColumn[RowData] extends StObject {
    
    var align: js.UndefOr[DataTableColumnAlign] = js.undefined
    
    var important: js.UndefOr[Boolean] = js.undefined
    
    var infoTooltipProps: js.UndefOr[PopoverCommonProps] = js.undefined
    
    def render(row: RowData, rowNum: Double): ReactNode
    
    var sortDescending: js.UndefOr[Boolean] = js.undefined
    
    var sortable: js.UndefOr[Boolean] = js.undefined
    
    var stickyActionCell: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var title: ReactNode
    
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object DataTableColumn {
    
    @scala.inline
    def apply[RowData](render: (RowData, Double) => ReactNode): DataTableColumn[RowData] = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction2(render))
      __obj.asInstanceOf[DataTableColumn[RowData]]
    }
    
    @scala.inline
    implicit class DataTableColumnMutableBuilder[Self <: DataTableColumn[?], RowData] (val x: Self & DataTableColumn[RowData]) extends AnyVal {
      
      @scala.inline
      def setAlign(value: DataTableColumnAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
      
      @scala.inline
      def setImportant(value: Boolean): Self = StObject.set(x, "important", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImportantUndefined: Self = StObject.set(x, "important", js.undefined)
      
      @scala.inline
      def setInfoTooltipProps(value: PopoverCommonProps): Self = StObject.set(x, "infoTooltipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfoTooltipPropsUndefined: Self = StObject.set(x, "infoTooltipProps", js.undefined)
      
      @scala.inline
      def setRender(value: (RowData, Double) => ReactNode): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSortDescending(value: Boolean): Self = StObject.set(x, "sortDescending", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortDescendingUndefined: Self = StObject.set(x, "sortDescending", js.undefined)
      
      @scala.inline
      def setSortable(value: Boolean): Self = StObject.set(x, "sortable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortableUndefined: Self = StObject.set(x, "sortable", js.undefined)
      
      @scala.inline
      def setStickyActionCell(value: Boolean): Self = StObject.set(x, "stickyActionCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyActionCellUndefined: Self = StObject.set(x, "stickyActionCell", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.start
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.end
  */
  trait DataTableColumnAlign extends StObject
  object DataTableColumnAlign {
    
    @scala.inline
    def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    @scala.inline
    def end: typings.wixStyleReact.wixStyleReactStrings.end = "end".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.end]
    
    @scala.inline
    def start: typings.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.start]
  }
  
  trait DataTableProps[RowData] extends StObject {
    
    var allowMultiDetailsExpansion: js.UndefOr[Boolean] = js.undefined
    
    var columns: js.Array[DataTableColumn[RowDataDefaultType]]
    
    var data: js.UndefOr[js.Array[RowData]] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dynamicRowClass: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, String]] = js.undefined
    
    var hasMore: js.UndefOr[Boolean] = js.undefined
    
    var hideHeader: js.UndefOr[Boolean] = js.undefined
    
    var horizontalScroll: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var infiniteScroll: js.UndefOr[Boolean] = js.undefined
    
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
    
    var rowClass: js.UndefOr[String] = js.undefined
    
    var rowDataHook: js.UndefOr[String | DataTableRowDataHookFn[RowDataDefaultType]] = js.undefined
    
    var rowDetails: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, ReactNode]] = js.undefined
    
    var rowVerticalPadding: js.UndefOr[DataTableRowVerticalPadding] = js.undefined
    
    var scrollElement: js.UndefOr[HTMLElement | RefObject[js.Any]] = js.undefined
    
    var selectedRowsIds: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    var showHeaderWhenEmpty: js.UndefOr[Boolean] = js.undefined
    
    var showLastRowDivider: js.UndefOr[Boolean] = js.undefined
    
    var skin: js.UndefOr[DataTableSkin] = js.undefined
    
    var stickyColumns: js.UndefOr[Double] = js.undefined
    
    var useWindow: js.UndefOr[Boolean] = js.undefined
    
    var virtualized: js.UndefOr[Boolean] = js.undefined
    
    var virtualizedLineHeight: js.UndefOr[Double] = js.undefined
    
    var virtualizedListRef: js.UndefOr[LegacyRef[js.Any]] = js.undefined
    
    var virtualizedTableHeight: js.UndefOr[Double] = js.undefined
    
    var width: js.UndefOr[String] = js.undefined
  }
  object DataTableProps {
    
    @scala.inline
    def apply[RowData](columns: js.Array[DataTableColumn[RowDataDefaultType]]): DataTableProps[RowData] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataTableProps[RowData]]
    }
    
    @scala.inline
    implicit class DataTablePropsMutableBuilder[Self <: DataTableProps[?], RowData] (val x: Self & DataTableProps[RowData]) extends AnyVal {
      
      @scala.inline
      def setAllowMultiDetailsExpansion(value: Boolean): Self = StObject.set(x, "allowMultiDetailsExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultiDetailsExpansionUndefined: Self = StObject.set(x, "allowMultiDetailsExpansion", js.undefined)
      
      @scala.inline
      def setColumns(value: js.Array[DataTableColumn[RowDataDefaultType]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: DataTableColumn[RowDataDefaultType]*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setData(value: js.Array[RowData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDataVarargs(value: RowData*): Self = StObject.set(x, "data", js.Array(value :_*))
      
      @scala.inline
      def setDynamicRowClass(value: (/* rowData */ RowData, /* rowNum */ Double) => String): Self = StObject.set(x, "dynamicRowClass", js.Any.fromFunction2(value))
      
      @scala.inline
      def setDynamicRowClassUndefined: Self = StObject.set(x, "dynamicRowClass", js.undefined)
      
      @scala.inline
      def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
      
      @scala.inline
      def setHideHeader(value: Boolean): Self = StObject.set(x, "hideHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideHeaderUndefined: Self = StObject.set(x, "hideHeader", js.undefined)
      
      @scala.inline
      def setHorizontalScroll(value: Boolean): Self = StObject.set(x, "horizontalScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalScrollUndefined: Self = StObject.set(x, "horizontalScroll", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInfiniteScroll(value: Boolean): Self = StObject.set(x, "infiniteScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteScrollUndefined: Self = StObject.set(x, "infiniteScroll", js.undefined)
      
      @scala.inline
      def setIsRowDisabled(value: /* rowData */ RowData => Boolean): Self = StObject.set(x, "isRowDisabled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setIsRowDisabledUndefined: Self = StObject.set(x, "isRowDisabled", js.undefined)
      
      @scala.inline
      def setIsRowHighlight(value: (/* rowData */ RowData, /* rowNum */ Double) => Boolean): Self = StObject.set(x, "isRowHighlight", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsRowHighlightUndefined: Self = StObject.set(x, "isRowHighlight", js.undefined)
      
      @scala.inline
      def setIsRowSelected(value: (/* rowData */ RowData, /* rowNum */ Double) => Boolean): Self = StObject.set(x, "isRowSelected", js.Any.fromFunction2(value))
      
      @scala.inline
      def setIsRowSelectedUndefined: Self = StObject.set(x, "isRowSelected", js.undefined)
      
      @scala.inline
      def setItemsPerPage(value: Double): Self = StObject.set(x, "itemsPerPage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemsPerPageUndefined: Self = StObject.set(x, "itemsPerPage", js.undefined)
      
      @scala.inline
      def setLoadMore(value: () => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      @scala.inline
      def setLoader(value: ReactNode): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setOnMouseEnterRow(value: (/* rowData */ RowData, /* rowNum */ Double) => Unit): Self = StObject.set(x, "onMouseEnterRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseEnterRowUndefined: Self = StObject.set(x, "onMouseEnterRow", js.undefined)
      
      @scala.inline
      def setOnMouseLeaveRow(value: (/* rowData */ RowData, /* rowNum */ Double) => Unit): Self = StObject.set(x, "onMouseLeaveRow", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnMouseLeaveRowUndefined: Self = StObject.set(x, "onMouseLeaveRow", js.undefined)
      
      @scala.inline
      def setOnRowClick(value: (/* rowData */ RowData, /* rowNum */ Double) => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      @scala.inline
      def setOnSortClick(value: (/* column */ DataTableColumn[RowDataDefaultType], /* colNum */ Double) => Unit): Self = StObject.set(x, "onSortClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSortClickUndefined: Self = StObject.set(x, "onSortClick", js.undefined)
      
      @scala.inline
      def setRowClass(value: String): Self = StObject.set(x, "rowClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowClassUndefined: Self = StObject.set(x, "rowClass", js.undefined)
      
      @scala.inline
      def setRowDataHook(value: String | DataTableRowDataHookFn[RowDataDefaultType]): Self = StObject.set(x, "rowDataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowDataHookFunction2(value: (RowDataDefaultType, /* rowNum */ Double) => String): Self = StObject.set(x, "rowDataHook", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowDataHookUndefined: Self = StObject.set(x, "rowDataHook", js.undefined)
      
      @scala.inline
      def setRowDetails(value: (/* rowData */ RowData, /* rowNum */ Double) => ReactNode): Self = StObject.set(x, "rowDetails", js.Any.fromFunction2(value))
      
      @scala.inline
      def setRowDetailsUndefined: Self = StObject.set(x, "rowDetails", js.undefined)
      
      @scala.inline
      def setRowVerticalPadding(value: DataTableRowVerticalPadding): Self = StObject.set(x, "rowVerticalPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowVerticalPaddingUndefined: Self = StObject.set(x, "rowVerticalPadding", js.undefined)
      
      @scala.inline
      def setScrollElement(value: HTMLElement | RefObject[js.Any]): Self = StObject.set(x, "scrollElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollElementUndefined: Self = StObject.set(x, "scrollElement", js.undefined)
      
      @scala.inline
      def setSelectedRowsIds(value: js.Array[String | Double]): Self = StObject.set(x, "selectedRowsIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRowsIdsUndefined: Self = StObject.set(x, "selectedRowsIds", js.undefined)
      
      @scala.inline
      def setSelectedRowsIdsVarargs(value: (String | Double)*): Self = StObject.set(x, "selectedRowsIds", js.Array(value :_*))
      
      @scala.inline
      def setShowHeaderWhenEmpty(value: Boolean): Self = StObject.set(x, "showHeaderWhenEmpty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowHeaderWhenEmptyUndefined: Self = StObject.set(x, "showHeaderWhenEmpty", js.undefined)
      
      @scala.inline
      def setShowLastRowDivider(value: Boolean): Self = StObject.set(x, "showLastRowDivider", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLastRowDividerUndefined: Self = StObject.set(x, "showLastRowDivider", js.undefined)
      
      @scala.inline
      def setSkin(value: DataTableSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      @scala.inline
      def setStickyColumns(value: Double): Self = StObject.set(x, "stickyColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStickyColumnsUndefined: Self = StObject.set(x, "stickyColumns", js.undefined)
      
      @scala.inline
      def setUseWindow(value: Boolean): Self = StObject.set(x, "useWindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseWindowUndefined: Self = StObject.set(x, "useWindow", js.undefined)
      
      @scala.inline
      def setVirtualized(value: Boolean): Self = StObject.set(x, "virtualized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualizedLineHeight(value: Double): Self = StObject.set(x, "virtualizedLineHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualizedLineHeightUndefined: Self = StObject.set(x, "virtualizedLineHeight", js.undefined)
      
      @scala.inline
      def setVirtualizedListRef(value: LegacyRef[js.Any]): Self = StObject.set(x, "virtualizedListRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualizedListRefFunction1(value: /* instance */ js.Any | Null => Unit): Self = StObject.set(x, "virtualizedListRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setVirtualizedListRefNull: Self = StObject.set(x, "virtualizedListRef", null)
      
      @scala.inline
      def setVirtualizedListRefUndefined: Self = StObject.set(x, "virtualizedListRef", js.undefined)
      
      @scala.inline
      def setVirtualizedTableHeight(value: Double): Self = StObject.set(x, "virtualizedTableHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVirtualizedTableHeightUndefined: Self = StObject.set(x, "virtualizedTableHeight", js.undefined)
      
      @scala.inline
      def setVirtualizedUndefined: Self = StObject.set(x, "virtualized", js.undefined)
      
      @scala.inline
      def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type DataTableRowDataHookFn[RowData] = js.Function2[/* rowData */ RowData, /* rowNum */ Double, String]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait DataTableRowVerticalPadding extends StObject
  object DataTableRowVerticalPadding {
    
    @scala.inline
    def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.neutral
  */
  trait DataTableSkin extends StObject
  object DataTableSkin {
    
    @scala.inline
    def neutral: typings.wixStyleReact.wixStyleReactStrings.neutral = "neutral".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.neutral]
    
    @scala.inline
    def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
  }
  
  type RowDataDefaultType = js.Any
}
