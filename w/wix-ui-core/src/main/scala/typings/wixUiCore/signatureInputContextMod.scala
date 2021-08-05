package typings.wixUiCore

import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.react.mod.Provider
import typings.std.Exclude
import typings.std.Pick
import typings.wixUiCore.wixUiCoreStrings.inputId
import typings.wixUiCore.wixUiCoreStrings.padApi
import typings.wixUiCore.wixUiCoreStrings.setInputId
import typings.wixUiCore.wixUiCoreStrings.setSignaturePadContext
import typings.wixUiCore.wixUiCoreStrings.setSignatureTitleId
import typings.wixUiCore.wixUiCoreStrings.titleId
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object signatureInputContextMod {
  
  @JSImport("wix-ui-core/dist/src/components/signature-input/SignatureInputContext", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/src/components/signature-input/SignatureInputContext", "SignatureInputContextProvider")
  @js.native
  val SignatureInputContextProvider: Provider[SignatureInputContextValue] = js.native
  
  inline def withSignatureInputContext[P /* <: WithSignaturePadProps */](WrappedComponent: ComponentType[P]): FunctionComponent[
    Pick[
      P, 
      Exclude[
        /* keyof P */ String, 
        inputId | titleId | padApi | setSignaturePadContext | setSignatureTitleId | setInputId
      ]
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withSignatureInputContext")(WrappedComponent.asInstanceOf[js.Any]).asInstanceOf[FunctionComponent[
    Pick[
      P, 
      Exclude[
        /* keyof P */ String, 
        inputId | titleId | padApi | setSignaturePadContext | setSignatureTitleId | setInputId
      ]
    ]
  ]]
  
  @js.native
  trait SignatureInputContextValue extends StObject {
    
    var inputId: js.UndefOr[String] = js.native
    
    var padApi: js.UndefOr[SignaturePadApiContext] = js.native
    
    def setInputId(): Unit = js.native
    def setInputId(id: String): Unit = js.native
    
    def setSignaturePadContext(api: SignaturePadApiContext): Unit = js.native
    
    def setSignatureTitleId(): Unit = js.native
    def setSignatureTitleId(id: String): Unit = js.native
    
    var titleId: js.UndefOr[String] = js.native
  }
  
  trait SignaturePadApiContext extends StObject {
    
    def clear(): Unit
  }
  object SignaturePadApiContext {
    
    inline def apply(clear: () => Unit): SignaturePadApiContext = {
      val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear))
      __obj.asInstanceOf[SignaturePadApiContext]
    }
    
    extension [Self <: SignaturePadApiContext](x: Self) {
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    }
  }
  
  type WithSignaturePadProps = SignatureInputContextValue
}
