package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.wixUiCore.anon.PickClearButtonPropschild0
import typings.wixUiCore.anon.`5`
import typings.wixUiCore.componentsSignatureInputSignatureInputContextMod.SignatureInputContextValue
import typings.wixUiCore.srcComponentsButtonNextButtonNextMod.ButtonProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsSignatureInputClearButtonClearButtonMod {
  
  @JSImport("wix-ui-core/src/components/signature-input/clear-button/ClearButton", "ClearButton")
  @js.native
  val ClearButton: FunctionComponent[PickClearButtonPropschild0] = js.native
  
  type ClearButtonChildrenFn = js.Function1[/* childrenFn */ `5`, Element]
  
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
