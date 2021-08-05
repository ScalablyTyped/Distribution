package typings.winrt.Windows.Devices

import typings.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portable {
  
  @js.native
  sealed trait ServiceDeviceType extends StObject
  @JSGlobal("Windows.Devices.Portable.ServiceDeviceType")
  @js.native
  object ServiceDeviceType extends StObject {
    
    @js.native
    sealed trait calendarService
      extends StObject
         with ServiceDeviceType
    
    @js.native
    sealed trait contactsService
      extends StObject
         with ServiceDeviceType
    
    @js.native
    sealed trait deviceStatusService
      extends StObject
         with ServiceDeviceType
    
    @js.native
    sealed trait notesService
      extends StObject
         with ServiceDeviceType
    
    @js.native
    sealed trait ringtonesService
      extends StObject
         with ServiceDeviceType
    
    @js.native
    sealed trait smsService
      extends StObject
         with ServiceDeviceType
    
    @js.native
    sealed trait tasksService
      extends StObject
         with ServiceDeviceType
  }
  
  trait IServiceDeviceStatics extends StObject {
    
    def getDeviceSelector(serviceType: ServiceDeviceType): String
    
    def getDeviceSelectorFromServiceId(serviceId: String): String
  }
  object IServiceDeviceStatics {
    
    inline def apply(getDeviceSelector: ServiceDeviceType => String, getDeviceSelectorFromServiceId: String => String): IServiceDeviceStatics = {
      val __obj = js.Dynamic.literal(getDeviceSelector = js.Any.fromFunction1(getDeviceSelector), getDeviceSelectorFromServiceId = js.Any.fromFunction1(getDeviceSelectorFromServiceId))
      __obj.asInstanceOf[IServiceDeviceStatics]
    }
    
    extension [Self <: IServiceDeviceStatics](x: Self) {
      
      inline def setGetDeviceSelector(value: ServiceDeviceType => String): Self = StObject.set(x, "getDeviceSelector", js.Any.fromFunction1(value))
      
      inline def setGetDeviceSelectorFromServiceId(value: String => String): Self = StObject.set(x, "getDeviceSelectorFromServiceId", js.Any.fromFunction1(value))
    }
  }
  
  trait IStorageDeviceStatics extends StObject {
    
    def fromId(interfaceId: String): StorageFolder
    
    def getDeviceSelector(): String
  }
  object IStorageDeviceStatics {
    
    inline def apply(fromId: String => StorageFolder, getDeviceSelector: () => String): IStorageDeviceStatics = {
      val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
      __obj.asInstanceOf[IStorageDeviceStatics]
    }
    
    extension [Self <: IStorageDeviceStatics](x: Self) {
      
      inline def setFromId(value: String => StorageFolder): Self = StObject.set(x, "fromId", js.Any.fromFunction1(value))
      
      inline def setGetDeviceSelector(value: () => String): Self = StObject.set(x, "getDeviceSelector", js.Any.fromFunction0(value))
    }
  }
  
  trait ServiceDevice extends StObject
  
  trait StorageDevice extends StObject
}
