package typings.winrtUwp.global.Windows.Devices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Windows Store apps use background tasks to perform long-running syncs with devices and update device settings and firmware. The classes in Windows.Devices.Background are used by device background tasks to get info provided by the app that triggered the task and to report progress back to the app. */
@JSGlobal("Windows.Devices.Background")
@js.native
object Background extends js.Object {
  
  /** Used to provide the DeviceInformation.ID , expected duration, and arguments given by the app that triggered the background servicing task. */
  @js.native
  abstract class DeviceServicingDetails ()
    extends typings.winrtUwp.Windows.Devices.Background.DeviceServicingDetails
  
  /** Used to provide the DeviceInformation.ID and arguments given by the app that triggered the background sync task. */
  @js.native
  abstract class DeviceUseDetails ()
    extends typings.winrtUwp.Windows.Devices.Background.DeviceUseDetails
}
