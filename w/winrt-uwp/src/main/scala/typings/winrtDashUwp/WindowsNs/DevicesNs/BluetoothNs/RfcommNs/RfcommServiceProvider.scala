package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.RfcommNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrtDashUwp.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation
import typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.StreamSocketListener
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.IBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an instance of a local RFCOMM service. */
@JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider")
@js.native
abstract class RfcommServiceProvider () extends js.Object {
  /** Gets a collection of SDP attributes for advertising. */
  var sdpRawAttributes: IMap[Double, IBuffer] = js.native
  /** Gets the RfcommServiceId of this local RFCOMM service instance. */
  var serviceId: RfcommServiceId = js.native
  /**
    * Begins advertising the SDP attributes.
    * @param listener The StreamSocketListener that is listening for incoming connections.
    */
  def startAdvertising(listener: StreamSocketListener): Unit = js.native
  /**
    * Begins advertising the SDP attributes.
    * @param listener The StreamSocketListener that is listening for incoming connections.
    * @param radioDiscoverable Indicates whether the radio is discoverable (true) or not (false).
    */
  def startAdvertising(listener: StreamSocketListener, radioDiscoverable: Boolean): Unit = js.native
  /** Stops advertising the SDP attributes. */
  def stopAdvertising(): Unit = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceProvider")
@js.native
object RfcommServiceProvider extends js.Object {
  /**
    * Gets a RfcommServiceProvider object from a DeviceInformation Id for a RFCOMM service instance.
    * @param serviceId The RfcommServiceId to be hosted locally.
    * @return The RfcommServiceProvider object that represents the local RFCOMM service instance.
    */
  def createAsync(serviceId: RfcommServiceId): IPromiseWithIAsyncOperation[RfcommServiceProvider] = js.native
}

