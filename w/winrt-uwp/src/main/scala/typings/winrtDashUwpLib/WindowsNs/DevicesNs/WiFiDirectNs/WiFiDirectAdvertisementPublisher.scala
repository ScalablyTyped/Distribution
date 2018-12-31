package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.WiFiDirectNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object to publish Wi-Fi Direct advertisements. */
@JSGlobal("Windows.Devices.WiFiDirect.WiFiDirectAdvertisementPublisher")
@js.native
/** Creates a new WiFiDirectAdvertisementPublisher object. */
class WiFiDirectAdvertisementPublisher () extends js.Object {
  /** Gets the Wi-Fi Direct advertisement to publish. */
  var advertisement: WiFiDirectAdvertisement = js.native
  /** Notification that the status of the WiFiDirectAdvertisementPublisher has changed. */
  @JSName("onstatuschanged")
  var onstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    WiFiDirectAdvertisementPublisher, 
    WiFiDirectAdvertisementPublisherStatusChangedEventArgs
  ] = js.native
  /** Gets the current status of the WiFiDirectAdvertisementPublisher . */
  var status: WiFiDirectAdvertisementPublisherStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      WiFiDirectAdvertisementPublisher, 
      WiFiDirectAdvertisementPublisherStatusChangedEventArgs
    ]
  ): scala.Unit = js.native
  /** Notification that the status of the WiFiDirectAdvertisementPublisher has changed. */
  def onstatuschanged(
    ev: WiFiDirectAdvertisementPublisherStatusChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[WiFiDirectAdvertisementPublisher]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      WiFiDirectAdvertisementPublisher, 
      WiFiDirectAdvertisementPublisherStatusChangedEventArgs
    ]
  ): scala.Unit = js.native
  /** Starts the Wi-Fi Direct advertisement. */
  def start(): scala.Unit = js.native
  /** Stops the Wi-Fi Direct advertisement. */
  def stop(): scala.Unit = js.native
}

