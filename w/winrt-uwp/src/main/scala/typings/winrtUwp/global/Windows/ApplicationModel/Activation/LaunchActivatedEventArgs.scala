package typings.winrtUwp.global.Windows.ApplicationModel.Activation

import typings.winrtUwp.Windows.UI.ViewManagement.ActivationViewSwitcher
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides event information when an app is launched. */
/* note: abstract class */ @JSGlobal("Windows.ApplicationModel.Activation.LaunchActivatedEventArgs")
@js.native
open class LaunchActivatedEventArgs ()
  extends StObject
     with typings.winrtUwp.Windows.ApplicationModel.Activation.LaunchActivatedEventArgs {
  
  /** Gets the arguments that are passed to the app during its launch activation. */
  /* CompleteClass */
  var arguments: String = js.native
  
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  var currentlyShownApplicationViewId: Double = js.native
  
  /** Gets the reason that this app is being activated. */
  /* CompleteClass */
  var kind: typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind = js.native
  
  /** Indicates whether the app was pre-launched. */
  /* CompleteClass */
  var prelaunchActivated: Boolean = js.native
  
  /** Gets the execution state of the app before this activation. */
  /* CompleteClass */
  var previousExecutionState: typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState = js.native
  
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  var splashScreen: typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen = js.native
  
  /** Gets the ID of the tile that was invoked to launch the app. */
  /* CompleteClass */
  var tileId: String = js.native
  
  /** Gets the view switcher object that allows you to set the view for the application. */
  /* CompleteClass */
  var viewSwitcher: ActivationViewSwitcher = js.native
}
