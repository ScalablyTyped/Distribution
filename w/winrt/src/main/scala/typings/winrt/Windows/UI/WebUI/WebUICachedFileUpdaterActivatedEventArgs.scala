package typings.winrt.Windows.UI.WebUI

import typings.winrt.Windows.ApplicationModel.Activation.ActivationKind
import typings.winrt.Windows.ApplicationModel.Activation.ApplicationExecutionState
import typings.winrt.Windows.ApplicationModel.Activation.ICachedFileUpdaterActivatedEventArgs
import typings.winrt.Windows.ApplicationModel.Activation.SplashScreen
import typings.winrt.Windows.Storage.Provider.CachedFileUpdaterUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebUICachedFileUpdaterActivatedEventArgs
  extends StObject
     with ICachedFileUpdaterActivatedEventArgs
     with IActivatedEventArgsDeferral
object WebUICachedFileUpdaterActivatedEventArgs {
  
  inline def apply(
    activatedOperation: ActivatedOperation,
    cachedFileUpdaterUI: CachedFileUpdaterUI,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): WebUICachedFileUpdaterActivatedEventArgs = {
    val __obj = js.Dynamic.literal(activatedOperation = activatedOperation.asInstanceOf[js.Any], cachedFileUpdaterUI = cachedFileUpdaterUI.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebUICachedFileUpdaterActivatedEventArgs]
  }
}
