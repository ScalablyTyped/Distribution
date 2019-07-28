package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.connectionrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class used to listen for incoming Wi-Fi Direct connection requests. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionListener")
@js.native
/** Creates a new WiFiDirectConnectionListener object. */
class WiFiDirectConnectionListener () extends js.Object {
  /** Notification on an incoming Wi-Fi Direct connection request. */
  @JSName("onconnectionrequested")
  var onconnectionrequested_Original: TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs] = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionrequested(
    `type`: connectionrequested,
    listener: TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs]
  ): Unit = js.native
  /** Notification on an incoming Wi-Fi Direct connection request. */
  def onconnectionrequested(ev: WiFiDirectConnectionRequestedEventArgs with WinRTEvent[WiFiDirectConnectionListener]): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionrequested(
    `type`: connectionrequested,
    listener: TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs]
  ): Unit = js.native
}

