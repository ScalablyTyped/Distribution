package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ActivationNs

import typings.winrtDashUwp.WindowsNs.ApplicationModelNs.ContactsNs.Contact
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to post a contact. */
@JSGlobal("Windows.ApplicationModel.Activation.ContactPostActivatedEventArgs")
@js.native
abstract class ContactPostActivatedEventArgs () extends js.Object {
  /** Gets the contact for the post. */
  var contact: Contact = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the identifier of the service used for the post. */
  var serviceId: String = js.native
  /** Gets the user identifier of the service used for the post. */
  var serviceUserId: String = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action to be performed. */
  var verb: String = js.native
}

