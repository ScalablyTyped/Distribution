package typings.wixStyleReact

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.RefObject
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.wixStyleReact.anon.DisabledIdOverrideOptionStyle
import typings.wixStyleReact.anon.FocusedItemId
import typings.wixStyleReact.anon.HasLink
import typings.wixStyleReact.anon.IdLabel
import typings.wixStyleReact.anon.Idx
import typings.wixStyleReact.anon.Option
import typings.wixStyleReact.anon.OverrideOptionStyleOverrideStyle
import typings.wixStyleReact.anon.OverrideOptionStyleValue
import typings.wixStyleReact.anon.OverrideStyleValue
import typings.wixStyleReact.anon.Selected
import typings.wixStyleReact.wixStyleReactStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropdownLayoutDropdownLayoutMod {
  
  @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", JSImport.Default)
  @js.native
  open class default protected () extends DropdownLayout {
    def this(props: Any) = this()
  }
  object default {
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.closeOnSelect_1")
      @js.native
      val closeOnSelect1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.hasMore_1")
      @js.native
      val hasMore1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.inContainer_1")
      @js.native
      val inContainer1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.infiniteScroll_1")
      @js.native
      val infiniteScroll1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.itemHeight_1")
      @js.native
      val itemHeight1: String = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.loadMore_1")
      @js.native
      val loadMore1: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.markedOption_1")
      @js.native
      val markedOption1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.maxHeightPixels_1")
      @js.native
      val maxHeightPixels1: Double = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.options_1")
      @js.native
      val options1: js.Array[scala.Nothing] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.overflow_1")
      @js.native
      val overflow1: String = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.selectedHighlight_1")
      @js.native
      val selectedHighlight1: Boolean = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.defaultProps.tabIndex_1")
      @js.native
      val tabIndex1: Double = js.native
    }
    
    @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.autoFocus")
      @js.native
      val autoFocus: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.closeOnSelect")
      @js.native
      val closeOnSelect: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.dropDirectionUp")
      @js.native
      val dropDirectionUp: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.fixedFooter")
      @js.native
      val fixedFooter: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.fixedHeader")
      @js.native
      val fixedHeader: Requireable[ReactNodeLike] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.focusOnOption")
      @js.native
      val focusOnOption: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.focusOnSelectedOption")
      @js.native
      val focusOnSelectedOption: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.hasMore")
      @js.native
      val hasMore: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.inContainer")
      @js.native
      val inContainer: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.infiniteScroll")
      @js.native
      val infiniteScroll: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.itemHeight")
      @js.native
      val itemHeight: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.listType")
      @js.native
      val listType: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.loadMore")
      @js.native
      val loadMore: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.markedOption")
      @js.native
      val markedOption: Requireable[String | Double | Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.maxHeightPixels")
      @js.native
      val maxHeightPixels: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.minWidthPixels")
      @js.native
      val minWidthPixels: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.onClickOutside")
      @js.native
      val onClickOutside: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.onClose")
      @js.native
      val onClose: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.onMouseEnter")
      @js.native
      val onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.onMouseLeave")
      @js.native
      val onMouseLeave: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.onOptionMarked")
      @js.native
      val onOptionMarked: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.onSelect")
      @js.native
      val onSelect: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.options")
      @js.native
      val options: Requireable[js.Array[Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.overflow")
      @js.native
      val overflow: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.scrollToOption")
      @js.native
      val scrollToOption: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.selectedHighlight")
      @js.native
      val selectedHighlight: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.selectedId")
      @js.native
      val selectedId: Requireable[String | Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.tabIndex")
      @js.native
      val tabIndex: Requireable[Double] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.visible")
      @js.native
      val visible: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "default.propTypes.withArrow")
      @js.native
      val withArrow: Requireable[Boolean] = js.native
    }
  }
  
  @JSImport("wix-style-react/dist/types/DropdownLayout/DropdownLayout", "DIVIDER_OPTION_VALUE")
  @js.native
  val DIVIDER_OPTION_VALUE: `-_` = js.native
  
  inline def optionValidator(props: Any, propName: Any, componentName: Any): js.UndefOr[js.Error] = (^.asInstanceOf[js.Dynamic].applyDynamic("optionValidator")(props.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], componentName.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Error]]
  
  @js.native
  trait DropdownLayout extends PureComponent[Any, Any, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MDropdownLayout(nextProps: Any): Unit = js.native
    
    var _boundEvents: js.UndefOr[js.Array[String]] = js.native
    
    def _checkIfEventOnElements(e: Any, elem: Any): Boolean = js.native
    
    def _convertCustomOptionToBuilder(param0: Option): js.UndefOr[OverrideOptionStyleOverrideStyle | OverrideStyleValue] = js.native
    
    def _convertOptionToBuilder(option: Any, idx: Any): Any = js.native
    
    def _convertOptionToListItemActionBuilder(param0: Idx): DisabledIdOverrideOptionStyle = js.native
    
    def _convertOptionToListItemSectionBuilder(param0: Idx): js.UndefOr[OverrideOptionStyleValue] = js.native
    
    def _convertOptionToListItemSelectBuilder(param0: Option): IdLabel = js.native
    
    def _findIndex(arr: Any, predicate: Any): Double = js.native
    
    def _focus(focusedItemId: Any, e: Any): Unit = js.native
    
    def _focusFirstOption(): Unit = js.native
    
    def _focusOnOption(): Unit = js.native
    
    def _focusOnSelectedOption(): Unit = js.native
    
    /** for testing purposes only */
    def _getDataAttributes(): js.Object = js.native
    
    def _getItemDataAttr(param0: Selected): js.Object = js.native
    
    def _getMarkedIndex(): Any = js.native
    
    def _handleActionListNavigation(event: Any, id: Any): Unit = js.native
    
    def _isActionOption(param0: Option): Boolean = js.native
    
    def _isBuilderOption(param0: Option): Boolean = js.native
    
    def _isControlled(): Boolean = js.native
    
    def _isCustomOption(param0: Option): Any = js.native
    
    def _isItemSection(param0: Option): Any = js.native
    
    def _isSelectableOption(option: Any): Any = js.native
    
    def _markNextStep(step: Any): Unit = js.native
    
    def _markOption(index: Any, options: Any): Unit = js.native
    
    def _markOptionAtIndex(markedIndex: Any): Unit = js.native
    
    def _markOptionByProperty(props: Any): Unit = js.native
    
    def _onActionClick(e: Any): Unit = js.native
    
    def _onActionListKeyDown(event: Any, id: Any): Unit = js.native
    
    def _onClickOutside(event: Any): Unit = js.native
    
    def _onClose(): Unit = js.native
    
    def _onMouseEnter(index: Any): Unit = js.native
    
    def _onMouseEventsHandler(e: Any): Unit = js.native
    
    def _onMouseLeave(): Unit = js.native
    
    def _onSelect(index: Any, e: Any): Any = js.native
    
    /**
      * Handle keydown events for the DropdownLayout, mostly for accessibility
      *
      * @param {SyntheticEvent} event - The keydown event triggered by React
      * @returns {boolean} - Whether the event was handled by the component
      */
    def _onSelectListKeyDown(
      event: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SyntheticEvent */ Any
    ): Boolean = js.native
    
    def _renderNode(node: Any): Element | Null = js.native
    
    def _renderOption(param0: Idx): Element = js.native
    
    def _renderOptionContent(param0: HasLink): Element = js.native
    
    def _renderOptions(): Any = js.native
    
    def _renderTopArrow(): Element | Null = js.native
    
    def _saveOnClicks(): Unit = js.native
    
    def _scrollToOption(): Unit = js.native
    
    def _setSelectedOptionNode(optionNode: Any, option: Any): Unit = js.native
    
    def _wrapWithInfiniteScroll(scrollableElement: Any): Element = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDropdownLayout(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDropdownLayout(prevProps: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MDropdownLayout(): Unit = js.native
    
    var containerRef: RefObject[Any] = js.native
    
    var focusableItemsIdsList: js.Array[Any] = js.native
    
    var options: js.UndefOr[HTMLDivElement | Null] = js.native
    
    var savedOnClicks: js.Array[Any] = js.native
    
    var selectedOption: Any = js.native
    
    @JSName("state")
    var state_DropdownLayout: FocusedItemId = js.native
  }
}
