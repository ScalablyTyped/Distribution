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
    val __obj = js.Dynamic.literal(cachedFileUpdaterUI = cachedFileUpdaterUI, kind = kind, previousExecutionState = previousExecutionState, splashScreen = splashScreen)
  
    __obj.asInstanceOf[ICachedFileUpdaterActivatedEventArgs]
  }
}

