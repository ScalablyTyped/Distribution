package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.EventHandler
import typings.winrtDashUwp.WindowsNs.FoundationNs.TypedEventHandler
import typings.winrtDashUwp.WindowsNs.WinRTEvent
import typings.winrtDashUwp.winrtDashUwpStrings.statuschanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object to send Bluetooth Low Energy (LE) advertisements. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisher")
@js.native
/** Creates a new BluetoothLEAdvertisementPublisher object. */
class BluetoothLEAdvertisementPublisher () extends js.Object {
  /**
    * Creates a new BluetoothLEAdvertisementPublisher object with the Bluetooth LE advertisement to publish.
    * @param advertisement The Bluetooth LE advertisement to publish.
    */
  def this(advertisement: BluetoothLEAdvertisement) = this()
  /** Gets a copy of the Bluetooth LE advertisement to publish. */
  var advertisement: BluetoothLEAdvertisement = js.native
  /** Notification that the status of the BluetoothLEAdvertisementPublisher has changed. */
  @JSName("onstatuschanged")
  var onstatuschanged_Original: TypedEventHandler[
    BluetoothLEAdvertisementPublisher, 
    BluetoothLEAdvertisementPublisherStatusChangedEventArgs
  ] = js.native
  /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
  var status: BluetoothLEAdvertisementPublisherStatus = js.native
  def addEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(
    `type`: statuschanged,
    listener: TypedEventHandler[
      BluetoothLEAdvertisementPublisher, 
      BluetoothLEAdvertisementPublisherStatusChangedEventArgs
    ]
  ): Unit = js.native
  /** Notification that the status of the BluetoothLEAdvertisementPublisher has changed. */
  def onstatuschanged(
    ev: BluetoothLEAdvertisementPublisherStatusChangedEventArgs with WinRTEvent[BluetoothLEAdvertisementPublisher]
  ): Unit = js.native
  def removeEventListener(`type`: String, listener: EventHandler[_]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statuschanged(
    `type`: statuschanged,
    listener: TypedEventHandler[
      BluetoothLEAdvertisementPublisher, 
      BluetoothLEAdvertisementPublisherStatusChangedEventArgs
    ]
  ): Unit = js.native
  /** Start advertising a Bluetooth LE advertisement payload. */
  def start(): Unit = js.native
  /** Stop the publisher and stop advertising a Bluetooth LE advertisement payload. */
  def stop(): Unit = js.native
}

