package typings.winrt.Windows.Devices

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Printers {
  
  object Extensions {
    
    @js.native
    trait IPrintExtensionContextStatic extends StObject {
      
      def fromDeviceId(deviceId: String): js.Any = js.native
    }
    object IPrintExtensionContextStatic {
      
      @scala.inline
      def apply(fromDeviceId: String => js.Any): IPrintExtensionContextStatic = {
        val __obj = js.Dynamic.literal(fromDeviceId = js.Any.fromFunction1(fromDeviceId))
        __obj.asInstanceOf[IPrintExtensionContextStatic]
      }
      
      @scala.inline
      implicit class IPrintExtensionContextStaticMutableBuilder[Self <: IPrintExtensionContextStatic] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setFromDeviceId(value: String => js.Any): Self = StObject.set(x, "fromDeviceId", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait IPrintNotificationEventDetails extends StObject {
      
      var eventData: String = js.native
      
      var printerName: String = js.native
    }
    object IPrintNotificationEventDetails {
      
      @scala.inline
      def apply(eventData: String, printerName: String): IPrintNotificationEventDetails = {
        val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPrintNotificationEventDetails]
      }
      
      @scala.inline
      implicit class IPrintNotificationEventDetailsMutableBuilder[Self <: IPrintNotificationEventDetails] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setEventData(value: String): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrinterName(value: String): Self = StObject.set(x, "printerName", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait IPrintTaskConfiguration extends StObject {
      
      var onsaverequested: js.Any = js.native
      
      var printerExtensionContext: js.Any = js.native
    }
    object IPrintTaskConfiguration {
      
      @scala.inline
      def apply(onsaverequested: js.Any, printerExtensionContext: js.Any): IPrintTaskConfiguration = {
        val __obj = js.Dynamic.literal(onsaverequested = onsaverequested.asInstanceOf[js.Any], printerExtensionContext = printerExtensionContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPrintTaskConfiguration]
      }
      
      @scala.inline
      implicit class IPrintTaskConfigurationMutableBuilder[Self <: IPrintTaskConfiguration] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setOnsaverequested(value: js.Any): Self = StObject.set(x, "onsaverequested", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPrinterExtensionContext(value: js.Any): Self = StObject.set(x, "printerExtensionContext", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait IPrintTaskConfigurationSaveRequest extends StObject {
      
      def cancel(): Unit = js.native
      
      var deadline: Date = js.native
      
      def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral = js.native
      
      def save(printerExtensionContext: js.Any): Unit = js.native
    }
    object IPrintTaskConfigurationSaveRequest {
      
      @scala.inline
      def apply(
        cancel: () => Unit,
        deadline: Date,
        getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
        save: js.Any => Unit
      ): IPrintTaskConfigurationSaveRequest = {
        val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
        __obj.asInstanceOf[IPrintTaskConfigurationSaveRequest]
      }
      
      @scala.inline
      implicit class IPrintTaskConfigurationSaveRequestMutableBuilder[Self <: IPrintTaskConfigurationSaveRequest] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
        
        @scala.inline
        def setDeadline(value: Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setGetDeferral(value: () => PrintTaskConfigurationSaveRequestedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
        
        @scala.inline
        def setSave(value: js.Any => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
      }
    }
    
    @js.native
    trait IPrintTaskConfigurationSaveRequestedDeferral extends StObject {
      
      def complete(): Unit = js.native
    }
    object IPrintTaskConfigurationSaveRequestedDeferral {
      
      @scala.inline
      def apply(complete: () => Unit): IPrintTaskConfigurationSaveRequestedDeferral = {
        val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
        __obj.asInstanceOf[IPrintTaskConfigurationSaveRequestedDeferral]
      }
      
      @scala.inline
      implicit class IPrintTaskConfigurationSaveRequestedDeferralMutableBuilder[Self <: IPrintTaskConfigurationSaveRequestedDeferral] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      }
    }
    
    @js.native
    trait IPrintTaskConfigurationSaveRequestedEventArgs extends StObject {
      
      var request: PrintTaskConfigurationSaveRequest = js.native
    }
    object IPrintTaskConfigurationSaveRequestedEventArgs {
      
      @scala.inline
      def apply(request: PrintTaskConfigurationSaveRequest): IPrintTaskConfigurationSaveRequestedEventArgs = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPrintTaskConfigurationSaveRequestedEventArgs]
      }
      
      @scala.inline
      implicit class IPrintTaskConfigurationSaveRequestedEventArgsMutableBuilder[Self <: IPrintTaskConfigurationSaveRequestedEventArgs] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setRequest(value: PrintTaskConfigurationSaveRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait PrintExtensionContext extends StObject
    
    @js.native
    trait PrintNotificationEventDetails extends IPrintNotificationEventDetails
    object PrintNotificationEventDetails {
      
      @scala.inline
      def apply(eventData: String, printerName: String): PrintNotificationEventDetails = {
        val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any])
        __obj.asInstanceOf[PrintNotificationEventDetails]
      }
    }
    
    @js.native
    trait PrintTaskConfiguration extends IPrintTaskConfiguration
    object PrintTaskConfiguration {
      
      @scala.inline
      def apply(onsaverequested: js.Any, printerExtensionContext: js.Any): PrintTaskConfiguration = {
        val __obj = js.Dynamic.literal(onsaverequested = onsaverequested.asInstanceOf[js.Any], printerExtensionContext = printerExtensionContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[PrintTaskConfiguration]
      }
    }
    
    @js.native
    trait PrintTaskConfigurationSaveRequest extends IPrintTaskConfigurationSaveRequest
    object PrintTaskConfigurationSaveRequest {
      
      @scala.inline
      def apply(
        cancel: () => Unit,
        deadline: Date,
        getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
        save: js.Any => Unit
      ): PrintTaskConfigurationSaveRequest = {
        val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
        __obj.asInstanceOf[PrintTaskConfigurationSaveRequest]
      }
    }
    
    @js.native
    trait PrintTaskConfigurationSaveRequestedDeferral extends IPrintTaskConfigurationSaveRequestedDeferral
    object PrintTaskConfigurationSaveRequestedDeferral {
      
      @scala.inline
      def apply(complete: () => Unit): PrintTaskConfigurationSaveRequestedDeferral = {
        val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
        __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedDeferral]
      }
    }
    
    @js.native
    trait PrintTaskConfigurationSaveRequestedEventArgs extends IPrintTaskConfigurationSaveRequestedEventArgs
    object PrintTaskConfigurationSaveRequestedEventArgs {
      
      @scala.inline
      def apply(request: PrintTaskConfigurationSaveRequest): PrintTaskConfigurationSaveRequestedEventArgs = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
        __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedEventArgs]
      }
    }
  }
}
