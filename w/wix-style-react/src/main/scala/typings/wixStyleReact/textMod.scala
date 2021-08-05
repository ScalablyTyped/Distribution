package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.csstype.mod.MaxWidthProperty
import typings.csstype.mod.ZIndexProperty
import typings.react.mod.AnchorHTMLAttributes
import typings.react.mod.HTMLAttributes
import typings.react.mod.SFC
import typings.std.HTMLAnchorElement
import typings.std.HTMLSpanElement
import typings.wixStyleReact.anon.DictadditionalPropsOnClick
import typings.wixStyleReact.anon.DictadditionalPropsOnClickTagName
import typings.wixStyleReact.anon.OnClickTagName
import typings.wixStyleReact.anon.TagName
import typings.wixStyleReact.commonMod.MoveByOffset
import typings.wixStyleReact.commonMod.TooltipCommonProps
import typings.wixStyleReact.tooltipMod.TooltipTextAlign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/Text", JSImport.Default)
  @js.native
  val default: SFC[TextProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/Text", "Text")
  @js.native
  val Text: SFC[TextProps] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.checkmark
    - typings.wixStyleReact.wixStyleReactStrings.circle
  */
  trait ListStyle extends StObject
  object ListStyle {
    
    inline def checkmark: typings.wixStyleReact.wixStyleReactStrings.checkmark = "checkmark".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.checkmark]
    
    inline def circle: typings.wixStyleReact.wixStyleReactStrings.circle = "circle".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.circle]
  }
  
  type TextAsAnchorProps[T] = AnchorHTMLAttributes[HTMLAnchorElement] & T & OnClickTagName
  
  type TextAsComponentProps[T] = T & DictadditionalPropsOnClickTagName
  
  type TextAsSpanProps[T] = HTMLAttributes[HTMLSpanElement] & T & TagName
  
  type TextGenericProps[T] = T & DictadditionalPropsOnClick
  
  type TextProps = TextWithAsProp[TextPropsBase]
  
  /* Inlined std.Omit<wix-style-react.wix-style-react/dist/es/src/common/Ellipsis.EllipsisCommonProps, 'size'> & {  dataHook :string | undefined,   tagName :string | undefined,   className :string | undefined,   size :wix-style-react.wix-style-react/dist/es/src/Text.TextSize | undefined,   secondary :boolean | undefined,   skin :wix-style-react.wix-style-react/dist/es/src/Text.TextSkin | undefined,   light :boolean | undefined,   weight :wix-style-react.wix-style-react/dist/es/src/Text.TextWeight | undefined,   listStyle :wix-style-react.wix-style-react/dist/es/src/Text.ListStyle | undefined,   tooltipProps :wix-style-react.wix-style-react/dist/es/src/common.TooltipCommonProps | undefined} */
  trait TextPropsBase extends StObject {
    
    var appendTo: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ js.Any
      ] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    var enterDelay: js.UndefOr[Double] = js.undefined
    
    var exitDelay: js.UndefOr[Double] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    var light: js.UndefOr[Boolean] = js.undefined
    
    var listStyle: js.UndefOr[ListStyle] = js.undefined
    
    var maxLines: js.UndefOr[Double] = js.undefined
    
    var maxWidth: js.UndefOr[MaxWidthProperty[String | Double]] = js.undefined
    
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    var moveBy: js.UndefOr[MoveByOffset] = js.undefined
    
    var onHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var placement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
      ] = js.undefined
    
    var secondary: js.UndefOr[Boolean] = js.undefined
    
    var showTooltip: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[TextSize] = js.undefined
    
    var skin: js.UndefOr[TextSkin] = js.undefined
    
    var tagName: js.UndefOr[String] = js.undefined
    
    var textAlign: js.UndefOr[TooltipTextAlign] = js.undefined
    
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
    
    var weight: js.UndefOr[TextWeight] = js.undefined
    
    var zIndex: js.UndefOr[ZIndexProperty] = js.undefined
  }
  object TextPropsBase {
    
    inline def apply(): TextPropsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextPropsBase]
    }
    
    extension [Self <: TextPropsBase](x: Self) {
      
      inline def setAppendTo(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AppendTo */ js.Any
      ): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
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
      
      inline def setLight(value: Boolean): Self = StObject.set(x, "light", value.asInstanceOf[js.Any])
      
      inline def setLightUndefined: Self = StObject.set(x, "light", js.undefined)
      
      inline def setListStyle(value: ListStyle): Self = StObject.set(x, "listStyle", value.asInstanceOf[js.Any])
      
      inline def setListStyleUndefined: Self = StObject.set(x, "listStyle", js.undefined)
      
      inline def setMaxLines(value: Double): Self = StObject.set(x, "maxLines", value.asInstanceOf[js.Any])
      
      inline def setMaxLinesUndefined: Self = StObject.set(x, "maxLines", js.undefined)
      
      inline def setMaxWidth(value: MaxWidthProperty[String | Double]): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      inline def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      inline def setMoveBy(value: MoveByOffset): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setOnHide(value: () => Unit): Self = StObject.set(x, "onHide", js.Any.fromFunction0(value))
      
      inline def setOnHideUndefined: Self = StObject.set(x, "onHide", js.undefined)
      
      inline def setOnShow(value: () => Unit): Self = StObject.set(x, "onShow", js.Any.fromFunction0(value))
      
      inline def setOnShowUndefined: Self = StObject.set(x, "onShow", js.undefined)
      
      inline def setPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
      ): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      inline def setSecondary(value: Boolean): Self = StObject.set(x, "secondary", value.asInstanceOf[js.Any])
      
      inline def setSecondaryUndefined: Self = StObject.set(x, "secondary", js.undefined)
      
      inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
      
      inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
      
      inline def setSize(value: TextSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSkin(value: TextSkin): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
      
      inline def setSkinUndefined: Self = StObject.set(x, "skin", js.undefined)
      
      inline def setTagName(value: String): Self = StObject.set(x, "tagName", value.asInstanceOf[js.Any])
      
      inline def setTagNameUndefined: Self = StObject.set(x, "tagName", js.undefined)
      
      inline def setTextAlign(value: TooltipTextAlign): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      inline def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
      
      inline def setWeight(value: TextWeight): Self = StObject.set(x, "weight", value.asInstanceOf[js.Any])
      
      inline def setWeightUndefined: Self = StObject.set(x, "weight", js.undefined)
      
      inline def setZIndex(value: ZIndexProperty): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.tiny
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
  */
  trait TextSize extends StObject
  object TextSize {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
    
    inline def tiny: typings.wixStyleReact.wixStyleReactStrings.tiny = "tiny".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.tiny]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.standard
    - typings.wixStyleReact.wixStyleReactStrings.error
    - typings.wixStyleReact.wixStyleReactStrings.success
    - typings.wixStyleReact.wixStyleReactStrings.premium
    - typings.wixStyleReact.wixStyleReactStrings.disabled
    - typings.wixStyleReact.wixStyleReactStrings.primary
  */
  trait TextSkin extends StObject
  object TextSkin {
    
    inline def disabled: typings.wixStyleReact.wixStyleReactStrings.disabled = "disabled".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.disabled]
    
    inline def error: typings.wixStyleReact.wixStyleReactStrings.error = "error".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.error]
    
    inline def premium: typings.wixStyleReact.wixStyleReactStrings.premium = "premium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.premium]
    
    inline def primary: typings.wixStyleReact.wixStyleReactStrings.primary = "primary".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.primary]
    
    inline def standard: typings.wixStyleReact.wixStyleReactStrings.standard = "standard".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.standard]
    
    inline def success: typings.wixStyleReact.wixStyleReactStrings.success = "success".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.success]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.thin
    - typings.wixStyleReact.wixStyleReactStrings.normal
    - typings.wixStyleReact.wixStyleReactStrings.bold
  */
  trait TextWeight extends StObject
  object TextWeight {
    
    inline def bold: typings.wixStyleReact.wixStyleReactStrings.bold = "bold".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.bold]
    
    inline def normal: typings.wixStyleReact.wixStyleReactStrings.normal = "normal".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.normal]
    
    inline def thin: typings.wixStyleReact.wixStyleReactStrings.thin = "thin".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.thin]
  }
  
  type TextWithAsProp[T] = TextAsSpanProps[T] | TextAsAnchorProps[T] | TextGenericProps[T] | TextAsComponentProps[T]
  
  type _To = SFC[TextProps]
  
  /* This means you don't have to write `default`, but can instead just say `textMod.foo` */
  override def _to: SFC[TextProps] = default
}
