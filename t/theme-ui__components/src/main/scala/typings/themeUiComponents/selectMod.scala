package typings.themeUiComponents

import typings.react.mod.ReactElement
import typings.std.HTMLSelectElement
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Select", "Select")
  @js.native
  val Select: ForwardRef[HTMLSelectElement, SelectProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentPropsWithRef<'select'> & @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps ]: P extends keyof react.react.ComponentPropsWithRef<'select'>? react.react.ComponentPropsWithRef<'select'>[P] : P extends keyof @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps? @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps[P] : never} */ trait SelectProps extends StObject {
    
    var arrow: js.UndefOr[ReactElement] = js.undefined
  }
  object SelectProps {
    
    inline def apply(): SelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectProps]
    }
    
    extension [Self <: SelectProps](x: Self) {
      
      inline def setArrow(value: ReactElement): Self = StObject.set(x, "arrow", value.asInstanceOf[js.Any])
      
      inline def setArrowUndefined: Self = StObject.set(x, "arrow", js.undefined)
    }
  }
}
