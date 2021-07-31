package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.ApplicationModel.Contacts.Contact
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated to video call a contact. */
@JSGlobal("Windows.ApplicationModel.Activation.ContactVideoCallActivatedEventArgs")
@js.native
abstract class ContactVideoCallActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.ContactVideoCallActivatedEventArgs {
  
  /** Gets the contact for the video call. */
  /* CompleteClass */
  var contact: Contact = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the identifier of the service used for the video call. */
  /* CompleteClass */
  var serviceId: String = js.native
  
  /** Gets the user identifier of the service used for the video call. */
  /* CompleteClass */
  var serviceUserId: String = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the action to be performed. */
  /* CompleteClass */
  var verb: String = js.native
}
