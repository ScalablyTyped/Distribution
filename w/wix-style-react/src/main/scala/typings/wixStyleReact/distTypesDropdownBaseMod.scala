package typings.wixStyleReact

import typings.csstype.mod.Property.MaxWidth
import typings.csstype.mod.Property.MinWidth
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.Close
import typings.wixStyleReact.distTypesCommonMod.MoveByOffset
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutOption
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typings.wixStyleReact.distTypesDropdownLayoutMod.ListType
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDropdownBaseMod {
  
  @JSImport("wix-style-react/dist/types/DropdownBase", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[DropdownBaseProps, js.Object, Any]
  
  type ChildrenFnArgs = js.Function1[/* data */ Close, ReactNode]
  
  type DropdownBase = PureComponent[DropdownBaseProps, js.Object, Any]
  
  type DropdownBaseChildrenFn = ReactNode | ChildrenFnArgs
  
  trait DropdownBaseProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var appendTo: js.UndefOr[String | ReactNode] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var children: js.UndefOr[DropdownBaseChildrenFn] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dynamicWidth: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var fixedFooter: js.UndefOr[ReactNode] = js.undefined
    
    var fixedHeader: js.UndefOr[ReactNode] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var focusOnOption: js.UndefOr[String | Double] = js.undefined
    
    var focusOnSelectedOption: js.UndefOr[Boolean] = js.undefined
    
    var hasMore: js.UndefOr[Boolean] = js.undefined
    
    var infiniteScroll: js.UndefOr[Boolean] = js.undefined
    
    var initialSelectedId: js.UndefOr[String | Double] = js.undefined
    
    var listType: js.UndefOr[ListType] = js.undefined
    
    var loadMore: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.undefined
    
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    var maxWidth: js.UndefOr[MaxWidth[String | Double]] = js.undefined
    
    var minWidth: js.UndefOr[MinWidth[String | Double]] = js.undefined
    
    var moveBy: js.UndefOr[MoveByOffset] = js.undefined
    
    var onClickOutside: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* option */ DropdownLayoutValueOption, Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[js.Array[DropdownLayoutOption]] = js.undefined
    
    var overflow: js.UndefOr[String] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var scrollToOption: js.UndefOr[String | Double] = js.undefined
    
    var selectedId: js.UndefOr[String | Double] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object DropdownBaseProps {
    
    inline def apply(): DropdownBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownBaseProps]
    }
    
    extension [Self <: DropdownBaseProps](x: Self) {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAppendTo(value: String | ReactNode): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setChildren(value: DropdownBaseChildrenFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenFunction1(value: /* data */ Close => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDynamicWidth(value: Boolean): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
      
      inline def setDynamicWidthUndefined: Self = StObject.set(x, "dynamicWidth", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedFooter(value: ReactNode): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      inline def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      inline def setFixedHeader(value: ReactNode): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setFocusOnOption(value: String | Double): Self = StObject.set(x, "focusOnOption", value.asInstanceOf[js.Any])
      
      inline def setFocusOnOptionUndefined: Self = StObject.set(x, "focusOnOption", js.undefined)
      
      inline def setFocusOnSelectedOption(value: Boolean): Self = StObject.set(x, "focusOnSelectedOption", value.asInstanceOf[js.Any])
      
      inline def setFocusOnSelectedOptionUndefined: Self = StObject.set(x, "focusOnSelectedOption", js.undefined)
      
      inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
      
      inline def setInfiniteScroll(value: Boolean): Self = StObject.set(x, "infiniteScroll", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollUndefined: Self = StObject.set(x, "infiniteScroll", js.undefined)
      
      inline def setInitialSelectedId(value: String | Double): Self = StObject.set(x, "initialSelectedId", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedIdUndefined: Self = StObject.set(x, "initialSelectedId", js.undefined)
      
      inline def setListType(value: ListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      inline def setLoadMore(value: /* page */ Double => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction1(value))
      
      inline def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      inline def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      inline def setMaxWidth(value: MaxWidth[String | Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: MinWidth[String | Double]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMoveBy(value: MoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnClickOutside(value: () => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction0(value))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnMouseEnter(value: () => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnSelect(value: /* option */ DropdownLayoutValueOption => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setOptions(value: js.Array[DropdownLayoutOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: DropdownLayoutOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setScrollToOption(value: String | Double): Self = StObject.set(x, "scrollToOption", value.asInstanceOf[js.Any])
      
      inline def setScrollToOptionUndefined: Self = StObject.set(x, "scrollToOption", js.undefined)
      
      inline def setSelectedId(value: String | Double): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
