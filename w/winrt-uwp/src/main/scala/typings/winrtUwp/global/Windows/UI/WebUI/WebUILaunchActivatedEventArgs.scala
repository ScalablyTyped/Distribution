package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides event information when an app is launched. */
@JSGlobal("Windows.UI.WebUI.WebUILaunchActivatedEventArgs")
@js.native
abstract class WebUILaunchActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUILaunchActivatedEventArgs {
  /** Gets the app activated operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the arguments that are passed to the app during its launch activation. */
  /* CompleteClass */
  override var arguments: String = js.native
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  override var currentlyShownApplicationViewId: Double = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** (Applies to Windows only) Gets an indication about whether a pre-launch has been activated. */
  /* CompleteClass */
  override var prelaunchActivated: Boolean = js.native
  /** Gets the execution state of the app before this activation. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /** Gets the ID of the source that was invoked to launch the application. */
  /* CompleteClass */
  override var tileId: String = js.native
}

