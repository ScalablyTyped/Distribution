package typings.winrt.global.Windows.Devices

import typings.std.Date
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
      extends typings.winrt.Windows.Devices.Printers.Extensions.PrintNotificationEventDetails {
      /* CompleteClass */
      override var eventData: String = js.native
      /* CompleteClass */
      override var printerName: String = js.native
    }
    
    @js.native
    class PrintTaskConfiguration ()
      extends typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfiguration {
      /* CompleteClass */
      override var onsaverequested: js.Any = js.native
      /* CompleteClass */
      override var printerExtensionContext: js.Any = js.native
    }
    
    @js.native
    class PrintTaskConfigurationSaveRequest ()
      extends typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest {
      /* CompleteClass */
      override var deadline: Date = js.native
      /* CompleteClass */
      override def cancel(): Unit = js.native
      /* CompleteClass */
      override def getDeferral(): typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral = js.native
      /* CompleteClass */
      override def save(printerExtensionContext: js.Any): Unit = js.native
    }
    
    @js.native
    class PrintTaskConfigurationSaveRequestedDeferral ()
      extends typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral {
      /* CompleteClass */
      override def complete(): Unit = js.native
    }
    
    @js.native
    class PrintTaskConfigurationSaveRequestedEventArgs ()
      extends typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedEventArgs {
      /* CompleteClass */
      override var request: typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest = js.native
    }
    
    /* static members */
    @js.native
    object PrintExtensionContext extends js.Object {
      def fromDeviceId(deviceId: String): js.Any = js.native
    }
    
  }
  
}

