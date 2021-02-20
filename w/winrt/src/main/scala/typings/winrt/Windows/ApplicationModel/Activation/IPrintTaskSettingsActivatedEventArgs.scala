package typings.winrt.Windows.ApplicationModel.Activation

import typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPrintTaskSettingsActivatedEventArgs extends IActivatedEventArgs {
  
  var configuration: PrintTaskConfiguration = js.native
}
object IPrintTaskSettingsActivatedEventArgs {
  
  @scala.inline
  def apply(
    configuration: PrintTaskConfiguration,
    kind: ActivationKind,
    previousExecutionState: ApplicationExecutionState,
    splashScreen: SplashScreen
  ): IPrintTaskSettingsActivatedEventArgs = {
    val __obj = js.Dynamic.literal(configuration = configuration.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], previousExecutionState = previousExecutionState.asInstanceOf[js.Any], splashScreen = splashScreen.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPrintTaskSettingsActivatedEventArgs]
  }
  
  @scala.inline
  implicit class IPrintTaskSettingsActivatedEventArgsMutableBuilder[Self <: IPrintTaskSettingsActivatedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfiguration(value: PrintTaskConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
  }
}
