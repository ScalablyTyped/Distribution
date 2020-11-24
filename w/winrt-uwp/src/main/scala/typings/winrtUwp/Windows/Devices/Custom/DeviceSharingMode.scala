package typings.winrtUwp.Windows.Devices.Custom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceSharingMode extends js.Object
/** The device sharing mode. */
@JSGlobal("Windows.Devices.Custom.DeviceSharingMode")
@js.native
object DeviceSharingMode extends js.Object {
  
  /** The device is exclusive. */
  @js.native
  sealed trait exclusive extends DeviceSharingMode
  
  /** The device is shared. */
  @js.native
  sealed trait shared extends DeviceSharingMode
}
