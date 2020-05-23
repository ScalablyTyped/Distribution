package typings.winrtUwp.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to map a contact. */
trait ContactMapActivatedEventArgs extends js.Object {
  /** Gets the address of a contact for the mapping operation. */
  var address: ContactAddress
  /** Gets the contact for the mapping operation. */
  var contact: Contact
  /** Gets the activation type. */
  var kind: ActivationKind
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
  /** Gets the action to be performed. */
  var verb: String
}

object ContactMapActivatedEventArgs {
  @scala.inline
  def apply(
    address: ContactAddress,
    contact: Contact,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String
  ): ContactMapActivatedEventArgs = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactMapActivatedEventArgs]
  }
}

