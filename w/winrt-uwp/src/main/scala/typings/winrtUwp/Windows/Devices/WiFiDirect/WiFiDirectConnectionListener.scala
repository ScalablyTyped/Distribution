package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.connectionrequested
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class used to listen for incoming Wi-Fi Direct connection requests. */
@js.native
trait WiFiDirectConnectionListener extends js.Object {
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

