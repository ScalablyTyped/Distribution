package typings.winrtUwp.Windows.Devices.Enumeration

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeviceWatcherEventKind extends StObject
/** The type of event. */
@JSGlobal("Windows.Devices.Enumeration.DeviceWatcherEventKind")
@js.native
object DeviceWatcherEventKind extends StObject {
  
  /** The event is an add action. */
  @js.native
  sealed trait add extends DeviceWatcherEventKind
  
  /** The event is a remove action. */
  @js.native
  sealed trait remove extends DeviceWatcherEventKind
  
  /** The event is an update action. */
  @js.native
  sealed trait update extends DeviceWatcherEventKind
}
