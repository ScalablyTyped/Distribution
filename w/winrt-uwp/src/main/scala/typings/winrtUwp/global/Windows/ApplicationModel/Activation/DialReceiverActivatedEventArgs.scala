package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides data when an app is activated from another app by using the DIAL protocol. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.DialReceiverActivatedEventArgs")
@js.native
open class DialReceiverActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.DialReceiverActivatedEventArgs {
  
  /** Gets the name of the app that invoked the dial receiver app. */
  /* CompleteClass */
  var appName: String = js.native
  
  /** Gets the arguments passed by the calling app. */
  /* CompleteClass */
  var arguments: String = js.native
  
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  var currentlyShownApplicationViewId: Double = js.native
  
  /** Gets the activation type. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the unique tile identifier for the calling app. */
  /* CompleteClass */
  var tileId: String = js.native
  
  /** Gets the view switcher object that allows you to set the view for the application. */
  /* CompleteClass */
  var viewSwitcher: ActivationViewSwitcher = js.native
}
