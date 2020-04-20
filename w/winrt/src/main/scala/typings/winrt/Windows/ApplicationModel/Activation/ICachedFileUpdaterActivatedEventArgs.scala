package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Storage.Provider.CachedFileUpdaterUI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICachedFileUpdaterActivatedEventArgs extends IActivatedEventArgs {
  var cachedFileUpdaterUI: CachedFileUpdaterUI
}

object ICachedFileUpdaterActivatedEventArgs {
  @scala.inline
  def apply(
    cachedFileUpdaterUI: CachedFileUpdaterUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): ICachedFileUpdaterActivatedEventArgs = {
    val __obj = js.Dynamic.literal(cachedFileUpdaterUI = cachedFileUpdaterUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICachedFileUpdaterActivatedEventArgs]
  }
}

