package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.BluetoothNs.AdvertisementNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object to send Bluetooth Low Energy (LE) advertisements. */
@JSGlobal("Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisementPublisher")
@js.native
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
  var onstatuschanged_Original: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
    BluetoothLEAdvertisementPublisher, 
    BluetoothLEAdvertisementPublisherStatusChangedEventArgs
  ] = js.native
  /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
  var status: BluetoothLEAdvertisementPublisherStatus = js.native
  def addEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      BluetoothLEAdvertisementPublisher, 
      BluetoothLEAdvertisementPublisherStatusChangedEventArgs
    ]
  ): scala.Unit = js.native
  /** Notification that the status of the BluetoothLEAdvertisementPublisher has changed. */
  def onstatuschanged(
    ev: BluetoothLEAdvertisementPublisherStatusChangedEventArgs with winrtDashUwpLib.WindowsNs.WinRTEvent[BluetoothLEAdvertisementPublisher]
  ): scala.Unit = js.native
  def removeEventListener(`type`: java.lang.String, listener: winrtDashUwpLib.WindowsNs.FoundationNs.EventHandler[_]): scala.Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statuschanged(
    `type`: winrtDashUwpLib.winrtDashUwpLibStrings.statuschanged,
    listener: winrtDashUwpLib.WindowsNs.FoundationNs.TypedEventHandler[
      BluetoothLEAdvertisementPublisher, 
      BluetoothLEAdvertisementPublisherStatusChangedEventArgs
    ]
  ): scala.Unit = js.native
  /** Start advertising a Bluetooth LE advertisement payload. */
  def start(): scala.Unit = js.native
  /** Stop the publisher and stop advertising a Bluetooth LE advertisement payload. */
  def stop(): scala.Unit = js.native
}

