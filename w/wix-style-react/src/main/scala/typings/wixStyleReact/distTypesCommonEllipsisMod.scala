package typings.wixStyleReact

import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.std.Element
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.AppendTo
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import typings.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipSize
import typings.wixStyleReact.distTypesTooltipTooltipDottypesMod.TooltipTextAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCommonEllipsisMod {
  
  @JSImport("wix-style-react/dist/types/common/Ellipsis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/types/common/Ellipsis", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[IEllipsisProps, js.Object, Any]
  
  inline def extractEllipsisProps[T](props: T & EllipsisCommonProps): typings.wixStyleReact.anon.EllipsisProps[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractEllipsisProps")(props.asInstanceOf[js.Any]).asInstanceOf[typings.wixStyleReact.anon.EllipsisProps[T]]
  
  type Ellipsis = PureComponent[IEllipsisProps, js.Object, Any]
  
  trait EllipsisCommonProps
    extends StObject
       with TooltipCommonProps {
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var showTooltip: js.UndefOr[Boolean] = js.undefined
  }
  object EllipsisCommonProps {
    
    inline def apply(): EllipsisCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisCommonProps]
    }
    
    extension [Self <: EllipsisCommonProps](x: Self) {
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    }
  }
  
  /* Inlined wix-style-react.wix-style-react/dist/types/common/Ellipsis.EllipsisCommonProps & {  wrapperClassName :string | undefined} */
  trait EllipsisProps extends StObject {
    
    var appendTo: js.UndefOr[AppendTo] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var exitDelay: js.UndefOr[Double] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ] = js.undefined
    
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    var moveBy: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/Popover/Popover.types.PopoverProps['moveBy'] */ js.Any
      ] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[Placement] = js.undefined
    
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[TooltipSize] = js.undefined
    
    var textAlign: js.UndefOr[TooltipTextAlign] = js.undefined
    
    var wrapperClassName: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object EllipsisProps {
    
    inline def apply(): EllipsisProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisProps]
    }
    
    extension [Self <: EllipsisProps](x: Self) {
      
      inline def setAppendTo(value: AppendTo): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToFunction1(value: /* s */ Element => Boolean): Self = StObject.set(x, "appendTo", js.Any.fromFunction1(value))
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      inline def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      inline def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      inline def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      inline def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
      
      inline def setExitDelayUndefined: Self = StObject.set(x, "exitDelay", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMaxWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      inline def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      inline def setMoveBy(
        value: /* import warning: importer.ImportType#apply Failed type conversion: wix-style-react.wix-style-react/dist/types/Popover/Popover.types.PopoverProps['moveBy'] */ js.Any
      ): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setSize(value: TooltipSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTextAlign(value: TooltipTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      inline def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait IEllipsisProps
    extends StObject
       with EllipsisProps {
    
    def render[T](renderProps: RenderProps[T]): ReactElement
  }
  object IEllipsisProps {
    
    inline def apply(render: RenderProps[Any] => ReactElement): IEllipsisProps = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[IEllipsisProps]
    }
    
    extension [Self <: IEllipsisProps](x: Self) {
      
      inline def setRender(value: RenderProps[Any] => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RenderProps[T] extends StObject {
    
    // TODO - React.RefObject<T>,
    def ellipsisClasses(): String = js.native
    def ellipsisClasses(className: String): String = js.native
    
    var ellipsisInlineStyle: js.UndefOr[CSSProperties] = js.native
    
    var ref: Any = js.native
  }
}
