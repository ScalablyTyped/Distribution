package typings.themeUiComponents

import typings.std.SVGSVGElement
import typings.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcDonutMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Donut", "Donut")
  @js.native
  val Donut: ForwardRef[SVGSVGElement, DonutProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Omit<react.react.ComponentPropsWithRef<'svg'>, 'opacity' | 'color' | 'css' | 'sx' | 'max' | 'min'> & @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps ]: P extends keyof std.Omit<react.react.ComponentPropsWithRef<'svg'>, 'opacity' | 'color' | 'css' | 'sx' | 'max' | 'min'>? std.Omit<react.react.ComponentPropsWithRef<'svg'>, 'opacity' | 'color' | 'css' | 'sx' | 'max' | 'min'>[P] : P extends keyof @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps? @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps[P] : never} */ trait DonutProps extends StObject {
    
    var max: js.UndefOr[Double] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[String | Double] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var value: Double
  }
  object DonutProps {
    
    inline def apply(value: Double): DonutProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[DonutProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DonutProps] (val x: Self) extends AnyVal {
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setSize(value: String | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
