package typings.winrtUwp.Windows.Devices.Bluetooth.Rfcomm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an RFCOMM service ID. */
trait RfcommServiceId extends js.Object {
  /** Retrieves the 128-bit service id. */
  var uuid: String
  /**
    * Converts the RfcommServiceId to a 32-bit service id if possible.
    * @return Returns the 32-bit service id if the RfcommServiceId represents a standardized service.
    */
  def asShortId(): Double
  /**
    * Converts the RfcommServiceId to a string.
    * @return Returns the string representation of the 128-bit service id.
    */
  def asString(): String
}

object RfcommServiceId {
  @scala.inline
  def apply(asShortId: () => Double, asString: () => String, uuid: String): RfcommServiceId = {
    val __obj = js.Dynamic.literal(asShortId = js.Any.fromFunction0(asShortId), asString = js.Any.fromFunction0(asString), uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[RfcommServiceId]
  }
}

