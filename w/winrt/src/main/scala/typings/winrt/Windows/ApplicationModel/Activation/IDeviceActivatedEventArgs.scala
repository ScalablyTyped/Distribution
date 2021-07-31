package typings.winrt.Windows.ApplicationModel.Activation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDeviceActivatedEventArgs
  extends StObject
     with IActivatedEventArgs {
  
  var deviceInformationId: String
  
  var verb: String
}
object IDeviceActivatedEventArgs {
  
  @scala.inline
  def apply(
    deviceInformationId: String,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen,
    verb: String
  ): IDeviceActivatedEventArgs = {
    val __obj = js.Dynamic.literal(deviceInformationId = deviceInformationId.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any], verb = verb.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDeviceActivatedEventArgs]
  }
  
  @scala.inline
  implicit class IDeviceActivatedEventArgsMutableBuilder[Self <: IDeviceActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceInformationId(value: String): Self = StObject.set(x, "deviceInformationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerb(value: String): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
  }
}
