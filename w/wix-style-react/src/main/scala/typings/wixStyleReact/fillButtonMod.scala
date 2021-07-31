package typings.wixStyleReact

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.commonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillButtonMod {
  
  @JSImport("wix-style-react/dist/es/src/FillButton", JSImport.Default)
  @js.native
  class default ()
    extends PureComponent[FillButtonProps, js.Object, js.Any]
  
  type FillButton = PureComponent[FillButtonProps, js.Object, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
  */
  trait FillButtonIconSize extends StObject
  object FillButtonIconSize {
    
    @scala.inline
    def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    @scala.inline
    def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  trait FillButtonProps
    extends StObject
       with ButtonHTMLAttributes[HTMLButtonElement] {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var fill: js.UndefOr[String] = js.undefined
    
    var iconSize: js.UndefOr[FillButtonIconSize] = js.undefined
    
    var tooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  }
  object FillButtonProps {
    
    @scala.inline
    def apply(): FillButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FillButtonProps]
    }
    
    @scala.inline
    implicit class FillButtonPropsMutableBuilder[Self <: FillButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setIconSize(value: FillButtonIconSize): Self = StObject.set(x, "iconSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconSizeUndefined: Self = StObject.set(x, "iconSize", js.undefined)
      
      @scala.inline
      def setTooltipContent(value: ReactNode): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipContentUndefined: Self = StObject.set(x, "tooltipContent", js.undefined)
      
      @scala.inline
      def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
}
