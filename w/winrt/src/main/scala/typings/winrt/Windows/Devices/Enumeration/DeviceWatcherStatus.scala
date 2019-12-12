package typings.winrt.Windows.Devices.Enumeration

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.aborted
import typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.created
import typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.enumerationCompleted
import typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.started
import typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.stopped
import typings.winrt.Windows.Devices.Enumeration.DeviceWatcherStatus.stopping
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeviceWatcherStatus with Double] = js.native
  /* 5 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  /* 0 */ @js.native
  object created extends TopLevel[created with Double]
  
  /* 2 */ @js.native
  object enumerationCompleted extends TopLevel[enumerationCompleted with Double]
  
  /* 1 */ @js.native
  object started extends TopLevel[started with Double]
  
  /* 4 */ @js.native
  object stopped extends TopLevel[stopped with Double]
  
  /* 3 */ @js.native
  object stopping extends TopLevel[stopping with Double]
  
}

