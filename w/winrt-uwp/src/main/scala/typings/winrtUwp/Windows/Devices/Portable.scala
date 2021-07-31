package typings.winrtUwp.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Windows Portable Devices (WPD) enables computers to communicate with attached media and storage devices. This namespace provides methods for identifying Windows Portable Device (WPD) services and storage. */
object Portable {
  
  @js.native
  sealed trait ServiceDeviceType extends StObject
  /** Indicates the type of a portable device service. */
  @JSGlobal("Windows.Devices.Portable.ServiceDeviceType")
  @js.native
  object ServiceDeviceType extends StObject {
    
    /** A service that provides calendar information. */
    @js.native
    sealed trait calendarService
      extends StObject
         with ServiceDeviceType
    
    /** A service that tracks contacts. */
    @js.native
    sealed trait contactsService
      extends StObject
         with ServiceDeviceType
    
    /** A device status service. */
    @js.native
    sealed trait deviceStatusService
      extends StObject
         with ServiceDeviceType
    
    /** A note-taking service. */
    @js.native
    sealed trait notesService
      extends StObject
         with ServiceDeviceType
    
    /** A service that provides ringtones for a phone. */
    @js.native
    sealed trait ringtonesService
      extends StObject
         with ServiceDeviceType
    
    /** An SMS messaging service. */
    @js.native
    sealed trait smsService
      extends StObject
         with ServiceDeviceType
    
    /** A service for tracking tasks. */
    @js.native
    sealed trait tasksService
      extends StObject
         with ServiceDeviceType
  }
  
  /** Provides methods for identifying a device service for a portable device that supports WPD (Windows Portable Devices) for device enumeration. */
  trait ServiceDevice extends StObject
  
  /** Provides methods for accessing the storage functionality of a portable device that supports WPD. */
  trait StorageDevice extends StObject
}
