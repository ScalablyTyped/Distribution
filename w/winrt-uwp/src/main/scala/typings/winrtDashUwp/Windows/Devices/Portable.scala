package typings.winrtDashUwp.Windows.Devices

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Devices.Portable.ServiceDeviceType
import typings.winrtDashUwp.Windows.Devices.Portable.ServiceDeviceType.calendarService
import typings.winrtDashUwp.Windows.Devices.Portable.ServiceDeviceType.contactsService
import typings.winrtDashUwp.Windows.Devices.Portable.ServiceDeviceType.deviceStatusService
import typings.winrtDashUwp.Windows.Devices.Portable.ServiceDeviceType.notesService
import typings.winrtDashUwp.Windows.Devices.Portable.ServiceDeviceType.ringtonesService
import typings.winrtDashUwp.Windows.Devices.Portable.ServiceDeviceType.smsService
import typings.winrtDashUwp.Windows.Devices.Portable.ServiceDeviceType.tasksService
import typings.winrtDashUwp.Windows.Storage.StorageFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Windows Portable Devices (WPD) enables computers to communicate with attached media and storage devices. This namespace provides methods for identifying Windows Portable Device (WPD) services and storage. */
@JSGlobal("Windows.Devices.Portable")
@js.native
object Portable extends js.Object {
  /** Provides methods for identifying a device service for a portable device that supports WPD (Windows Portable Devices) for device enumeration. */
  @js.native
  abstract class ServiceDevice () extends js.Object
  
  @js.native
  sealed trait ServiceDeviceType extends js.Object
  
  /** Provides methods for accessing the storage functionality of a portable device that supports WPD. */
  @js.native
  abstract class StorageDevice () extends js.Object
  
  /* static members */
  @js.native
  object ServiceDevice extends js.Object {
    /**
      * Returns an Advanced Query Syntax (AQS) string that is used to enumerate device services of the specified ServiceDeviceType . This string is passed to the FindAllAsync or CreateWatcher method.
      * @param serviceType The type of service to identify.
      * @return The AQS string.
      */
    def getDeviceSelector(serviceType: ServiceDeviceType): String = js.native
    /**
      * An Advanced Query Syntax (AQS) string for identifying a device service by its GUIDs. This string is passed to the FindAllAsync or CreateWatcher method.
      * @param serviceId The service identifier.
      * @return The AQS string.
      */
    def getDeviceSelectorFromServiceId(serviceId: String): String = js.native
  }
  
  /** Indicates the type of a portable device service. */
  @js.native
  object ServiceDeviceType extends js.Object {
    /** A service that provides calendar information. */
    @js.native
    sealed trait calendarService extends ServiceDeviceType
    
    /** A service that tracks contacts. */
    @js.native
    sealed trait contactsService extends ServiceDeviceType
    
    /** A device status service. */
    @js.native
    sealed trait deviceStatusService extends ServiceDeviceType
    
    /** A note-taking service. */
    @js.native
    sealed trait notesService extends ServiceDeviceType
    
    /** A service that provides ringtones for a phone. */
    @js.native
    sealed trait ringtonesService extends ServiceDeviceType
    
    /** An SMS messaging service. */
    @js.native
    sealed trait smsService extends ServiceDeviceType
    
    /** A service for tracking tasks. */
    @js.native
    sealed trait tasksService extends ServiceDeviceType
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ServiceDeviceType with Double] = js.native
    /* 0 */ @js.native
    object calendarService extends TopLevel[calendarService with Double]
    
    /* 1 */ @js.native
    object contactsService extends TopLevel[contactsService with Double]
    
    /* 2 */ @js.native
    object deviceStatusService extends TopLevel[deviceStatusService with Double]
    
    /* 3 */ @js.native
    object notesService extends TopLevel[notesService with Double]
    
    /* 4 */ @js.native
    object ringtonesService extends TopLevel[ringtonesService with Double]
    
    /* 5 */ @js.native
    object smsService extends TopLevel[smsService with Double]
    
    /* 6 */ @js.native
    object tasksService extends TopLevel[tasksService with Double]
    
  }
  
  /* static members */
  @js.native
  object StorageDevice extends js.Object {
    /**
      * Gets a StorageFolder object from a DeviceInformation Id for a removable storage device.
      * @param DeviceId The DeviceInformation ID that identifies the removable storage device. This id can be retrieved from Windows.Devices.Enumeration or the DeviceInformationId property of the AutoPlay device event arguments. For more information, see Quickstart: Register an app for an AutoPlay device. In order for FromId to succeed, the app must declare both the removableStorage capability as shown in the App capability declarations and file type associations for the files it wishes to access on the device as shown in How to handle file activation. For more information, see the Removable Storage sample.
      * @return The storage folder object that represents the removable storage device and provides access to content on the device.
      */
    def fromId(DeviceId: String): StorageFolder = js.native
    /**
      * An Advanced Query Syntax (AQS) string for identifying removable storage devices. This string is passed to the FindAllAsync or CreateWatcher method.
      * @return An AQS string for identifying storage devices.
      */
    def getDeviceSelector(): String = js.native
  }
  
}

