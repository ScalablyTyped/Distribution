package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShareTargetActivatedEventArgs extends IActivatedEventArgs {
  
  var shareOperation: ShareOperation = js.native
}
object IShareTargetActivatedEventArgs {
  
  @scala.inline
  def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    shareOperation: ShareOperation,
    splashScreen: SplashScreen
  ): IShareTargetActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], shareOperation = shareOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShareTargetActivatedEventArgs]
  }
  
  @scala.inline
  implicit class IShareTargetActivatedEventArgsMutableBuilder[Self <: IShareTargetActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setShareOperation(value: ShareOperation): Self = StObject.set(x, "shareOperation", value.asInstanceOf[js.Any])
  }
}
