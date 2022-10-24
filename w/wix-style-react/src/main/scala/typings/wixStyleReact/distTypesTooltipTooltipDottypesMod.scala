package typings.wixStyleReact

import typings.csstype.mod.Property.MaxWidth
import typings.react.mod.ReactNode
import typings.std.Element
import typings.wixStyleReact.distTypesPopoverPopoverCoreUtilsGetModifiersMod.MoveBy
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTooltipTooltipDottypesMod {
  
  trait TooltipActions extends StObject {
    
    def close(): Unit
    
    def open(): Unit
  }
  object TooltipActions {
    
    inline def apply(close: () => Unit, open: () => Unit): TooltipActions = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), open = js.Any.fromFunction0(open))
      __obj.asInstanceOf[TooltipActions]
    }
    
    extension [Self <: TooltipActions](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setOpen(value: () => Unit): Self = StObject.set(x, "open", js.Any.fromFunction0(value))
    }
  }
  
  trait TooltipProps extends StObject {
    
    /**
      * Calculates tooltip’s position in relation to a DOM element.
      * Can be either: 'window', 'scrollParent', 'viewport', 'parent', element or
      * function based predicate. I.e., (elm) => elm.getAttribute('data-hook') === 'value
      */
    var appendTo: js.UndefOr[AppendTo] = js.undefined
    
    /** Connects tooltip’s trigger element to tooltip’s content for assistive technologies */
    var `aria-describedby`: js.UndefOr[String] = js.undefined
    
    /** Defines tooltip’s trigger element */
    var children: ReactNode
    
    /** Applies a CSS class to the component’s root element */
    var className: js.UndefOr[String] = js.undefined
    
    /** Defines the content to be shown inside a tooltip */
    var content: js.UndefOr[ReactNode] = js.undefined
    
    /** Applies a data-hook HTML attribute to be used in the tests */
    var dataHook: js.UndefOr[String] = js.undefined
    
    /** Allows showing a tooltip when hovering on a disabled trigger element with mouse */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Sets time to wait before showing the tooltip (in milliseconds) */
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    /** Sets time to wait before hiding the tooltip (in milliseconds) */
    var exitDelay: js.UndefOr[Double] = js.undefined
    
    /** Enables keeping a tooltip at its original placement even when it is being positioned outside the boundary */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /** Flips a tooltip’s placement when it starts to overlap its trigger element */
    var flip: js.UndefOr[Boolean] = js.undefined
    
    /** Stretches the root element to the width of its container */
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    /** Defines max width of a tooltip in px. If content is wider than maxWidth allows, it wraps into multiple lines. */
    var maxWidth: js.UndefOr[MaxWidth[String | Double]] = js.undefined
    
    /** Moves a tooltip’s arrow by a defined amount */
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    /** Moves a tooltip in relation to its trigger element on x or y axis */
    var moveBy: js.UndefOr[MoveBy] = js.undefined
    
    /** Defines a callback function on tooltip’s hide event */
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Defines a callback function on tooltip’s show event */
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Sets tooltip’s placement in relation to its trigger element */
    var placement: js.UndefOr[Placement] = js.undefined
    
    /** Controls the size of a tooltip */
    var size: js.UndefOr[TooltipSize] = js.undefined
    
    /** Controls the alignment of tooltip’s content */
    var textAlign: js.UndefOr[TooltipTextAlign] = js.undefined
    
    /** Controls the tooltip’s z-index */
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setAppendTo(value: AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      inline def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
      
      inline def setExitDelayUndefined: Self = StObject.set(x, "exitDelay", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setMaxWidth(value: MaxWidth[String | Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      inline def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      inline def setMoveBy(value: MoveBy): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setSize(value: TooltipSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTextAlign(value: TooltipTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
  */
  trait TooltipSize extends StObject
  object TooltipSize {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.center
    - typings.wixStyleReact.wixStyleReactStrings.start
  */
  trait TooltipTextAlign extends StObject
  object TooltipTextAlign {
    
    inline def center: typings.wixStyleReact.wixStyleReactStrings.center = "center".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.center]
    
    inline def start: typings.wixStyleReact.wixStyleReactStrings.start = "start".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.start]
  }
}
