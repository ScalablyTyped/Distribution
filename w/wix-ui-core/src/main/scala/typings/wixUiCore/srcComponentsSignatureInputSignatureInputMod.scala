package typings.wixUiCore

import typings.react.mod.Component
import typings.react.mod.FunctionComponent
import typings.wixUiCore.anon.PickClearButtonPropschild0
import typings.wixUiCore.anon.PickSigningPadPropsaccess
import typings.wixUiCore.anon.PickTitlePropschildren0
import typings.wixUiCore.anon.SetInputId
import typings.wixUiCore.componentsSignatureInputSignatureInputContextMod.SignaturePadApiContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsSignatureInputSignatureInputMod {
  
  @JSImport("wix-ui-core/src/components/signature-input/SignatureInput", "SignatureInput")
  @js.native
  class SignatureInput protected ()
    extends Component[js.Object, SignatureInputState, js.Any] {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
    
    def setInputId(inputId: String): Unit = js.native
    
    def setSignaturePadContext(padApi: SignaturePadApiContext): Unit = js.native
    
    def setSignatureTitleId(titleId: String): Unit = js.native
    
    @JSName("state")
    val state_SignatureInput: SetInputId = js.native
  }
  /* static members */
  object SignatureInput {
    
    @JSImport("wix-ui-core/src/components/signature-input/SignatureInput", "SignatureInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/signature-input/SignatureInput", "SignatureInput.ClearButton")
    @js.native
    def ClearButton: FunctionComponent[PickClearButtonPropschild0] = js.native
    inline def ClearButton_=(x: FunctionComponent[PickClearButtonPropschild0]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearButton")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/signature-input/SignatureInput", "SignatureInput.SigningPad")
    @js.native
    def SigningPad: FunctionComponent[PickSigningPadPropsaccess] = js.native
    inline def SigningPad_=(x: FunctionComponent[PickSigningPadPropsaccess]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SigningPad")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/signature-input/SignatureInput", "SignatureInput.Title")
    @js.native
    def Title: FunctionComponent[PickTitlePropschildren0] = js.native
    inline def Title_=(x: FunctionComponent[PickTitlePropschildren0]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/signature-input/SignatureInput", "SignatureInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Readonly<wix-ui-core.wix-ui-core/src/components/signature-input/SignatureInputContext.SignatureInputContextValue> */
  trait SignatureInputState extends StObject {
    
    val inputId: js.UndefOr[String] = js.undefined
    
    val padApi: js.UndefOr[SignaturePadApiContext] = js.undefined
    
    val setInputId: js.Function1[/* id */ js.UndefOr[String], Unit]
    
    val setSignaturePadContext: js.Function1[/* api */ SignaturePadApiContext, Unit]
    
    val setSignatureTitleId: js.Function1[/* id */ js.UndefOr[String], Unit]
    
    val titleId: js.UndefOr[String] = js.undefined
  }
  object SignatureInputState {
    
    inline def apply(
      setInputId: /* id */ js.UndefOr[String] => Unit,
      setSignaturePadContext: /* api */ SignaturePadApiContext => Unit,
      setSignatureTitleId: /* id */ js.UndefOr[String] => Unit
    ): SignatureInputState = {
      val __obj = js.Dynamic.literal(setInputId = js.Any.fromFunction1(setInputId), setSignaturePadContext = js.Any.fromFunction1(setSignaturePadContext), setSignatureTitleId = js.Any.fromFunction1(setSignatureTitleId))
      __obj.asInstanceOf[SignatureInputState]
    }
    
    extension [Self <: SignatureInputState](x: Self) {
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setPadApi(value: SignaturePadApiContext): Self = StObject.set(x, "padApi", value.asInstanceOf[js.Any])
      
      inline def setPadApiUndefined: Self = StObject.set(x, "padApi", js.undefined)
      
      inline def setSetInputId(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setInputId", js.Any.fromFunction1(value))
      
      inline def setSetSignaturePadContext(value: /* api */ SignaturePadApiContext => Unit): Self = StObject.set(x, "setSignaturePadContext", js.Any.fromFunction1(value))
      
      inline def setSetSignatureTitleId(value: /* id */ js.UndefOr[String] => Unit): Self = StObject.set(x, "setSignatureTitleId", js.Any.fromFunction1(value))
      
      inline def setTitleId(value: String): Self = StObject.set(x, "titleId", value.asInstanceOf[js.Any])
      
      inline def setTitleIdUndefined: Self = StObject.set(x, "titleId", js.undefined)
    }
  }
}
