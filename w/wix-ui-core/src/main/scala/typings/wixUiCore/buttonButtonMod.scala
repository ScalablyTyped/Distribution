package typings.wixUiCore

import typings.react.mod.ButtonHTMLAttributes
import typings.react.mod.FunctionComponent
import typings.wixUiCore.wixUiCoreStrings.button
import typings.wixUiCore.wixUiCoreStrings.reset
import typings.wixUiCore.wixUiCoreStrings.submit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonButtonMod {
  
  @JSImport("wix-ui-core/dist/src/components/deprecated/button/Button", "Button")
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
    
    @scala.inline
    def apply(): ButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonProps]
    }
    
    @scala.inline
    implicit class ButtonPropsMutableBuilder[Self <: ButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: submit | button | reset): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
