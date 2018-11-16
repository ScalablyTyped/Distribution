package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to send a message to a contact. */
@JSGlobal("Windows.ApplicationModel.Activation.ContactMessageActivatedEventArgs")
@js.native
abstract class ContactMessageActivatedEventArgs () extends js.Object {
  /** Gets the contact for the message. */
  var contact: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.Contact = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the identifier of the service used for the message. */
  var serviceId: java.lang.String = js.native
  /** Gets the user identifier of the service used for the message. */
  var serviceUserId: java.lang.String = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action to be performed. */
  var verb: java.lang.String = js.native
}

