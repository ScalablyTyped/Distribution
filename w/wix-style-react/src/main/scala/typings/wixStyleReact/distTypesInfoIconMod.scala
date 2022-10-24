package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.wixStyleReact.distTypesCommonMod.TooltipCommonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInfoIconMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/InfoIcon", JSImport.Default)
  @js.native
  val default: FC[InfoIconProps] = js.native
  
  trait InfoIconProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var content: ReactNode
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var size: js.UndefOr[InfoIconSize] = js.undefined
    
    var tooltipProps: js.UndefOr[TooltipCommonProps] = js.undefined
  }
  object InfoIconProps {
    
    inline def apply(): InfoIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InfoIconProps]
    }
    
    extension [Self <: InfoIconProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setContent(value: ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setSize(value: InfoIconSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTooltipProps(value: TooltipCommonProps): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
      
      inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
  */
  trait InfoIconSize extends StObject
  object InfoIconSize {
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
  
  type _To = FC[InfoIconProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesInfoIconMod.foo` */
  override def _to: FC[InfoIconProps] = default
}
