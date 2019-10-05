package typings.winrtDashUwp.Windows.ApplicationModel.Activation

import typings.winrtDashUwp.Windows.Storage.Provider.CachedFileUpdaterUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the activated event that fires when the user saves or opens a file that needs updates from the app. */
@JSGlobal("Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs")
@js.native
abstract class CachedFileUpdaterActivatedEventArgs () extends js.Object {
  /** Gets the letterbox UI of the file picker that is displayed when a file needs updates from the app. */
  var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
  /** Gets the activation type. */
  var kind: ActivationKind = js.native
  /** Gets the execution state of the app before it was activated. */
  var previousExecutionState: ApplicationExecutionState = js.native
  /** Gets a SplashScreen object that provides information about the transition from the splash screen to the activated app. */
  var splashScreen: SplashScreen = js.native
}

