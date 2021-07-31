package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.react.mod.LegacyRef
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.react.mod.SFC
import typings.std.HTMLElement
import typings.wixStyleReact.anon.DataHookString
import typings.wixStyleReact.anon.Origin
import typings.wixStyleReact.anon.TitleBarVisible
import typings.wixStyleReact.anon.Type
import typings.wixStyleReact.anon.`1`
import typings.wixStyleReact.dataTableMod.DataTableColumn
import typings.wixStyleReact.dataTableMod.DataTableRowDataHookFn
import typings.wixStyleReact.dataTableMod.DataTableRowVerticalPadding
import typings.wixStyleReact.dataTableMod.DataTableSkin
import typings.wixStyleReact.dataTableMod.RowDataDefaultType
import typings.wixStyleReact.emptyStateMod.EmptyStateProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableMod {
  
  @JSImport("wix-style-react/dist/es/src/Table", JSImport.Default)
  @js.native
  class default[RowData] () extends Table[RowData]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/Table", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/Table", "default.BulkSelectionCheckbox")
    @js.native
    def BulkSelectionCheckbox: SFC[DataHookString] = js.native
    @scala.inline
    def BulkSelectionCheckbox_=(x: SFC[DataHookString]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BulkSelectionCheckbox")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Table", "default.Content")
    @js.native
    def Content: SFC[TitleBarVisible] = js.native
    @scala.inline
    def Content_=(x: SFC[TitleBarVisible]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Table", "default.EmptyState")
    @js.native
    def EmptyState: SFC[EmptyStateProps] = js.native
    @scala.inline
    def EmptyState_=(x: SFC[EmptyStateProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmptyState")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Table", "default.SubToolbar")
    @js.native
    def SubToolbar: FunctionComponent[`1`] = js.native
    @scala.inline
    def SubToolbar_=(x: FunctionComponent[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubToolbar")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Table", "default.Titlebar")
    @js.native
    def Titlebar: SFC[`1`] = js.native
    @scala.inline
    def Titlebar_=(x: SFC[`1`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Titlebar")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/es/src/Table", "default.ToolbarContainer")
    @js.native
    def ToolbarContainer: SFC[js.Object] = js.native
    @scala.inline
    def ToolbarContainer_=(x: SFC[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ToolbarContainer")(x.asInstanceOf[js.Any])
  }
  
  type OnSelectionChangedFn = js.Function2[
    /* selectedIds */ js.UndefOr[(js.Array[Double | String]) | Null], 
    /* change */ Origin | Type, 
    Unit
  ]
  
  @js.native
  trait Table[RowData]
    extends Component[TableProps[RowData], js.Object, js.Any] {
    
    def setSelectedIds(): Unit = js.native
    def setSelectedIds(selectedIds: js.Array[Double | String]): Unit = js.native
  }
  
  type TableColumn[RowDataType] = DataTableColumn[RowDataType]
  
  trait TableProps[RowData]
    extends StObject
       with UsedDataTableProps[RowData] {
    
    var columns: js.Array[TableColumn[RowData]]
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var deselectRowsByDefault: js.UndefOr[Boolean] = js.undefined
    
    var hideBulkSelectionCheckbox: js.UndefOr[Boolean] = js.undefined
    
    var onSelectionChanged: js.UndefOr[OnSelectionChangedFn] = js.undefined
    
    var onSortClick: js.UndefOr[
        js.Function2[/* colData */ TableColumn[RowDataDefaultType], /* colNum */ Double, Unit]
      ] = js.undefined
    
    var selectedIds: js.UndefOr[js.Array[Double | String]] = js.undefined
    
    var selectionDisabled: js.UndefOr[Boolean] = js.undefined
    
    var showSelection: js.UndefOr[Boolean] = js.undefined
    
    var totalSelectableCount: js.UndefOr[Double] = js.undefined
    
    var withWrapper: js.UndefOr[Boolean] = js.undefined
  }
  object TableProps {
    
    @scala.inline
    def apply[RowData](columns: js.Array[TableColumn[RowData]]): TableProps[RowData] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableProps[RowData]]
    }
    
    @scala.inline
    implicit class TablePropsMutableBuilder[Self <: TableProps[?], RowData] (val x: Self & TableProps[RowData]) extends AnyVal {
      
      @scala.inline
      def setColumns(value: js.Array[TableColumn[RowData]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsVarargs(value: TableColumn[RowData]*): Self = StObject.set(x, "columns", js.Array(value :_*))
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDeselectRowsByDefault(value: Boolean): Self = StObject.set(x, "deselectRowsByDefault", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeselectRowsByDefaultUndefined: Self = StObject.set(x, "deselectRowsByDefault", js.undefined)
      
      @scala.inline
      def setHideBulkSelectionCheckbox(value: Boolean): Self = StObject.set(x, "hideBulkSelectionCheckbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideBulkSelectionCheckboxUndefined: Self = StObject.set(x, "hideBulkSelectionCheckbox", js.undefined)
      
      @scala.inline
      def setOnSelectionChanged(
        value: (/* selectedIds */ js.UndefOr[(js.Array[Double | String]) | Null], /* change */ Origin | Type) => Unit
      ): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
      
      @scala.inline
      def setOnSortClick(value: (/* colData */ TableColumn[RowDataDefaultType], /* colNum */ Double) => Unit): Self = StObject.set(x, "onSortClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSortClickUndefined: Self = StObject.set(x, "onSortClick", js.undefined)
      
      @scala.inline
      def setSelectedIds(value: js.Array[Double | String]): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIdsUndefined: Self = StObject.set(x, "selectedIds", js.undefined)
      
      @scala.inline
      def setSelectedIdsVarargs(value: (Double | String)*): Self = StObject.set(x, "selectedIds", js.Array(value :_*))
      
      @scala.inline
      def setSelectionDisabled(value: Boolean): Self = StObject.set(x, "selectionDisabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionDisabledUndefined: Self = StObject.set(x, "selectionDisabled", js.undefined)
      
      @scala.inline
      def setShowSelection(value: Boolean): Self = StObject.set(x, "showSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowSelectionUndefined: Self = StObject.set(x, "showSelection", js.undefined)
      
      @scala.inline
      def setTotalSelectableCount(value: Double): Self = StObject.set(x, "totalSelectableCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalSelectableCountUndefined: Self = StObject.set(x, "totalSelectableCount", js.undefined)
      
      @scala.inline
      def setWithWrapper(value: Boolean): Self = StObject.set(x, "withWrapper", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithWrapperUndefined: Self = StObject.set(x, "withWrapper", js.undefined)
    }
  }
  
  /* Inlined std.Pick<wix-style-react.wix-style-react/dist/es/src/Table/DataTable.DataTableProps<RowData>, 'allowMultiDetailsExpansion' | 'dynamicRowClass' | 'isRowHighlight' | 'hasMore' | 'hideHeader' | 'id' | 'infiniteScroll' | 'itemsPerPage' | 'loader' | 'loadMore' | 'onRowClick' | 'onMouseEnterRow' | 'onMouseLeaveRow' | 'useWindow' | 'scrollElement' | 'rowVerticalPadding' | 'rowDetails' | 'rowDataHook' | 'rowClass' | 'showHeaderWhenEmpty' | 'showLastRowDivider' | 'virtualized' | 'virtualizedTableHeight' | 'virtualizedLineHeight' | 'virtualizedListRef' | 'width' | 'skin' | 'data' | 'horizontalScroll' | 'stickyColumns' | 'isRowDisabled'> */
  trait UsedDataTableProps[RowData] extends StObject {
    
    var allowMultiDetailsExpansion: js.UndefOr[Boolean] = js.undefined
    
    var data: js.UndefOr[js.Array[RowData]] = js.undefined
    
    var dynamicRowClass: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, String]] = js.undefined
    
    var hasMore: js.UndefOr[Boolean] = js.undefined
    
    var hideHeader: js.UndefOr[Boolean] = js.undefined
    
    var horizontalScroll: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var infiniteScroll: js.UndefOr[Boolean] = js.undefined
    
    var isRowDisabled: js.UndefOr[js.Function1[/* rowData */ RowData, Boolean]] = js.undefined
    
    var isRowHighlight: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Boolean]] = js.undefined
    
    var itemsPerPage: js.UndefOr[Double] = js.undefined
    
    var loadMore: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var loader: js.UndefOr[ReactNode] = js.undefined
    
    var onMouseEnterRow: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Unit]] = js.undefined
    
    var onMouseLeaveRow: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Unit]] = js.undefined
    
    var onRowClick: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, Unit]] = js.undefined
    
    var rowClass: js.UndefOr[String] = js.undefined
    
    var rowDataHook: js.UndefOr[String | DataTableRowDataHookFn[RowDataDefaultType]] = js.undefined
    
    var rowDetails: js.UndefOr[js.Function2[/* rowData */ RowData, /* rowNum */ Double, ReactNode]] = js.undefined
    
    var rowVerticalPadding: js.UndefOr[DataTableRowVerticalPadding] = js.undefined
    
    var scrollElement: js.UndefOr[HTMLElement | RefObject[js.Any]] = js.undefined
    
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
  object UsedDataTableProps {
    
    @scala.inline
    def apply[RowData](): UsedDataTableProps[RowData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UsedDataTableProps[RowData]]
    }
    
    @scala.inline
    implicit class UsedDataTablePropsMutableBuilder[Self <: UsedDataTableProps[?], RowData] (val x: Self & UsedDataTableProps[RowData]) extends AnyVal {
      
      @scala.inline
      def setAllowMultiDetailsExpansion(value: Boolean): Self = StObject.set(x, "allowMultiDetailsExpansion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowMultiDetailsExpansionUndefined: Self = StObject.set(x, "allowMultiDetailsExpansion", js.undefined)
      
      @scala.inline
      def setData(value: js.Array[RowData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
}
