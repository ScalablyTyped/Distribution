package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.ReactNode
import typings.react.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DataHookAny
import typings.wixStyleReact.anon.TitleBarDisplay
import typings.wixStyleReact.anon.`12`
import typings.wixStyleReact.anon.`5`
import typings.wixStyleReact.distTypesEmptyStateMod.EmptyStateAlign
import typings.wixStyleReact.distTypesEmptyStateMod.EmptyStateTheme
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableComponentsMod {
  
  @JSImport("wix-style-react/dist/types/Table/components", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object SelectionContextPropTypes {
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.bulkSelectionState")
    @js.native
    def bulkSelectionState: Requireable[String] = js.native
    inline def bulkSelectionState_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bulkSelectionState")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.deselectAll")
    @js.native
    def deselectAll: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def deselectAll_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deselectAll")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.deselectRowsByDefault")
    @js.native
    def deselectRowsByDefault: Requireable[Boolean] = js.native
    inline def deselectRowsByDefault_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deselectRowsByDefault")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.getNotSelectedIds")
    @js.native
    def getNotSelectedIds: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def getNotSelectedIds_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getNotSelectedIds")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.getSelectedIds")
    @js.native
    def getSelectedIds: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def getSelectedIds_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getSelectedIds")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.infiniteBulkSelected")
    @js.native
    def infiniteBulkSelected: Requireable[Boolean] = js.native
    inline def infiniteBulkSelected_=(x: Requireable[Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("infiniteBulkSelected")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.isSelected")
    @js.native
    def isSelected: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def isSelected_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isSelected")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.selectAll")
    @js.native
    def selectAll: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def selectAll_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectAll")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.selectedCount")
    @js.native
    def selectedCount: Requireable[Double] = js.native
    inline def selectedCount_=(x: Requireable[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectedCount")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.selectionDisabled")
    @js.native
    def selectionDisabled: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])] = js.native
    inline def selectionDisabled_=(x: Requireable[Boolean | (js.Function1[/* repeated */ Any, Any])]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectionDisabled")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.setSelectedIds")
    @js.native
    def setSelectedIds: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def setSelectedIds_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setSelectedIds")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.toggleAll")
    @js.native
    def toggleAll: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def toggleAll_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleAll")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Table/components", "SelectionContextPropTypes.toggleSelectionById")
    @js.native
    def toggleSelectionById: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    inline def toggleSelectionById_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleSelectionById")(x.asInstanceOf[js.Any])
  }
  
  inline def TableBulkSelectionCheckbox(param0: DataHookAny): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TableBulkSelectionCheckbox")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  object TableContent {
    
    inline def apply(param0: TitleBarDisplay): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Table/components", "TableContent")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableContent.defaultProps.titleBarDisplay_1")
      @js.native
      val titleBarDisplay1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableContent.defaultProps.titleBarVisible_1")
      @js.native
      val titleBarVisible1: Boolean = js.native
    }
    
    @JSImport("wix-style-react/dist/types/Table/components", "TableContent.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableContent.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableContent.propTypes.titleBarDisplay")
      @js.native
      val titleBarDisplay: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableContent.propTypes.titleBarVisible")
      @js.native
      val titleBarVisible: Requireable[Boolean] = js.native
    }
  }
  
  object TableEmptyState {
    
    inline def apply(props: Any): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState")
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.defaultProps.align")
      @js.native
      def align: js.UndefOr[EmptyStateAlign] = js.native
      inline def align_=(x: js.UndefOr[EmptyStateAlign]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("align")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.defaultProps.children")
      @js.native
      def children: js.UndefOr[ReactNode] = js.native
      inline def children_=(x: js.UndefOr[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.defaultProps.className")
      @js.native
      def className: js.UndefOr[String] = js.native
      inline def className_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.defaultProps.classNames")
      @js.native
      def classNames: js.UndefOr[`5`] = js.native
      inline def classNames_=(x: js.UndefOr[`5`]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.defaultProps.dataHook")
      @js.native
      def dataHook: js.UndefOr[String] = js.native
      inline def dataHook_=(x: js.UndefOr[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.defaultProps.image")
      @js.native
      def image: js.UndefOr[String | Element] = js.native
      inline def image_=(x: js.UndefOr[String | Element]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.defaultProps.subtitle")
      @js.native
      def subtitle: js.UndefOr[ReactNode] = js.native
      inline def subtitle_=(x: js.UndefOr[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.defaultProps.theme")
      @js.native
      def theme: js.UndefOr[EmptyStateTheme] = js.native
      inline def theme_=(x: js.UndefOr[EmptyStateTheme]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.defaultProps.title")
      @js.native
      def title: js.UndefOr[ReactNode] = js.native
      inline def title_=(x: js.UndefOr[ReactNode]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.propTypes.align")
      @js.native
      def align: js.UndefOr[Validator[js.UndefOr[EmptyStateAlign | Null]]] = js.native
      inline def align_=(x: js.UndefOr[Validator[js.UndefOr[EmptyStateAlign | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("align")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.propTypes.children")
      @js.native
      def children: js.UndefOr[Validator[ReactNode]] = js.native
      inline def children_=(x: js.UndefOr[Validator[ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("children")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.propTypes.className")
      @js.native
      def className: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.native
      inline def className_=(x: js.UndefOr[Validator[js.UndefOr[String | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.propTypes.classNames")
      @js.native
      def classNames: js.UndefOr[Validator[js.UndefOr[`5` | Null]]] = js.native
      inline def classNames_=(x: js.UndefOr[Validator[js.UndefOr[`5` | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("classNames")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.propTypes.dataHook")
      @js.native
      def dataHook: js.UndefOr[Validator[js.UndefOr[String | Null]]] = js.native
      inline def dataHook_=(x: js.UndefOr[Validator[js.UndefOr[String | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.propTypes.image")
      @js.native
      def image: js.UndefOr[Validator[js.UndefOr[String | Element | Null]]] = js.native
      inline def image_=(x: js.UndefOr[Validator[js.UndefOr[String | Element | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("image")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.propTypes.subtitle")
      @js.native
      def subtitle: js.UndefOr[Validator[ReactNode]] = js.native
      inline def subtitle_=(x: js.UndefOr[Validator[ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("subtitle")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.propTypes.theme")
      @js.native
      def theme: js.UndefOr[Validator[js.UndefOr[EmptyStateTheme | Null]]] = js.native
      inline def theme_=(x: js.UndefOr[Validator[js.UndefOr[EmptyStateTheme | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableEmptyState.propTypes.title")
      @js.native
      def title: js.UndefOr[Validator[ReactNode]] = js.native
      inline def title_=(x: js.UndefOr[Validator[ReactNode]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
    }
  }
  
  object TableSubToolbar {
    
    inline def apply(param0: DataHookAny): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Table/components", "TableSubToolbar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Table/components", "TableSubToolbar.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableSubToolbar.propTypes.children")
      @js.native
      val children: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableSubToolbar.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
    }
  }
  
  object TableTitleBar {
    
    inline def apply(param0: `12`): Element = ^.asInstanceOf[js.Dynamic].apply(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Table/components", "TableTitleBar")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Table/components", "TableTitleBar.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableTitleBar.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
    }
  }
  
  object TableToolbarContainer {
    
    inline def apply(props: Any): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("wix-style-react/dist/types/Table/components", "TableToolbarContainer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Table/components", "TableToolbarContainer.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/Table/components", "TableToolbarContainer.propTypes.children")
      @js.native
      val children: Requireable[Any] = js.native
    }
  }
}
