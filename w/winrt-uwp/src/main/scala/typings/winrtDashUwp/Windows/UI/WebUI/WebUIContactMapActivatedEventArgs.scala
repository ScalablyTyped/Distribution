package typings.winrtDashUwp.Windows.UI.WebUI

import typings.winrtDashUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtDashUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtDashUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.Contact
import typings.winrtDashUwp.Windows.ApplicationModel.Contacts.ContactAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to map a contact. */
@JSGlobal("Windows.UI.WebUI.WebUIContactMapActivatedEventArgs")
@js.native
abstract class WebUIContactMapActivatedEventArgs () extends js.Object {
  /** Gets the app activated operation. */
  var activatedOperation: ActivatedOperation = js.native
  /** Gets the address of a contact for the mapping operation. */
  var address: ContactAddress = js.native
  /** Gets the contact for the mapping operation. */
  var contact: Contact = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action to be performed. */
  var verb: String = js.native
}

