package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.Activation.CachedFileUpdaterActivatedEventArgs")
@js.native
class CachedFileUpdaterActivatedEventArgs () extends ICachedFileUpdaterActivatedEventArgs {
  /* CompleteClass */
  override var cachedFileUpdaterUI: winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileUpdaterUI = js.native
  /* CompleteClass */
  override var kind: ActivationKind = js.native
  /* CompleteClass */
  override var previousExecutionState: ApplicationExecutionState = js.native
  /* CompleteClass */
  override var splashScreen: SplashScreen = js.native
}

