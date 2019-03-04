package typings
package winrtLib.WindowsNs.ApplicationModelNs.ActivationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICachedFileUpdaterActivatedEventArgs extends IActivatedEventArgs {
  var cachedFileUpdaterUI: winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileUpdaterUI
}

object ICachedFileUpdaterActivatedEventArgs {
  @scala.inline
  def apply(
    cachedFileUpdaterUI: winrtLib.WindowsNs.StorageNs.ProviderNs.CachedFileUpdaterUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): ICachedFileUpdaterActivatedEventArgs = {
    val __obj = js.Dynamic.literal(cachedFileUpdaterUI = cachedFileUpdaterUI, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen)
  
    __obj.asInstanceOf[ICachedFileUpdaterActivatedEventArgs]
  }
}

