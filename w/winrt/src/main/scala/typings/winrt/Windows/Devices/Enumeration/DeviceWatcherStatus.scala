package typings.winrt.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceWatcherStatus extends StObject
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherStatus")
@js.native
object DeviceWatcherStatus extends StObject {
  
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
