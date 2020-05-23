package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to call a contact. */
trait ContactCallActivatedEventArgs extends js.Object {
  /** Gets the contact for the call. */
  var contact: Contact
  /** Gets the activation type. */
  var kind: ActivationKind
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the identifier of the service used for the call. */
  var serviceId: String
  /** Gets the user identifier of the service used for the call. */
  var serviceUserId: String
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  /** Gets the action to be performed. */
  var verb: String
}

object ContactCallActivatedEventArgs {
  @scala.inline
  def apply(
    contact: Contact,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    serviceId: String,
    serviceUserId: String,
    splashScreen: SplashScreen,
    verb: String
  ): ContactCallActivatedEventArgs = {
    val __obj = js.Dynamic.literal(contact = contact.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], serviceUserId = serviceUserId.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactCallActivatedEventArgs]
  }
}

