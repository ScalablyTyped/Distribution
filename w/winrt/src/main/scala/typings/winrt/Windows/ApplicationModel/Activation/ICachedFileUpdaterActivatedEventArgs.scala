package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Storage.Provider.CachedFileUpdaterUI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICachedFileUpdaterActivatedEventArgs extends IActivatedEventArgs {
  
  var cachedFileUpdaterUI: CachedFileUpdaterUI = js.native
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
  
  @scala.inline
  implicit class ICachedFileUpdaterActivatedEventArgsMutableBuilder[Self <: ICachedFileUpdaterActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCachedFileUpdaterUI(value: CachedFileUpdaterUI): Self = StObject.set(x, "cachedFileUpdaterUI", value.asInstanceOf[js.Any])
  }
}
