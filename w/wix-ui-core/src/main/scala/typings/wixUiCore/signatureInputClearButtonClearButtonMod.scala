package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.global.JSX.Element
import typings.wixUiCore.anon.PickClearButtonPropschildChildren
import typings.wixUiCore.anon.`2`
import typings.wixUiCore.componentsButtonNextButtonNextMod.ButtonProps
import typings.wixUiCore.signatureInputSignatureInputContextMod.SignatureInputContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureInputClearButtonClearButtonMod {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/signature-input/clear-button/ClearButton", "ClearButton")
  @js.native
  val ClearButton: FunctionComponent[PickClearButtonPropschildChildren] = js.native
  
  type ClearButtonChildrenFn = js.Function1[/* childrenFn */ `2`, Element]
  
  trait ClearButtonChildrenProps
    extends StObject
       with ButtonProps {
    
    var `data-hook`: js.UndefOr[String] = js.undefined
  }
  object ClearButtonChildrenProps {
    
    inline def apply(): ClearButtonChildrenProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClearButtonChildrenProps]
    }
    
    extension [Self <: ClearButtonChildrenProps](x: Self) {
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
    }
  }
  
  @js.native
  trait ClearButtonProps
    extends StObject
       with SignatureInputContextValue {
    
    var children: js.UndefOr[ClearButtonChildrenFn] = js.native
  }
}
