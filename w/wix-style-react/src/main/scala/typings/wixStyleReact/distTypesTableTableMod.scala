package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.BulkSelectionContext
import typings.wixStyleReact.anon.CallDefaultProps
import typings.wixStyleReact.anon.CallDisplayName
import typings.wixStyleReact.anon.DataHookAny
import typings.wixStyleReact.anon.DefaultProps
import typings.wixStyleReact.anon.DisplayName
import typings.wixStyleReact.anon.InfoTooltipProps
import typings.wixStyleReact.anon.LeftShadowVisible
import typings.wixStyleReact.anon.PropTypes
import typings.wixStyleReact.distTypesTableBulkSelectionBulkSelectionMod.BulkSelection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableTableMod {
  
  @JSImport("wix-style-react/dist/types/Table/Table", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/Table/Table", "Table")
  @js.native
  open class Table protected () extends Component[Any, Any, Any] {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
    
    def _handleUpdateScrollShadows(leftShadowVisible: Any, rightShadowVisible: Any): Unit = js.native
    
    var bulkSelection: js.UndefOr[BulkSelection | Null] = js.native
    
    def renderChildren(): ReactNode = js.native
    
    def setSelectedIds(selectedIds: Any): Unit = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MTable(): Boolean = js.native
    
    @JSName("state")
    var state_Table: LeftShadowVisible = js.native
  }
  /* static members */
  object Table {
    
    @JSImport("wix-style-react/dist/types/Table/Table", "Table")
    @js.native
    val ^ : js.Any = js.native
    
    inline def BulkSelectionCheckbox(param0: DataHookAny): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("BulkSelectionCheckbox")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Table/Table", "Table.Content")
    @js.native
    def Content: DefaultProps = js.native
    inline def Content_=(x: DefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/Table", "Table.EmptyState")
    @js.native
    def EmptyState: CallDefaultProps = js.native
    inline def EmptyState_=(x: CallDefaultProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EmptyState")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/Table", "Table.SubToolbar")
    @js.native
    def SubToolbar: CallDisplayName = js.native
    inline def SubToolbar_=(x: CallDisplayName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SubToolbar")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/Table", "Table.Titlebar")
    @js.native
    def Titlebar: PropTypes = js.native
    inline def Titlebar_=(x: PropTypes): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Titlebar")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/Table", "Table.ToolbarContainer")
    @js.native
    def ToolbarContainer: DisplayName = js.native
    inline def ToolbarContainer_=(x: DisplayName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ToolbarContainer")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/Table", "Table.defaultProps")
    @js.native
    val defaultProps: Any = js.native
    
    @JSImport("wix-style-react/dist/types/Table/Table", "Table.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.allowMultiDetailsExpansion")
      @js.native
      val allowMultiDetailsExpansion: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.children")
      @js.native
      val children: Requireable[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.columns")
      @js.native
      val columns: Validator[js.Array[js.UndefOr[InferProps[InfoTooltipProps] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.data")
      @js.native
      val data: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.deselectRowsByDefault")
      @js.native
      val deselectRowsByDefault: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.dragAndDrop")
      @js.native
      val dragAndDrop: Requireable[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.dynamicRowClass")
      @js.native
      val dynamicRowClass: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.hasMore")
      @js.native
      val hasMore: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.hideBulkSelectionCheckbox")
      @js.native
      val hideBulkSelectionCheckbox: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.horizontalScroll")
      @js.native
      val horizontalScroll: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.id")
      @js.native
      val id: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.infiniteScroll")
      @js.native
      val infiniteScroll: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.initialLoad")
      @js.native
      val initialLoad: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.isRowDisabled")
      @js.native
      val isRowDisabled: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.isRowHighlight")
      @js.native
      val isRowHighlight: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.itemsPerPage")
      @js.native
      val itemsPerPage: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.loadMore")
      @js.native
      val loadMore: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.loader")
      @js.native
      val loader: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.onDragEnd")
      @js.native
      val onDragEnd: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.onMouseEnterRow")
      @js.native
      val onMouseEnterRow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.onMouseLeaveRow")
      @js.native
      val onMouseLeaveRow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.onRowClick")
      @js.native
      val onRowClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.onSelectionChanged")
      @js.native
      val onSelectionChanged: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.onSortClick")
      @js.native
      val onSortClick: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.removeRowDetailsPadding")
      @js.native
      val removeRowDetailsPadding: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.rowClass")
      @js.native
      val rowClass: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.rowDataHook")
      @js.native
      val rowDataHook: Requireable[String | (js.Function1[/* repeated */ Any, Any])] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.rowDetails")
      @js.native
      val rowDetails: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.rowVerticalPadding")
      @js.native
      val rowVerticalPadding: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.scrollElement")
      @js.native
      val scrollElement: Requireable[js.Object] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.selectedIds")
      @js.native
      val selectedIds: Requireable[js.Array[js.UndefOr[Double | Null | String]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.selectionDisabled")
      @js.native
      val selectionDisabled: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.showHeaderWhenEmpty")
      @js.native
      val showHeaderWhenEmpty: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.showLastRowDivider")
      @js.native
      val showLastRowDivider: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.showSelection")
      @js.native
      val showSelection: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.skin")
      @js.native
      val skin: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.stickyColumns")
      @js.native
      val stickyColumns: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.totalSelectableCount")
      @js.native
      val totalSelectableCount: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.useWindow")
      @js.native
      val useWindow: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.virtualized")
      @js.native
      val virtualized: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.virtualizedLineHeight")
      @js.native
      val virtualizedLineHeight: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.virtualizedListRef")
      @js.native
      val virtualizedListRef: Requireable[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.virtualizedTableHeight")
      @js.native
      val virtualizedTableHeight: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.width")
      @js.native
      val width: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/Table", "Table.propTypes.withWrapper")
      @js.native
      val withWrapper: Requireable[Boolean] = js.native
    }
  }
  
  inline def createColumns(param0: BulkSelectionContext): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("createColumns")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getDataTableProps(tableProps: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDataTableProps")(tableProps.asInstanceOf[js.Any]).asInstanceOf[Any]
}
