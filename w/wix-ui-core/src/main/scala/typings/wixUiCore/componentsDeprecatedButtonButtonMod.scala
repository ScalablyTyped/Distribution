package typings.wixUiCore

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.FunctionComponent
import typings.wixUiCore.wixUiCoreStrings.button
import typings.wixUiCore.wixUiCoreStrings.reset
import typings.wixUiCore.wixUiCoreStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsDeprecatedButtonButtonMod {
  
  @JSImport("wix-ui-core/src/components/deprecated/button/Button", "Button")
  @js.native
  val Button: FunctionComponent[ButtonProps] = js.native
  
  trait ButtonProps
    extends StObject
       with ButtonHTMLAttributes[js.Any] {
    
    /** Type of the button - submit / button / reset */
    @JSName("type")
    var type_ButtonProps: js.UndefOr[submit | button | reset] = js.undefined
  }
  object ButtonProps {
    
    inline def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    extension [Self <: ButtonProps](x: Self) {
      
      inline def setType(value: submit | button | reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
