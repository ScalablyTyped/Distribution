package typings.themeUiComponents

import typings.std.SVGSVGElement
import typings.themeUiComponents.distDeclarationsSrcBoxMod.BoxOwnProps
import typings.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcSpinnerMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Spinner", "Spinner")
  @js.native
  val Spinner: ForwardRef[SVGSVGElement, SpinnerProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof react.react.ComponentPropsWithRef<'svg'>, 'opacity' | 'color' | 'css' | 'sx' | 'strokeWidth'> ]: react.react.ComponentPropsWithRef<'svg'>[P]} */ trait SpinnerProps
    extends StObject
       with BoxOwnProps {
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[Double | String] = js.undefined
    
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object SpinnerProps {
    
    inline def apply(): SpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpinnerProps] (val x: Self) extends AnyVal {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
