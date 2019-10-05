package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Storage.Provider.CachedFileUpdaterUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs")
@js.native
class CachedFileUpdaterActivatedEventArgs () extends ICachedFileUpdaterActivatedEventArgs {
  /* CompleteClass */
  override var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

