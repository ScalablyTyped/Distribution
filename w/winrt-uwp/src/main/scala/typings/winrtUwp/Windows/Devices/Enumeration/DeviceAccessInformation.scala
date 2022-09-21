package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.accesschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains the information about access to a device. */
@js.native
trait DeviceAccessInformation extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_accesschanged(
    `type`: accesschanged,
    listener: TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs]
  ): Unit = js.native
  
  /** The current device access status. */
  var currentStatus: DeviceAccessStatus = js.native
  
  /** Raised when access to a device has changed. */
  def onaccesschanged(ev: DeviceAccessChangedEventArgs & WinRTEvent[DeviceAccessInformation]): Unit = js.native
  /** Raised when access to a device has changed. */
  @JSName("onaccesschanged")
  var onaccesschanged_Original: TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_accesschanged(
    `type`: accesschanged,
    listener: TypedEventHandler[DeviceAccessInformation, DeviceAccessChangedEventArgs]
  ): Unit = js.native
}
