package typings.wixStyleReact

import typings.csstype.mod.MaxWidthProperty
import typings.csstype.mod.MinWidthProperty
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixStyleReact.anon.Close
import typings.wixStyleReact.commonMod.MoveByOffset
import typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutOption
import typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutValueOption
import typings.wixUiCore.popoverPopoverMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownBaseMod {
  
  @JSImport("wix-style-react/dist/es/src/DropdownBase", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[DropdownBaseProps, js.Object, js.Any]
  
  type ChildrenFnArgs = js.Function1[/* data */ Close, ReactNode]
  
  type DropdownBase = PureComponent[DropdownBaseProps, js.Object, js.Any]
  
  type DropdownBaseChildrenFn = ReactNode | ChildrenFnArgs
  
  trait DropdownBaseProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var appendTo: js.UndefOr[String | ReactNode] = js.undefined
    
    var children: js.UndefOr[DropdownBaseChildrenFn] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var dynamicWidth: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var focusOnSelectedOption: js.UndefOr[Boolean] = js.undefined
    
    var initialSelectedId: js.UndefOr[String | Double] = js.undefined
    
    var maxHeight: js.UndefOr[Double | String] = js.undefined
    
    var maxWidth: js.UndefOr[MaxWidthProperty[String | Double]] = js.undefined
    
    var minWidth: js.UndefOr[MinWidthProperty[String | Double]] = js.undefined
    
    var moveBy: js.UndefOr[MoveByOffset] = js.undefined
    
    var onClickOutside: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onMouseLeave: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* option */ DropdownLayoutValueOption, Unit]] = js.undefined
    
    var open: js.UndefOr[Boolean] = js.undefined
    
    var options: js.UndefOr[js.Array[DropdownLayoutOption]] = js.undefined
    
    var overflow: js.UndefOr[String] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var selectedId: js.UndefOr[String | Double] = js.undefined
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object DropdownBaseProps {
    
    @scala.inline
    def apply(): DropdownBaseProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropdownBaseProps]
    }
    
    @scala.inline
    implicit class DropdownBasePropsMutableBuilder[Self <: DropdownBaseProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setAppendTo(value: String | ReactNode): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setChildren(value: DropdownBaseChildrenFn): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenFunction1(value: /* data */ Close => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDynamicWidth(value: Boolean): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDynamicWidthUndefined: Self = StObject.set(x, "dynamicWidth", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      @scala.inline
      def setFocusOnSelectedOption(value: Boolean): Self = StObject.set(x, "focusOnSelectedOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnSelectedOptionUndefined: Self = StObject.set(x, "focusOnSelectedOption", js.undefined)
      
      @scala.inline
      def setInitialSelectedId(value: String | Double): Self = StObject.set(x, "initialSelectedId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectedIdUndefined: Self = StObject.set(x, "initialSelectedId", js.undefined)
      
      @scala.inline
      def setMaxHeight(value: Double | String): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightUndefined: Self = StObject.set(x, "maxHeight", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: MaxWidthProperty[String | Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinWidth(value: MinWidthProperty[String | Double]): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setMoveBy(value: MoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      @scala.inline
      def setOnClickOutside(value: () => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: () => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: () => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* option */ DropdownLayoutValueOption => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[DropdownLayoutOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: DropdownLayoutOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setOverflow(value: String): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setSelectedId(value: String | Double): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      @scala.inline
      def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
