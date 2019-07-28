package typings.winrtDashUwp.WindowsNs.DevicesNs.BluetoothNs.RfcommNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an RFCOMM service ID. */
@JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId")
@js.native
abstract class RfcommServiceId () extends js.Object {
  /** Retrieves the 128-bit service id. */
  var uuid: String = js.native
  /**
    * Converts the RfcommServiceId to a 32-bit service id if possible.
    * @return Returns the 32-bit service id if the RfcommServiceId represents a standardized service.
    */
  def asShortId(): Double = js.native
  /**
    * Converts the RfcommServiceId to a string.
    * @return Returns the string representation of the 128-bit service id.
    */
  def asString(): String = js.native
}

/* static members */
@JSGlobal("Windows.Devices.Bluetooth.Rfcomm.RfcommServiceId")
@js.native
object RfcommServiceId extends js.Object {
  /** Creates a RfcommServiceId object corresponding to the service id for the standardized Generic File Transfer service (with short id 0x1202). */
  var genericFileTransfer: RfcommServiceId = js.native
  /** Creates a RfcommServiceId object corresponding to the service id for the standardized OBEX File Transfer service (with short id 0x1106). */
  var obexFileTransfer: RfcommServiceId = js.native
  /** Creates a RfcommServiceId object corresponding to the service id for the standardized OBEX Object Push service (with short id 0x1105). */
  var obexObjectPush: RfcommServiceId = js.native
  /** Creates a RfcommServiceId object corresponding to the service id for the standardized Phone Book Access (PCE) service (with short id 0x112E). */
  var phoneBookAccessPce: RfcommServiceId = js.native
  /** Creates a RfcommServiceId object corresponding to the service id for the standardized Phone Book Access (PSE) service (with short id 0x112F). */
  var phoneBookAccessPse: RfcommServiceId = js.native
  /** Creates a RfcommServiceId object corresponding to the service id for the standardized Serial Port service (with short id 0x1101). */
  var serialPort: RfcommServiceId = js.native
  /**
    * Creates a RfcommServiceId object from a 32-bit service id.
    * @param shortId The 32-bit service id.
    * @return The RfcommServiceId object.
    */
  def fromShortId(shortId: Double): RfcommServiceId = js.native
  /**
    * Creates a RfcommServiceId object from a 128-bit service id.
    * @param uuid The 128-bit service id.
    * @return The RfcommServiceId object.
    */
  def fromUuid(uuid: String): RfcommServiceId = js.native
}

