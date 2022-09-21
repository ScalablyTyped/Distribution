package typings.themeUiComponents

import typings.std.HTMLInputElement
import typings.themeUiComponents.typesMod.ForwardRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object inputMod {
  
  @JSImport("@theme-ui/components/dist/declarations/src/Input", "Input")
  @js.native
  val Input: ForwardRef[HTMLInputElement, InputProps] = js.native
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof react.react.ComponentPropsWithRef<'input'> & @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps ]: P extends keyof react.react.ComponentPropsWithRef<'input'>? react.react.ComponentPropsWithRef<'input'>[P] : P extends keyof @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps? @theme-ui/components.@theme-ui/components/dist/declarations/src/Box.BoxOwnProps[P] : never} */ trait InputProps extends StObject {
    
    var autofillBackgroundColor: js.UndefOr[String] = js.undefined
  }
  object InputProps {
    
    inline def apply(): InputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputProps]
    }
    
    extension [Self <: InputProps](x: Self) {
      
      inline def setAutofillBackgroundColor(value: String): Self = StObject.set(x, "autofillBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setAutofillBackgroundColorUndefined: Self = StObject.set(x, "autofillBackgroundColor", js.undefined)
    }
  }
}
