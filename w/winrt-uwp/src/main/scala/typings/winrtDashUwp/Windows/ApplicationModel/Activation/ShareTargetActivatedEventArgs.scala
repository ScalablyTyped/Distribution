package typings.winrtDashUwp.Windows.ApplicationModel.Activation

import typings.winrtDashUwp.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information for an application that is a target for share operations. */
@JSGlobal("Windows.ApplicationModel.Activation.ShareTargetActivatedEventArgs")
@js.native
abstract class ShareTargetActivatedEventArgs () extends js.Object {
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets information about data included in a share operation. */
  var shareOperation: ShareOperation = js.native
  /** Gets the splash screen object which provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

