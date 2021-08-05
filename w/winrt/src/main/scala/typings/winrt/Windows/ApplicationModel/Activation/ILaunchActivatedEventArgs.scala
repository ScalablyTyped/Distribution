package typings.winrt.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ILaunchActivatedEventArgs
  extends StObject
     with IActivatedEventArgs {
  
  var arguments: String
  
  var tileId: String
}
object ILaunchActivatedEventArgs {
  
  inline def apply(
    arguments: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    tileId: String
  ): ILaunchActivatedEventArgs = {
    val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], tileId = tileId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILaunchActivatedEventArgs]
  }
  
  extension [Self <: ILaunchActivatedEventArgs](x: Self) {
    
    inline def setArguments(value: String): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
    
    inline def setTileId(value: String): Self = StObject.set(x, "tileId", value.asInstanceOf[js.Any])
  }
}
