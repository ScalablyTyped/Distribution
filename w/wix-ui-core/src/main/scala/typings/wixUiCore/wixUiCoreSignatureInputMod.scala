package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.wixUiCore.anon.PickClearButtonPropschild
import typings.wixUiCore.anon.PickSigningPadPropsrequir
import typings.wixUiCore.anon.PickTitlePropschildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wixUiCoreSignatureInputMod {
  
  @JSImport("wix-ui-core/signature-input", "SignatureInput")
  @js.native
  class SignatureInput protected ()
    extends typings.wixUiCore.signatureInputMod.SignatureInput {
    def this(props: js.Object) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: js.Object, context: js.Any) = this()
  }
  /* static members */
  object SignatureInput {
    
    @JSImport("wix-ui-core/signature-input", "SignatureInput")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/signature-input", "SignatureInput.ClearButton")
    @js.native
    def ClearButton: FunctionComponent[PickClearButtonPropschild] = js.native
    inline def ClearButton_=(x: FunctionComponent[PickClearButtonPropschild]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearButton")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/signature-input", "SignatureInput.SigningPad")
    @js.native
    def SigningPad: FunctionComponent[PickSigningPadPropsrequir] = js.native
    inline def SigningPad_=(x: FunctionComponent[PickSigningPadPropsrequir]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SigningPad")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/signature-input", "SignatureInput.Title")
    @js.native
    def Title: FunctionComponent[PickTitlePropschildren] = js.native
    inline def Title_=(x: FunctionComponent[PickTitlePropschildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/signature-input", "SignatureInput.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
}
