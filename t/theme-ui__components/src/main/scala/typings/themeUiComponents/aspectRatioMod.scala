package typings.themeUiComponents

import typings.std.HTMLDivElement
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object aspectRatioMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/AspectRatio", "AspectRatio")
  @js.native
  val AspectRatio: ForwardRef[HTMLDivElement, AspectRatioProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in std.Exclude<keyof @theme-ui/components.@theme-ui/components/dist/declarations/src/types.Assign<react.react.ComponentPropsWithRef<'div'>, @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps>, 'ref'> ]: @theme-ui/components.@theme-ui/components/dist/declarations/src/types.Assign<react.react.ComponentPropsWithRef<'div'>, @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps>[P]} */ trait AspectRatioProps extends StObject {
    
    var ratio: js.UndefOr[Double] = js.undefined
  }
  object AspectRatioProps {
    
    inline def apply(): AspectRatioProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AspectRatioProps]
    }
    
    extension [Self <: AspectRatioProps](x: Self) {
      
      inline def setRatio(value: Double): Self = StObject.set(x, "ratio", value.asInstanceOf[js.Any])
      
      inline def setRatioUndefined: Self = StObject.set(x, "ratio", js.undefined)
    }
  }
}
