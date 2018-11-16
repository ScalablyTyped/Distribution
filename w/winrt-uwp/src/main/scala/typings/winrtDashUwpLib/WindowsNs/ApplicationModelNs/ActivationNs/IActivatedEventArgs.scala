package typings
package winrtDashUwpLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides common properties for all activation types. */

trait IActivatedEventArgs extends js.Object {
  /** Gets the reason that this app is being activated. */
  var kind: ActivationKind
  /** Gets the execution state of the app before this activation. */
  var previousExecutionState: ApplicationExecutionState
  /** Gets the splash screen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen
}

