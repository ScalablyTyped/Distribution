package typings.wixStyleReact

import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactElement
import typings.wixStyleReact.anon.ComponentProps
import typings.wixStyleReact.commonMod.MoveByOffset
import typings.wixStyleReact.commonMod.TooltipCommonProps
import typings.wixStyleReact.tooltipMod.TooltipSize
import typings.wixStyleReact.tooltipMod.TooltipTextAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ellipsisMod {
  
  @JSImport("wix-style-react/dist/es/src/common/Ellipsis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-style-react/dist/es/src/common/Ellipsis", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[IEllipsisProps, js.Object, js.Any]
  
  @scala.inline
  def extractEllipsisProps[T](props: T & EllipsisCommonProps): ComponentProps[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("extractEllipsisProps")(props.asInstanceOf[js.Any]).asInstanceOf[ComponentProps[T]]
  
  type Ellipsis = PureComponent[IEllipsisProps, js.Object, js.Any]
  
  trait EllipsisCommonProps
    extends StObject
       with TooltipCommonProps {
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var showTooltip: js.UndefOr[Boolean] = js.undefined
  }
  object EllipsisCommonProps {
    
    @scala.inline
    def apply(): EllipsisCommonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisCommonProps]
    }
    
    @scala.inline
    implicit class EllipsisCommonPropsMutableBuilder[Self <: EllipsisCommonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    }
  }
  
  /* Inlined wix-style-react.wix-style-react/dist/es/src/common/Ellipsis.EllipsisCommonProps & {  wrapperClassName :string | undefined} */
  trait EllipsisProps extends StObject {
    
    var appendTo: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ js.Any
      ] = js.undefined
    
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
    
    var moveBy: js.UndefOr[MoveByOffset] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
      ] = js.undefined
    
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[TooltipSize] = js.undefined
    
    var textAlign: js.UndefOr[TooltipTextAlign] = js.undefined
    
    var wrapperClassName: js.UndefOr[String] = js.undefined
    
    var zIndex: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['zIndex'] */ js.Any
      ] = js.undefined
  }
  object EllipsisProps {
    
    @scala.inline
    def apply(): EllipsisProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EllipsisProps]
    }
    
    @scala.inline
    implicit class EllipsisPropsMutableBuilder[Self <: EllipsisProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppendTo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ js.Any
      ): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setEnterDelay(value: Double): Self = StObject.set(x, "enterDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterDelayUndefined: Self = StObject.set(x, "enterDelay", js.undefined)
      
      @scala.inline
      def setExitDelay(value: Double): Self = StObject.set(x, "exitDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExitDelayUndefined: Self = StObject.set(x, "exitDelay", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      @scala.inline
      def setMaxWidth(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['maxWidth'] */ js.Any
      ): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      @scala.inline
      def setMoveBy(value: MoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      @scala.inline
      def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      @scala.inline
      def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      @scala.inline
      def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      @scala.inline
      def setSize(value: TooltipSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTextAlign(value: TooltipTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setWrapperClassName(value: String): Self = StObject.set(x, "wrapperClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapperClassNameUndefined: Self = StObject.set(x, "wrapperClassName", js.undefined)
      
      @scala.inline
      def setZIndex(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.CSSProperties['zIndex'] */ js.Any
      ): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  trait IEllipsisProps
    extends StObject
       with EllipsisProps {
    
    def render[T](renderProps: RenderProps[T]): ReactElement
  }
  object IEllipsisProps {
    
    @scala.inline
    def apply(render: RenderProps[js.Any] => ReactElement): IEllipsisProps = {
      val __obj = js.Dynamic.literal(render = js.Any.fromFunction1(render))
      __obj.asInstanceOf[IEllipsisProps]
    }
    
    @scala.inline
    implicit class IEllipsisPropsMutableBuilder[Self <: IEllipsisProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRender(value: RenderProps[js.Any] => ReactElement): Self = StObject.set(x, "render", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait RenderProps[T] extends StObject {
    
    // TODO - React.RefObject<T>,
    def ellipsisClasses(): String = js.native
    def ellipsisClasses(className: String): String = js.native
    
    var ellipsisInlineStyle: js.UndefOr[CSSProperties] = js.native
    
    var ref: js.Any = js.native
  }
}
