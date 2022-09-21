package typings.themeUiComponents

import typings.std.HTMLIFrameElement
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object embedMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Embed", "Embed")
  @js.native
  val Embed: ForwardRef[HTMLIFrameElement, EmbedProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentPropsWithRef<'iframe'> & @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps ]: P extends keyof react.react.ComponentPropsWithRef<'iframe'>? react.react.ComponentPropsWithRef<'iframe'>[P] : P extends keyof @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps? @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps[P] : never} */ trait EmbedProps extends StObject {
    
    var allow: js.UndefOr[String] = js.undefined
    
    var allowFullScreen: js.UndefOr[Boolean] = js.undefined
    
    var frameBorder: js.UndefOr[Double | String] = js.undefined
    
    var ratio: js.UndefOr[Double] = js.undefined
    
    var src: js.UndefOr[String] = js.undefined
    
    var variant: js.UndefOr[String] = js.undefined
  }
  object EmbedProps {
    
    inline def apply(): EmbedProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmbedProps]
    }
    
    extension [Self <: EmbedProps](x: Self) {
      
      inline def setAllow(value: String): Self = StObject.set(x, "allow", value.asInstanceOf[js.Any])
      
      inline def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      inline def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      inline def setAllowUndefined: Self = StObject.set(x, "allow", js.undefined)
      
      inline def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      inline def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVariantUndefined: Self = StObject.set(x, "variant", js.undefined)
    }
  }
}
