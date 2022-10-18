package typings.themeUiComponents

import typings.std.SVGSVGElement
import typings.themeUiComponents.distDeclarationsSrcTypesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcSvgMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/SVG", "SVG")
  @js.native
  val SVG: ForwardRef[SVGSVGElement, SVGProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.SVGAttributes<std.SVGElement> & @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps ]: P extends keyof react.react.SVGAttributes<std.SVGElement>? react.react.SVGAttributes<std.SVGElement>[P] : P extends keyof @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps? @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps[P] : never} */ trait SVGProps extends StObject {
    
    var size: js.UndefOr[Double | String] = js.undefined
  }
  object SVGProps {
    
    inline def apply(): SVGProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SVGProps]
    }
    
    extension [Self <: SVGProps](x: Self) {
      
      inline def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
