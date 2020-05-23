package typings.winrtUwp.global.Windows.UI.WebUI

import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated from another app by using the DIAL protocol. */
@JSGlobal("Windows.UI.WebUI.WebUIDialReceiverActivatedEventArgs")
@js.native
abstract class WebUIDialReceiverActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIDialReceiverActivatedEventArgs {
  /** Gets the app activated operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the name of the app that invoked the dial receiver app. */
  /* CompleteClass */
  override var appName: String = js.native
  /** Gets the arguments that are passed to the app during its launch activation. */
  /* CompleteClass */
  override var arguments: String = js.native
  /** Gets the identifier for the currently shown app view. */
  /* CompleteClass */
  override var currentlyShownApplicationViewId: Double = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object, which provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /** Gets the identifier of the source tile that launched the app. */
  /* CompleteClass */
  override var tileId: String = js.native
}

