package typings.winrtUwp.global.Windows.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Windows Store apps use background tasks to perform long-running syncs with devices and update device settings and firmware. The classes in Windows.Devices.Background are used by device background tasks to get info provided by the app that triggered the task and to report progress back to the app. */
object Background {
  
  /** Used to provide the DeviceInformation.ID , expected duration, and arguments given by the app that triggered the background servicing task. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Background.DeviceServicingDetails")
  @js.native
  open class DeviceServicingDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Background.DeviceServicingDetails {
    
    /** Gets the arguments string provided by the app when it called RequestAsync on the DeviceServicingTrigger . This allows the app to easily pass parameters to the task when it invokes it. */
    /* CompleteClass */
    var arguments: String = js.native
    
    /** Gets the DeviceInformation.ID of the device the task is targeting. The background task can provide this to the FromIdAsync method of the appropriate device access class to open the device. For example, call UsbDevice.FromIdAsync in the Windows.Devices.Usb namespace to open a USB device. */
    /* CompleteClass */
    var deviceId: String = js.native
    
    /** Gets the estimated duration provided by the app when it called RequestAsync on the DeviceServicingTrigger . */
    /* CompleteClass */
    var expectedDuration: Double = js.native
  }
  
  /** Used to provide the DeviceInformation.ID and arguments given by the app that triggered the background sync task. */
  /* note: abstract class */ @JSGlobal("Windows.Devices.Background.DeviceUseDetails")
  @js.native
  open class DeviceUseDetails ()
    extends StObject
       with typings.winrtUwp.Windows.Devices.Background.DeviceUseDetails {
    
    /** Gets the arguments string provided by the app when it called RequestAsync on the DeviceUseTrigger . This allows the app to easily pass parameters to the task when it invokes it. */
    /* CompleteClass */
    var arguments: String = js.native
    
    /** Gets the DeviceInformation.ID of the device the task is targeting. The background task can provide this to the FromIdAsync method of the appropriate device access class to open the device. For example, call UsbDevice.FromIdAsync in the Windows.Devices.Usb namespace to open a USB device. */
    /* CompleteClass */
    var deviceId: String = js.native
  }
}
