package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to map a contact. */
@JSGlobal("Windows.ApplicationModel.Activation.ContactMapActivatedEventArgs")
@js.native
abstract class ContactMapActivatedEventArgs () extends js.Object {
  /** Gets the address of a contact for the mapping operation. */
  var address: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.ContactAddress = js.native
  /** Gets the contact for the mapping operation. */
  var contact: winrtDashUwpLib.WindowsNs.ApplicationModelNs.ContactsNs.Contact = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
  /** Gets the action to be performed. */
  var verb: java.lang.String = js.native
}

