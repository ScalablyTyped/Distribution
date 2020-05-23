package typings.winrtUwp.Windows.Devices.WiFiDirect

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.statuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object to publish Wi-Fi Direct advertisements. */
@js.native
trait WiFiDirectAdvertisementPublisher extends js.Object {
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

