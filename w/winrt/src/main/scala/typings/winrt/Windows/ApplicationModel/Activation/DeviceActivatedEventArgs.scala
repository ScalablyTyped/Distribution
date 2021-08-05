package typings.winrt.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceActivatedEventArgs
  extends StObject
     with IDeviceActivatedEventArgs
object DeviceActivatedEventArgs {
  
  inline def apply(
    deviceInformationId: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String
  ): DeviceActivatedEventArgs = {
    val __obj = js.Dynamic.literal(deviceInformationId = deviceInformationId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceActivatedEventArgs]
  }
}
