package typings.wixUiCore.wixUiCoreSrcMod

import typings.react.mod.FunctionComponent
import typings.wixUiCore.anon.PickClearButtonPropschild0
import typings.wixUiCore.anon.PickSigningPadPropsaccess
import typings.wixUiCore.anon.PickTitlePropschildren0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/src", "SignatureInput")
@js.native
class SignatureInput protected ()
  extends typings.wixUiCore.srcComponentsSignatureInputMod.SignatureInput {
  def this(props: js.Object) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: js.Object, context: js.Any) = this()
}
/* static members */
object SignatureInput {
  
  @JSImport("wix-ui-core/src", "SignatureInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/src", "SignatureInput.ClearButton")
  @js.native
  def ClearButton: FunctionComponent[PickClearButtonPropschild0] = js.native
  @scala.inline
  def ClearButton_=(x: FunctionComponent[PickClearButtonPropschild0]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearButton")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/src", "SignatureInput.SigningPad")
  @js.native
  def SigningPad: FunctionComponent[PickSigningPadPropsaccess] = js.native
  @scala.inline
  def SigningPad_=(x: FunctionComponent[PickSigningPadPropsaccess]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SigningPad")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/src", "SignatureInput.Title")
  @js.native
  def Title: FunctionComponent[PickTitlePropschildren0] = js.native
  @scala.inline
  def Title_=(x: FunctionComponent[PickTitlePropschildren0]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/src", "SignatureInput.displayName")
  @js.native
  def displayName: String = js.native
  @scala.inline
  def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
