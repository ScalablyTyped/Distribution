package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to map a contact. */
@JSGlobal("Windows.UI.WebUI.WebUIContactMapActivatedEventArgs")
@js.native
abstract class WebUIContactMapActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIContactMapActivatedEventArgs {
  /** Gets the app activated operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the address of a contact for the mapping operation. */
  /* CompleteClass */
  override var address: ContactAddress = js.native
  /** Gets the contact for the mapping operation. */
  /* CompleteClass */
  override var contact: Contact = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /** Gets the action to be performed. */
  /* CompleteClass */
  override var verb: String = js.native
}

