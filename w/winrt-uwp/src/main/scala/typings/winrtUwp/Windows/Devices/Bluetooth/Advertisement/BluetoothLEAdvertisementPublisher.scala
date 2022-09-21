package typings.winrtUwp.Windows.Devices.Bluetooth.Advertisement

import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.statuschanged
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An object to send Bluetooth Low Energy (LE) advertisements. */
@js.native
trait BluetoothLEAdvertisementPublisher extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statuschanged(
    `type`: statuschanged,
    listener: TypedEventHandler[
      BluetoothLEAdvertisementPublisher, 
      BluetoothLEAdvertisementPublisherStatusChangedEventArgs
    ]
  ): Unit = js.native
  
  /** Gets a copy of the Bluetooth LE advertisement to publish. */
  var advertisement: BluetoothLEAdvertisement = js.native
  
  /** Notification that the status of the BluetoothLEAdvertisementPublisher has changed. */
  def onstatuschanged(
    ev: BluetoothLEAdvertisementPublisherStatusChangedEventArgs & WinRTEvent[BluetoothLEAdvertisementPublisher]
  ): Unit = js.native
  /** Notification that the status of the BluetoothLEAdvertisementPublisher has changed. */
  @JSName("onstatuschanged")
  var onstatuschanged_Original: TypedEventHandler[
    BluetoothLEAdvertisementPublisher, 
    BluetoothLEAdvertisementPublisherStatusChangedEventArgs
  ] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
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
  
  /** Gets the current status of the BluetoothLEAdvertisementPublisher . */
  var status: BluetoothLEAdvertisementPublisherStatus = js.native
  
  /** Stop the publisher and stop advertising a Bluetooth LE advertisement payload. */
  def stop(): Unit = js.native
}
