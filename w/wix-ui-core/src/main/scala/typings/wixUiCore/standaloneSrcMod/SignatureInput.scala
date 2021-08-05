package typings.wixUiCore.standaloneSrcMod

import typings.react.mod.FunctionComponent
import typings.wixUiCore.anon.PickClearButtonPropschildChildren
import typings.wixUiCore.anon.PickSigningPadPropsrequirAbout
import typings.wixUiCore.anon.PickTitlePropschildrenChildren
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wix-ui-core/dist/standalone/src", "SignatureInput")
@js.native
class SignatureInput protected ()
  extends typings.wixUiCore.componentsSignatureInputMod.SignatureInput {
  def this(props: js.Object) = this()
  /**
    * @deprecated
    * @see https://reactjs.org/docs/legacy-context.html
    */
  def this(props: js.Object, context: js.Any) = this()
}
/* static members */
object SignatureInput {
  
  @JSImport("wix-ui-core/dist/standalone/src", "SignatureInput")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wix-ui-core/dist/standalone/src", "SignatureInput.ClearButton")
  @js.native
  def ClearButton: FunctionComponent[PickClearButtonPropschildChildren] = js.native
  inline def ClearButton_=(x: FunctionComponent[PickClearButtonPropschildChildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ClearButton")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/standalone/src", "SignatureInput.SigningPad")
  @js.native
  def SigningPad: FunctionComponent[PickSigningPadPropsrequirAbout] = js.native
  inline def SigningPad_=(x: FunctionComponent[PickSigningPadPropsrequirAbout]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SigningPad")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/standalone/src", "SignatureInput.Title")
  @js.native
  def Title: FunctionComponent[PickTitlePropschildrenChildren] = js.native
  inline def Title_=(x: FunctionComponent[PickTitlePropschildrenChildren]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Title")(x.asInstanceOf[js.Any])
  
  @JSImport("wix-ui-core/dist/standalone/src", "SignatureInput.displayName")
  @js.native
  def displayName: String = js.native
  inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
}
