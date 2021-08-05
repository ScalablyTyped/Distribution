package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShareTargetActivatedEventArgs
  extends StObject
     with IActivatedEventArgs {
  
  var shareOperation: ShareOperation
}
object IShareTargetActivatedEventArgs {
  
  inline def apply(
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    shareOperation: ShareOperation,
    splashScreen: SplashScreen
  ): IShareTargetActivatedEventArgs = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], shareOperation = shareOperation.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShareTargetActivatedEventArgs]
  }
  
  extension [Self <: IShareTargetActivatedEventArgs](x: Self) {
    
    inline def setShareOperation(value: ShareOperation): Self = StObject.set(x, "shareOperation", value.asInstanceOf[js.Any])
  }
}
