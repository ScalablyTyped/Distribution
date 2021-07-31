package typings.wixStyleReact

import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.wixStyleReact.anon.Hovered
import typings.wixStyleReact.wixStyleReactNumbers.`-1`
import typings.wixStyleReact.wixStyleReactStrings.`-_`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownLayoutMod {
  
  @JSImport("wix-style-react/dist/es/src/DropdownLayout", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[DropdownLayoutProps, js.Object, js.Any]
  /* static members */
  object default {
    
    @JSImport("wix-style-react/dist/es/src/DropdownLayout", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/es/src/DropdownLayout", "default.NONE_SELECTED_ID")
    @js.native
    def NONE_SELECTED_ID: NoneSelectedId = js.native
    @scala.inline
    def NONE_SELECTED_ID_=(x: NoneSelectedId): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NONE_SELECTED_ID")(x.asInstanceOf[js.Any])
  }
  
  type DropdownLayout = PureComponent[DropdownLayoutProps, js.Object, js.Any]
  
  trait DropdownLayoutDividerOption
    extends StObject
       with DropdownLayoutOption {
    
    var id: js.UndefOr[String | Double] = js.undefined
    
    var value: `-_`
  }
  object DropdownLayoutDividerOption {
    
    @scala.inline
    def apply(): DropdownLayoutDividerOption = {
      val __obj = js.Dynamic.literal(value = "-")
      __obj.asInstanceOf[DropdownLayoutDividerOption]
    }
    
    @scala.inline
    implicit class DropdownLayoutDividerOptionMutableBuilder[Self <: DropdownLayoutDividerOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setValue(value: `-_`): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.big
  */
  trait DropdownLayoutItemHeight extends StObject
  object DropdownLayoutItemHeight {
    
    @scala.inline
    def big: typings.wixStyleReact.wixStyleReactStrings.big = "big".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.big]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutValueOption
    - typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutDividerOption
  */
  trait DropdownLayoutOption extends StObject
  object DropdownLayoutOption {
    
    @scala.inline
    def DropdownLayoutDividerOption(): typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutDividerOption = {
      val __obj = js.Dynamic.literal(value = "-")
      __obj.asInstanceOf[typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutDividerOption]
    }
    
    @scala.inline
    def DropdownLayoutValueOption(id: String | Double): typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutValueOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutValueOption]
    }
  }
  
  trait DropdownLayoutProps extends StObject {
    
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dropDirectionUp: js.UndefOr[Boolean] = js.undefined
    
    var fixedFooter: js.UndefOr[ReactNode] = js.undefined
    
    var fixedHeader: js.UndefOr[ReactNode] = js.undefined
    
    var focusOnSelectedOption: js.UndefOr[Boolean] = js.undefined
    
    var hasMore: js.UndefOr[Boolean] = js.undefined
    
    var inContainer: js.UndefOr[Boolean] = js.undefined
    
    var infiniteScroll: js.UndefOr[Boolean] = js.undefined
    
    var itemHeight: js.UndefOr[DropdownLayoutItemHeight] = js.undefined
    
    var loadMore: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.undefined
    
    var markedOption: js.UndefOr[Boolean | String | Double] = js.undefined
    
    var maxHeightPixels: js.UndefOr[String | Double] = js.undefined
    
    var minWidthPixels: js.UndefOr[String | Double] = js.undefined
    
    var onClickOutside: js.UndefOr[js.Function1[/* e */ TouchEvent | MouseEvent, Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onOptionMarked: js.UndefOr[js.Function1[/* option */ DropdownLayoutValueOption | Null, Unit]] = js.undefined
    
    var onSelect: js.UndefOr[
        js.Function2[/* option */ DropdownLayoutValueOption, /* sameOptionWasPicked */ Boolean, Unit]
      ] = js.undefined
    
    var options: js.UndefOr[js.Array[DropdownLayoutOption]] = js.undefined
    
    var overflow: js.UndefOr[Overflow] = js.undefined
    
    var selectedHighlight: js.UndefOr[Boolean] = js.undefined
    
    var selectedId: js.UndefOr[String | Double] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var withArrow: js.UndefOr[Boolean] = js.undefined
  }
  object DropdownLayoutProps {
    
    @scala.inline
    def apply(): DropdownLayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownLayoutProps]
    }
    
    @scala.inline
    implicit class DropdownLayoutPropsMutableBuilder[Self <: DropdownLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDropDirectionUp(value: Boolean): Self = StObject.set(x, "dropDirectionUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropDirectionUpUndefined: Self = StObject.set(x, "dropDirectionUp", js.undefined)
      
      @scala.inline
      def setFixedFooter(value: ReactNode): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: ReactNode): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setFocusOnSelectedOption(value: Boolean): Self = StObject.set(x, "focusOnSelectedOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnSelectedOptionUndefined: Self = StObject.set(x, "focusOnSelectedOption", js.undefined)
      
      @scala.inline
      def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
      
      @scala.inline
      def setInContainer(value: Boolean): Self = StObject.set(x, "inContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInContainerUndefined: Self = StObject.set(x, "inContainer", js.undefined)
      
      @scala.inline
      def setInfiniteScroll(value: Boolean): Self = StObject.set(x, "infiniteScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteScrollUndefined: Self = StObject.set(x, "infiniteScroll", js.undefined)
      
      @scala.inline
      def setItemHeight(value: DropdownLayoutItemHeight): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      @scala.inline
      def setLoadMore(value: /* page */ Double => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      @scala.inline
      def setMarkedOption(value: Boolean | String | Double): Self = StObject.set(x, "markedOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkedOptionUndefined: Self = StObject.set(x, "markedOption", js.undefined)
      
      @scala.inline
      def setMaxHeightPixels(value: String | Double): Self = StObject.set(x, "maxHeightPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightPixelsUndefined: Self = StObject.set(x, "maxHeightPixels", js.undefined)
      
      @scala.inline
      def setMinWidthPixels(value: String | Double): Self = StObject.set(x, "minWidthPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthPixelsUndefined: Self = StObject.set(x, "minWidthPixels", js.undefined)
      
      @scala.inline
      def setOnClickOutside(value: /* e */ TouchEvent | MouseEvent => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnOptionMarked(value: /* option */ DropdownLayoutValueOption | Null => Unit): Self = StObject.set(x, "onOptionMarked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOptionMarkedUndefined: Self = StObject.set(x, "onOptionMarked", js.undefined)
      
      @scala.inline
      def setOnSelect(value: (/* option */ DropdownLayoutValueOption, /* sameOptionWasPicked */ Boolean) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[DropdownLayoutOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: DropdownLayoutOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setOverflow(value: Overflow): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setSelectedHighlight(value: Boolean): Self = StObject.set(x, "selectedHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedHighlightUndefined: Self = StObject.set(x, "selectedHighlight", js.undefined)
      
      @scala.inline
      def setSelectedId(value: String | Double): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWithArrow(value: Boolean): Self = StObject.set(x, "withArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithArrowUndefined: Self = StObject.set(x, "withArrow", js.undefined)
    }
  }
  
  trait DropdownLayoutValueOption
    extends StObject
       with DropdownLayoutOption {
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String | Double
    
    var label: js.UndefOr[String] = js.undefined
    
    var linkTo: js.UndefOr[String] = js.undefined
    
    var overrideOptionStyle: js.UndefOr[Boolean] = js.undefined
    
    var overrideStyle: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[Boolean] = js.undefined
    
    var value: ReactNode | String | RenderOptionFn
  }
  object DropdownLayoutValueOption {
    
    @scala.inline
    def apply(id: String | Double): DropdownLayoutValueOption = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownLayoutValueOption]
    }
    
    @scala.inline
    implicit class DropdownLayoutValueOptionMutableBuilder[Self <: DropdownLayoutValueOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String | Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLinkTo(value: String): Self = StObject.set(x, "linkTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinkToUndefined: Self = StObject.set(x, "linkTo", js.undefined)
      
      @scala.inline
      def setOverrideOptionStyle(value: Boolean): Self = StObject.set(x, "overrideOptionStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideOptionStyleUndefined: Self = StObject.set(x, "overrideOptionStyle", js.undefined)
      
      @scala.inline
      def setOverrideStyle(value: Boolean): Self = StObject.set(x, "overrideStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideStyleUndefined: Self = StObject.set(x, "overrideStyle", js.undefined)
      
      @scala.inline
      def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setValue(value: ReactNode | String | RenderOptionFn): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueFunction1(value: /* options */ Hovered => Element): Self = StObject.set(x, "value", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type NoneSelectedId = `-1`
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.visible
    - typings.wixStyleReact.wixStyleReactStrings.hidden
    - typings.wixStyleReact.wixStyleReactStrings.scroll
    - typings.wixStyleReact.wixStyleReactStrings.auto
  */
  trait Overflow extends StObject
  object Overflow {
    
    @scala.inline
    def auto: typings.wixStyleReact.wixStyleReactStrings.auto = "auto".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.auto]
    
    @scala.inline
    def hidden: typings.wixStyleReact.wixStyleReactStrings.hidden = "hidden".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.hidden]
    
    @scala.inline
    def scroll: typings.wixStyleReact.wixStyleReactStrings.scroll = "scroll".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.scroll]
    
    @scala.inline
    def visible: typings.wixStyleReact.wixStyleReactStrings.visible = "visible".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.visible]
  }
  
  type RenderOptionFn = js.Function1[/* options */ Hovered, Element]
}
