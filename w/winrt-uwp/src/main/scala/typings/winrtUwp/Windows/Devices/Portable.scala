package typings.winrtUwp.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  }
  
  /** Provides methods for identifying a device service for a portable device that supports WPD (Windows Portable Devices) for device enumeration. */
  @js.native
  trait ServiceDevice extends StObject
  
  /** Provides methods for accessing the storage functionality of a portable device that supports WPD. */
  @js.native
  trait StorageDevice extends StObject
}
