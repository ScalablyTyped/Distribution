package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Class used to listen for incoming Wi-Fi Direct connection requests. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectConnectionListener")
@js.native
class WiFiDirectConnectionListener () extends js.Object {
  /** Notification on an incoming Wi-Fi Direct connection request. */
  @JSName("onconnectionrequested")
  var onconnectionrequested_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs] = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_connectionrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.connectionrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs]
  ): scala.Unit = js.native
  /** Notification on an incoming Wi-Fi Direct connection request. */
  def onconnectionrequested(
    ev: WiFiDirectConnectionRequestedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[WiFiDirectConnectionListener]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_connectionrequested(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.connectionrequested,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[WiFiDirectConnectionListener, WiFiDirectConnectionRequestedEventArgs]
  ): scala.Unit = js.native
}

