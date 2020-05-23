package typings.winrtUwp.global.Windows.UI.WebUI

import typings.std.Date
import typings.winrtUwp.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrtUwp.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrtUwp.Windows.ApplicationModel.Activation.SplashScreen
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data when an app is activated to show a specified time frame on the user’s calendar. */
@JSGlobal("Windows.UI.WebUI.WebUIAppointmentsProviderShowTimeFrameActivatedEventArgs")
@js.native
abstract class WebUIAppointmentsProviderShowTimeFrameActivatedEventArgs ()
  extends typings.winrtUwp.Windows.UI.WebUI.WebUIAppointmentsProviderShowTimeFrameActivatedEventArgs {
  /** Gets the app activated operation. */
  /* CompleteClass */
  override var activatedOperation: typings.winrtUwp.Windows.UI.WebUI.ActivatedOperation = js.native
  /** Gets the duration of the time frame to be shown. */
  /* CompleteClass */
  override var duration: Double = js.native
  /** Gets the activation type. */
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
  /** Gets the starting date and time of the time frame to be shown. */
  /* CompleteClass */
  override var timeToShow: Date = js.native
  /** Gets the action to be performed by the appointments provider. */
  /* CompleteClass */
  override var verb: String = js.native
}

