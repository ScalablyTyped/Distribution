package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to map a contact. */
@JSGlobal("Windows.ApplicationModel.Activation.ContactMapActivatedEventArgs")
@js.native
abstract class ContactMapActivatedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.Activation.ContactMapActivatedEventArgs {
  /** Gets the address of a contact for the mapping operation. */
  /* CompleteClass */
  override var address: ContactAddress = js.native
  /** Gets the contact for the mapping operation. */
  /* CompleteClass */
  override var contact: Contact = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  /** Gets the action to be performed. */
  /* CompleteClass */
  override var verb: String = js.native
}

