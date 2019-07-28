package typings.winrtDashUwp.WindowsNs.DevicesNs.WiFiDirectNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.statuschanged
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
  var onstatuschanged_Original: TypedEventHandler[
    WiFiDirectAdvertisementPublisher, 
    WiFiDirectAdvertisementPublisherStatusChangedEventArgs
  ] = js.native
  /** Gets the current status of the WiFiDirectAdvertisementPublisher . */
  var status: WiFiDirectAdvertisementPublisherStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(
    `type`: statuschanged,
    listener: TypedEventHandler[
      WiFiDirectAdvertisementPublisher, 
      WiFiDirectAdvertisementPublisherStatusChangedEventArgs
    ]
  ): Unit = js.native
  /** Notification that the status of the WiFiDirectAdvertisementPublisher has changed. */
  def onstatuschanged(
    ev: WiFiDirectAdvertisementPublisherStatusChangedEventArgs with WinRTEvent[WiFiDirectAdvertisementPublisher]
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statuschanged(
    `type`: statuschanged,
    listener: TypedEventHandler[
      WiFiDirectAdvertisementPublisher, 
      WiFiDirectAdvertisementPublisherStatusChangedEventArgs
    ]
  ): Unit = js.native
  /** Starts the Wi-Fi Direct advertisement. */
  def start(): Unit = js.native
  /** Stops the Wi-Fi Direct advertisement. */
  def stop(): Unit = js.native
}

