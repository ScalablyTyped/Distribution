package typings.winrt.global.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrt.Windows.ApplicationModel.Contacts.Provider.ContactPickerUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.UI.WebUI.WebUIContactPickerActivatedEventArgs")
@js.native
class WebUIContactPickerActivatedEventArgs ()
  extends typings.winrt.Windows.UI.WebUI.WebUIContactPickerActivatedEventArgs {
  /* CompleteClass */
  override var activatedOperation: typings.winrt.Windows.UI.WebUI.ActivatedOperation = js.native
  /* CompleteClass */
  override var contactPickerUI: ContactPickerUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

