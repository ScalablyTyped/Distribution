package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to video call a contact. */
/* note: abstract class */ @JSGlobal("Windows.UI.WebUI.WebUIContactVideoCallActivatedEventArgs")
@js.native
open class WebUIContactVideoCallActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.UI.WebUI.WebUIContactVideoCallActivatedEventArgs {
  
  /** Gets the app activated operation. */
  /* CompleteClass */
  var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  
  /** Gets the contact for the video call. */
  /* CompleteClass */
  var contact: Contact = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: ApplicationExecutionState = js.native
  
  /** Gets the identifier of the service used for the video call. */
  /* CompleteClass */
  var serviceId: String = js.native
  
  /** Gets the user identifier of the service used for the video call. */
  /* CompleteClass */
  var serviceUserId: String = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: SplashScreen = js.native
  
  /** Gets the action to be performed. */
  /* CompleteClass */
  var verb: String = js.native
}
