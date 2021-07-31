package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.wixUiCore.anon.GetClearButtonProps
import typings.wixUiCore.anon.PickClearButtonPropschild
import typings.wixUiCore.buttonNextButtonNextMod.ButtonProps
import typings.wixUiCore.signatureInputContextMod.SignatureInputContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clearButtonClearButtonMod {
  
  @JSImport("wix-ui-core/dist/src/components/signature-input/clear-button/ClearButton", "ClearButton")
  @js.native
  val ClearButton: FunctionComponent[PickClearButtonPropschild] = js.native
  
  type ClearButtonChildrenFn = js.Function1[/* childrenFn */ GetClearButtonProps, Element]
  
  trait ClearButtonChildrenProps
    extends StObject
       with ButtonProps {
    
    var `data-hook`: js.UndefOr[String] = js.undefined
  }
  object ClearButtonChildrenProps {
    
    @scala.inline
    def apply(): ClearButtonChildrenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearButtonChildrenProps]
    }
    
    @scala.inline
    implicit class ClearButtonChildrenPropsMutableBuilder[Self <: ClearButtonChildrenProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
    }
  }
  
  @js.native
  trait ClearButtonProps
    extends StObject
       with SignatureInputContextValue {
    
    var children: js.UndefOr[ClearButtonChildrenFn] = js.native
  }
}
