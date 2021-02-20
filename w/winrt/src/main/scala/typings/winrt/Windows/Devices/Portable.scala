package typings.winrt.Windows.Devices

import typings.winrt.Windows.Storage.StorageFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Portable {
  
  @js.native
  sealed trait ServiceDeviceType extends StObject
  @JSGlobal("Windows.Devices.Portable.ServiceDeviceType")
  @js.native
  object ServiceDeviceType extends StObject {
    
    @js.native
    sealed trait calendarService extends ServiceDeviceType
    
    @js.native
    sealed trait contactsService extends ServiceDeviceType
    
    @js.native
    sealed trait deviceStatusService extends ServiceDeviceType
    
    @js.native
    sealed trait notesService extends ServiceDeviceType
    
    @js.native
    sealed trait ringtonesService extends ServiceDeviceType
    
    @js.native
    sealed trait smsService extends ServiceDeviceType
    
    @js.native
    sealed trait tasksService extends ServiceDeviceType
  }
  
  @js.native
  trait IServiceDeviceStatics extends StObject {
    
    def getDeviceSelector(serviceType: ServiceDeviceType): String = js.native
    
    def getDeviceSelectorFromServiceId(serviceId: String): String = js.native
  }
  object IServiceDeviceStatics {
    
    @scala.inline
    def apply(getDeviceSelector: ServiceDeviceType => String, getDeviceSelectorFromServiceId: String => String): IServiceDeviceStatics = {
      val __obj = js.Dynamic.literal(getDeviceSelector = js.Any.fromFunction1(getDeviceSelector), getDeviceSelectorFromServiceId = js.Any.fromFunction1(getDeviceSelectorFromServiceId))
      __obj.asInstanceOf[IServiceDeviceStatics]
    }
    
    @scala.inline
    implicit class IServiceDeviceStaticsMutableBuilder[Self <: IServiceDeviceStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetDeviceSelector(value: ServiceDeviceType => String): Self = StObject.set(x, "getDeviceSelector", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDeviceSelectorFromServiceId(value: String => String): Self = StObject.set(x, "getDeviceSelectorFromServiceId", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IStorageDeviceStatics extends StObject {
    
    def fromId(interfaceId: String): StorageFolder = js.native
    
    def getDeviceSelector(): String = js.native
  }
  object IStorageDeviceStatics {
    
    @scala.inline
    def apply(fromId: String => StorageFolder, getDeviceSelector: () => String): IStorageDeviceStatics = {
      val __obj = js.Dynamic.literal(fromId = js.Any.fromFunction1(fromId), getDeviceSelector = js.Any.fromFunction0(getDeviceSelector))
      __obj.asInstanceOf[IStorageDeviceStatics]
    }
    
    @scala.inline
    implicit class IStorageDeviceStaticsMutableBuilder[Self <: IStorageDeviceStatics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFromId(value: String => StorageFolder): Self = StObject.set(x, "fromId", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGetDeviceSelector(value: () => String): Self = StObject.set(x, "getDeviceSelector", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ServiceDevice extends StObject
  
  @js.native
  trait StorageDevice extends StObject
}
