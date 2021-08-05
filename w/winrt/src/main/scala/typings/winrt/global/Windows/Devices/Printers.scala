package typings.winrt.global.Windows.Devices

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Printers {
  
  object Extensions {
    
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintExtensionContext")
    @js.native
    class PrintExtensionContext ()
      extends StObject
         with typings.winrt.Windows.Devices.Printers.Extensions.PrintExtensionContext
    /* static members */
    object PrintExtensionContext {
      
      @JSGlobal("Windows.Devices.Printers.Extensions.PrintExtensionContext")
      @js.native
      val ^ : js.Any = js.native
      
      inline def fromDeviceId(deviceId: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDeviceId")(deviceId.asInstanceOf[js.Any]).asInstanceOf[js.Any]
    }
    
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintNotificationEventDetails")
    @js.native
    class PrintNotificationEventDetails ()
      extends StObject
         with typings.winrt.Windows.Devices.Printers.Extensions.PrintNotificationEventDetails {
      
      /* CompleteClass */
      var eventData: String = js.native
      
      /* CompleteClass */
      var printerName: String = js.native
    }
    
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfiguration")
    @js.native
    class PrintTaskConfiguration ()
      extends StObject
         with typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfiguration {
      
      /* CompleteClass */
      var onsaverequested: js.Any = js.native
      
      /* CompleteClass */
      var printerExtensionContext: js.Any = js.native
    }
    
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest")
    @js.native
    class PrintTaskConfigurationSaveRequest ()
      extends StObject
         with typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest {
      
      /* CompleteClass */
      override def cancel(): Unit = js.native
      
      /* CompleteClass */
      var deadline: Date = js.native
      
      /* CompleteClass */
      override def getDeferral(): typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral = js.native
      
      /* CompleteClass */
      override def save(printerExtensionContext: js.Any): Unit = js.native
    }
    
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral")
    @js.native
    class PrintTaskConfigurationSaveRequestedDeferral ()
      extends StObject
         with typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedDeferral {
      
      /* CompleteClass */
      override def complete(): Unit = js.native
    }
    
    @JSGlobal("Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedEventArgs")
    @js.native
    class PrintTaskConfigurationSaveRequestedEventArgs ()
      extends StObject
         with typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequestedEventArgs {
      
      /* CompleteClass */
      var request: typings.winrt.Windows.Devices.Printers.Extensions.PrintTaskConfigurationSaveRequest = js.native
    }
  }
}
