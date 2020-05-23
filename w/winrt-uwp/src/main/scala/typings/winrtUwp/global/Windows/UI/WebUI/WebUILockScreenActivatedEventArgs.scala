package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents arguments used when the lock screen is activated. */
@JSGlobal("Windows.UI.WebUI.WebUILockScreenActivatedEventArgs")
@js.native
abstract class WebUILockScreenActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUILockScreenActivatedEventArgs {
  /** Gets the object that manages an app activation operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  override var currentlyShownApplicationViewId: Double = js.native
  /** Gets information about the app activation operation. */
  /* CompleteClass */
  override var info: js.Any = js.native
  /** Gets and activation kind for the app activation operation. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the previous execution state. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

