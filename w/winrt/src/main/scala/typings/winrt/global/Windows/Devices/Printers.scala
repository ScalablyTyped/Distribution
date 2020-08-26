package typings.winrt.global.Windows.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Devices.Printers")
@js.native
object Printers extends js.Object {
  @js.native
  object Extensions extends js.Object {
    @js.native
    class PrintExtensionContext ()
      extends typings.winrt.Windows.Devices.Printers.Extensions.PrintExtensionContext
    
    @js.native
    class PrintNotificationEventDetails ()
      extends typings.winrt.Windows.Devices.Printers.Extensions.PrintNotificationEventDetails
    
    @js.native
    class PrintTaskConfiguration ()
      extends typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfiguration
    
    @js.native
    class PrintTaskConfigurationSaveRequest ()
      extends typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest
    
    @js.native
    class PrintTaskConfigurationSaveRequestedDeferral ()
      extends typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral
    
    @js.native
    class PrintTaskConfigurationSaveRequestedEventArgs ()
      extends typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedEventArgs
    
    /* static members */
    @js.native
    object PrintExtensionContext extends js.Object {
      def fromDeviceId(deviceId: String): js.Any = js.native
    }
    
  }
  
}

