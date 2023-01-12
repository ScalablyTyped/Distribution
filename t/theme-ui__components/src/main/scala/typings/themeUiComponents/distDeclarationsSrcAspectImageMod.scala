package typings.themeUiComponents

import typings.std.HTMLImageElement
import typings.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcAspectImageMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/AspectImage", "AspectImage")
  @js.native
  val AspectImage: ForwardRef[HTMLImageElement, AspectImageProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentPropsWithRef<'img'> & @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps ]: P extends keyof react.react.ComponentPropsWithRef<'img'>? react.react.ComponentPropsWithRef<'img'>[P] : P extends keyof @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps? @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps[P] : never} */ trait AspectImageProps extends StObject {
    
    var ratio: js.UndefOr[Double] = js.undefined
  }
  object AspectImageProps {
    
    inline def apply(): AspectImageProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AspectImageProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AspectImageProps] (val x: Self) extends AnyVal {
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
}
