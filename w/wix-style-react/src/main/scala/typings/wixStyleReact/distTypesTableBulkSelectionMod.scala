package typings.wixStyleReact

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.Context
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableBulkSelectionMod {
  
  @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelection")
  @js.native
  open class BulkSelection protected ()
    extends typings.wixStyleReact.distTypesTableBulkSelectionBulkSelectionMod.BulkSelection {
    def this(props: Any) = this()
  }
  object BulkSelection {
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelection.propTypes.allIds")
      @js.native
      val allIds: Validator[js.Array[js.UndefOr[Double | Null | String]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelection.propTypes.children")
      @js.native
      val children: Requireable[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelection.propTypes.hasMoreInBulkSelection")
      @js.native
      val hasMoreInBulkSelection: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelection.propTypes.onSelectionChanged")
      @js.native
      val onSelectionChanged: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelection.propTypes.selectedIds")
      @js.native
      val selectedIds: Requireable[js.Array[js.UndefOr[Double | Null | String]]] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelection.propTypes.selectionDisabled_1")
      @js.native
      val selectionDisabled1: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelection.propTypes.totalCount")
      @js.native
      val totalCount: Requireable[Double] = js.native
    }
  }
  
  object BulkSelectionConsumer {
    
    inline def apply(props: Any): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionConsumer")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionConsumer.defaultProps.consumerCompName_1")
      @js.native
      val consumerCompName1: String = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionConsumer.defaultProps.providerCompName_1")
      @js.native
      val providerCompName1: String = js.native
    }
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionConsumer.propTypes.children")
      @js.native
      val children: Validator[Any] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionConsumer.propTypes.consumerCompName")
      @js.native
      val consumerCompName: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionConsumer.propTypes.providerCompName")
      @js.native
      val providerCompName: Requireable[String] = js.native
    }
  }
  
  @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContext")
  @js.native
  val BulkSelectionContext: Context[Any] = js.native
  
  object BulkSelectionContextPropTypes {
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.bulkSelectionState")
    @js.native
    val bulkSelectionState: Requireable[String] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.deselectAll")
    @js.native
    val deselectAll: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.deselectRowsByDefault")
    @js.native
    val deselectRowsByDefault: Requireable[Boolean] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.getNotSelectedIds")
    @js.native
    val getNotSelectedIds: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.getSelectedIds")
    @js.native
    val getSelectedIds: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.infiniteBulkSelected")
    @js.native
    val infiniteBulkSelected: Requireable[Boolean] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.isSelected")
    @js.native
    val isSelected: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.selectAll")
    @js.native
    val selectAll: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.selectedCount")
    @js.native
    val selectedCount: Requireable[Double] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.selectionDisabled")
    @js.native
    val selectionDisabled: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.setSelectedIds")
    @js.native
    val setSelectedIds: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.toggleAll")
    @js.native
    val toggleAll: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionContextPropTypes.toggleSelectionById")
    @js.native
    val toggleSelectionById: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
  }
  
  /* Inlined std.Readonly<{  ALL :'ALL',   NONE :'NONE',   SOME :'SOME'}> */
  object BulkSelectionState {
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionState.ALL")
    @js.native
    val ALL: typings.wixStyleReact.wixStyleReactStrings.ALL = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionState.NONE")
    @js.native
    val NONE: typings.wixStyleReact.wixStyleReactStrings.NONE = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "BulkSelectionState.SOME")
    @js.native
    val SOME: typings.wixStyleReact.wixStyleReactStrings.SOME = js.native
  }
  
  /* Inlined std.Readonly<{  ALL :'ALL',   NONE :'NONE',   SINGLE_TOGGLE :'SINGLE_TOGGLE'}> */
  object ChangeType {
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "ChangeType.ALL")
    @js.native
    val ALL: typings.wixStyleReact.wixStyleReactStrings.ALL = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "ChangeType.NONE")
    @js.native
    val NONE: typings.wixStyleReact.wixStyleReactStrings.NONE = js.native
    
    @JSImport("wix-style-react/dist/types/Table/BulkSelection", "ChangeType.SINGLE_TOGGLE")
    @js.native
    val SINGLE_TOGGLE: typings.wixStyleReact.wixStyleReactStrings.SINGLE_TOGGLE = js.native
  }
}
