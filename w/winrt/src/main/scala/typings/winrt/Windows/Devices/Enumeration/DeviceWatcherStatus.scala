package typings.winrt.Windows.Devices.Enumeration

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceWatcherStatus extends js.Object
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherStatus")
@js.native
object DeviceWatcherStatus extends js.Object {
  
  @js.native
  sealed trait aborted extends DeviceWatcherStatus
  
  @js.native
  sealed trait created extends DeviceWatcherStatus
  
  @js.native
  sealed trait enumerationCompleted extends DeviceWatcherStatus
  
  @js.native
  sealed trait started extends DeviceWatcherStatus
  
  @js.native
  sealed trait stopped extends DeviceWatcherStatus
  
  @js.native
  sealed trait stopping extends DeviceWatcherStatus
}
