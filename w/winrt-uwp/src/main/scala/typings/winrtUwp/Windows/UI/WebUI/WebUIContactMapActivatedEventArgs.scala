package typings.winrtUwp.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import typings.winrtUwp.Windows.ApplicationModel.Contacts.ContactAddress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to map a contact. */
@js.native
trait WebUIContactMapActivatedEventArgs extends js.Object {
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

object WebUIContactMapActivatedEventArgs {
  @scala.inline
  def apply(
    activatedOperation: ActivatedOperation,
    address: ContactAddress,
    contact: Contact,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String
  ): WebUIContactMapActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUIContactMapActivatedEventArgs]
  }
  @scala.inline
  implicit class WebUIContactMapActivatedEventArgsOps[Self <: WebUIContactMapActivatedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActivatedOperation(value: ActivatedOperation): Self = this.set("activatedOperation", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddress(value: ContactAddress): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def setContact(value: Contact): Self = this.set("contact", value.asInstanceOf[js.Any])
    @scala.inline
    def setKind(value: ActivationKind): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviousExecutionState(value: ApplicationExecutionState): Self = this.set("previousExecutionState", value.asInstanceOf[js.Any])
    @scala.inline
    def setSplashScreen(value: SplashScreen): Self = this.set("splashScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerb(value: String): Self = this.set("verb", value.asInstanceOf[js.Any])
  }
  
}

