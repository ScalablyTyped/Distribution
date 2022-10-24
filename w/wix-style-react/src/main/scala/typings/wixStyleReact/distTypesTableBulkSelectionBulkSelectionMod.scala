package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Component
import typings.react.mod.Context
import typings.wixStyleReact.anon.AllIds
import typings.wixStyleReact.anon.BulkSelectionState
import typings.wixStyleReact.anon.Helpers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableBulkSelectionBulkSelectionMod {
  
  @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelection")
  @js.native
  open class BulkSelection protected () extends Component[Any, Any, Any] {
    def this(props: Any) = this()
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MBulkSelection(nextProps: Any): Unit = js.native
    
    def areSelectedIdsEqual(selectedIds1: Any, selectedIds2: Any): Boolean = js.native
    
    def createHelpers(param0: AllIds): BulkSelectionState = js.native
    
    def setNotSelectedIds(notSelectedIds: Any, change: Any, props: Any): Unit = js.native
    
    def setSelectedIds(selectedIds: Any, change: Any, props: Any): Unit = js.native
    
    @JSName("state")
    var state_BulkSelection: Helpers = js.native
    
    def toggleAll(enable: Any, origin: Any): Unit = js.native
    
    def toggleBulkSelection(deselectRowsByDefault: Any, origin: Any): Unit = js.native
    
    def toggleSelectionById(id: Any, origin: Any): Unit = js.native
  }
  object BulkSelection {
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelection.propTypes.allIds")
      @js.native
      val allIds: Validator[js.Array[js.UndefOr[Double | Null | String]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelection.propTypes.children")
      @js.native
      val children: Requireable[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelection.propTypes.hasMoreInBulkSelection")
      @js.native
      val hasMoreInBulkSelection: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelection.propTypes.onSelectionChanged")
      @js.native
      val onSelectionChanged: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelection.propTypes.selectedIds")
      @js.native
      val selectedIds: Requireable[js.Array[js.UndefOr[Double | Null | String]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelection.propTypes.selectionDisabled_1")
      @js.native
      val selectionDisabled1: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelection.propTypes.totalCount")
      @js.native
      val totalCount: Requireable[Double] = js.native
    }
  }
  
  @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContext")
  @js.native
  val BulkSelectionContext: Context[Any] = js.native
  
  object BulkSelectionContextPropTypes {
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.bulkSelectionState")
    @js.native
    val bulkSelectionState: Requireable[String] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.deselectAll")
    @js.native
    val deselectAll: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.deselectRowsByDefault")
    @js.native
    val deselectRowsByDefault: Requireable[Boolean] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.getNotSelectedIds")
    @js.native
    val getNotSelectedIds: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.getSelectedIds")
    @js.native
    val getSelectedIds: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.infiniteBulkSelected")
    @js.native
    val infiniteBulkSelected: Requireable[Boolean] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.isSelected")
    @js.native
    val isSelected: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.selectAll")
    @js.native
    val selectAll: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.selectedCount")
    @js.native
    val selectedCount: Requireable[Double] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.selectionDisabled")
    @js.native
    val selectionDisabled: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.setSelectedIds")
    @js.native
    val setSelectedIds: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.toggleAll")
    @js.native
    val toggleAll: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionContextPropTypes.toggleSelectionById")
    @js.native
    val toggleSelectionById: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
  }
  
  /* Inlined std.Readonly<{  ALL :'ALL',   NONE :'NONE',   SOME :'SOME'}> */
  object BulkSelectionState {
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionState.ALL")
    @js.native
    val ALL: typings.wixStyleReact.wixStyleReactStrings.ALL = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionState.NONE")
    @js.native
    val NONE: typings.wixStyleReact.wixStyleReactStrings.NONE = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "BulkSelectionState.SOME")
    @js.native
    val SOME: typings.wixStyleReact.wixStyleReactStrings.SOME = js.native
  }
  
  /* Inlined std.Readonly<{  ALL :'ALL',   NONE :'NONE',   SINGLE_TOGGLE :'SINGLE_TOGGLE'}> */
  object ChangeType {
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "ChangeType.ALL")
    @js.native
    val ALL: typings.wixStyleReact.wixStyleReactStrings.ALL = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "ChangeType.NONE")
    @js.native
    val NONE: typings.wixStyleReact.wixStyleReactStrings.NONE = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection/BulkSelection", "ChangeType.SINGLE_TOGGLE")
    @js.native
    val SINGLE_TOGGLE: typings.wixStyleReact.wixStyleReactStrings.SINGLE_TOGGLE = js.native
  }
}
