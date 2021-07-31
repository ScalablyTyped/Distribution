package typings.winrt.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceWatcherStatus extends StObject
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherStatus")
@js.native
object DeviceWatcherStatus extends StObject {
  
  @js.native
  sealed trait aborted
    extends StObject
       with DeviceWatcherStatus
  
  @js.native
  sealed trait created
    extends StObject
       with DeviceWatcherStatus
  
  @js.native
  sealed trait enumerationCompleted
    extends StObject
       with DeviceWatcherStatus
  
  @js.native
  sealed trait started
    extends StObject
       with DeviceWatcherStatus
  
  @js.native
  sealed trait stopped
    extends StObject
       with DeviceWatcherStatus
  
  @js.native
  sealed trait stopping
    extends StObject
       with DeviceWatcherStatus
}
