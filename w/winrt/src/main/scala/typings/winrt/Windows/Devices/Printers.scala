package typings.winrt.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Printers {
  
  object Extensions {
    
    trait IPrintExtensionContextStatic extends StObject {
      
      def fromDeviceId(deviceId: String): Any
    }
    object IPrintExtensionContextStatic {
      
      inline def apply(fromDeviceId: String => Any): IPrintExtensionContextStatic = {
        val __obj = js.Dynamic.literal(fromDeviceId = js.Any.fromFunction1(fromDeviceId))
        __obj.asInstanceOf[IPrintExtensionContextStatic]
      }
      
      extension [Self <: IPrintExtensionContextStatic](x: Self) {
        
        inline def setFromDeviceId(value: String => Any): Self = StObject.set(x, "fromDeviceId", js.Any.fromFunction1(value))
      }
    }
    
    trait IPrintNotificationEventDetails extends StObject {
      
      var eventData: String
      
      var printerName: String
    }
    object IPrintNotificationEventDetails {
      
      inline def apply(eventData: String, printerName: String): IPrintNotificationEventDetails = {
        val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPrintNotificationEventDetails]
      }
      
      extension [Self <: IPrintNotificationEventDetails](x: Self) {
        
        inline def setEventData(value: String): Self = StObject.set(x, "eventData", value.asInstanceOf[js.Any])
        
        inline def setPrinterName(value: String): Self = StObject.set(x, "printerName", value.asInstanceOf[js.Any])
      }
    }
    
    trait IPrintTaskConfiguration extends StObject {
      
      var onsaverequested: Any
      
      var printerExtensionContext: Any
    }
    object IPrintTaskConfiguration {
      
      inline def apply(onsaverequested: Any, printerExtensionContext: Any): IPrintTaskConfiguration = {
        val __obj = js.Dynamic.literal(onsaverequested = onsaverequested.asInstanceOf[js.Any], printerExtensionContext = printerExtensionContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPrintTaskConfiguration]
      }
      
      extension [Self <: IPrintTaskConfiguration](x: Self) {
        
        inline def setOnsaverequested(value: Any): Self = StObject.set(x, "onsaverequested", value.asInstanceOf[js.Any])
        
        inline def setPrinterExtensionContext(value: Any): Self = StObject.set(x, "printerExtensionContext", value.asInstanceOf[js.Any])
      }
    }
    
    trait IPrintTaskConfigurationSaveRequest extends StObject {
      
      def cancel(): Unit
      
      var deadline: js.Date
      
      def getDeferral(): PrintTaskConfigurationSaveRequestedDeferral
      
      def save(printerExtensionContext: Any): Unit
    }
    object IPrintTaskConfigurationSaveRequest {
      
      inline def apply(
        cancel: () => Unit,
        deadline: js.Date,
        getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
        save: Any => Unit
      ): IPrintTaskConfigurationSaveRequest = {
        val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
        __obj.asInstanceOf[IPrintTaskConfigurationSaveRequest]
      }
      
      extension [Self <: IPrintTaskConfigurationSaveRequest](x: Self) {
        
        inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
        
        inline def setDeadline(value: js.Date): Self = StObject.set(x, "deadline", value.asInstanceOf[js.Any])
        
        inline def setGetDeferral(value: () => PrintTaskConfigurationSaveRequestedDeferral): Self = StObject.set(x, "getDeferral", js.Any.fromFunction0(value))
        
        inline def setSave(value: Any => Unit): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
      }
    }
    
    trait IPrintTaskConfigurationSaveRequestedDeferral extends StObject {
      
      def complete(): Unit
    }
    object IPrintTaskConfigurationSaveRequestedDeferral {
      
      inline def apply(complete: () => Unit): IPrintTaskConfigurationSaveRequestedDeferral = {
        val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
        __obj.asInstanceOf[IPrintTaskConfigurationSaveRequestedDeferral]
      }
      
      extension [Self <: IPrintTaskConfigurationSaveRequestedDeferral](x: Self) {
        
        inline def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
      }
    }
    
    trait IPrintTaskConfigurationSaveRequestedEventArgs extends StObject {
      
      var request: PrintTaskConfigurationSaveRequest
    }
    object IPrintTaskConfigurationSaveRequestedEventArgs {
      
      inline def apply(request: PrintTaskConfigurationSaveRequest): IPrintTaskConfigurationSaveRequestedEventArgs = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
        __obj.asInstanceOf[IPrintTaskConfigurationSaveRequestedEventArgs]
      }
      
      extension [Self <: IPrintTaskConfigurationSaveRequestedEventArgs](x: Self) {
        
        inline def setRequest(value: PrintTaskConfigurationSaveRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      }
    }
    
    trait PrintExtensionContext extends StObject
    
    trait PrintNotificationEventDetails
      extends StObject
         with IPrintNotificationEventDetails
    object PrintNotificationEventDetails {
      
      inline def apply(eventData: String, printerName: String): PrintNotificationEventDetails = {
        val __obj = js.Dynamic.literal(eventData = eventData.asInstanceOf[js.Any], printerName = printerName.asInstanceOf[js.Any])
        __obj.asInstanceOf[PrintNotificationEventDetails]
      }
    }
    
    trait PrintTaskConfiguration
      extends StObject
         with IPrintTaskConfiguration
    object PrintTaskConfiguration {
      
      inline def apply(onsaverequested: Any, printerExtensionContext: Any): PrintTaskConfiguration = {
        val __obj = js.Dynamic.literal(onsaverequested = onsaverequested.asInstanceOf[js.Any], printerExtensionContext = printerExtensionContext.asInstanceOf[js.Any])
        __obj.asInstanceOf[PrintTaskConfiguration]
      }
    }
    
    trait PrintTaskConfigurationSaveRequest
      extends StObject
         with IPrintTaskConfigurationSaveRequest
    object PrintTaskConfigurationSaveRequest {
      
      inline def apply(
        cancel: () => Unit,
        deadline: js.Date,
        getDeferral: () => PrintTaskConfigurationSaveRequestedDeferral,
        save: Any => Unit
      ): PrintTaskConfigurationSaveRequest = {
        val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel), deadline = deadline.asInstanceOf[js.Any], getDeferral = js.Any.fromFunction0(getDeferral), save = js.Any.fromFunction1(save))
        __obj.asInstanceOf[PrintTaskConfigurationSaveRequest]
      }
    }
    
    trait PrintTaskConfigurationSaveRequestedDeferral
      extends StObject
         with IPrintTaskConfigurationSaveRequestedDeferral
    object PrintTaskConfigurationSaveRequestedDeferral {
      
      inline def apply(complete: () => Unit): PrintTaskConfigurationSaveRequestedDeferral = {
        val __obj = js.Dynamic.literal(complete = js.Any.fromFunction0(complete))
        __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedDeferral]
      }
    }
    
    trait PrintTaskConfigurationSaveRequestedEventArgs
      extends StObject
         with IPrintTaskConfigurationSaveRequestedEventArgs
    object PrintTaskConfigurationSaveRequestedEventArgs {
      
      inline def apply(request: PrintTaskConfigurationSaveRequest): PrintTaskConfigurationSaveRequestedEventArgs = {
        val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
        __obj.asInstanceOf[PrintTaskConfigurationSaveRequestedEventArgs]
      }
    }
  }
}
