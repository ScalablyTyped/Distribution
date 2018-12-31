package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This interface provides access to the raw binary format of an SMS message. The message is stored in the industry standard protocol description unit (PDU) format (see the SMS specification GSM 03.40). */
trait ISmsBinaryMessage extends ISmsMessage {
  /** Retrieves the detected protocol description unit (PDU) format of this message. */
  var format: SmsDataFormat
  /**
    * Returns the raw buffer of the message in binary protocol description unit (PDU) format as a byte array.
    * @return A byte array representing message data. If there is no message data, the returned array is empty.
    */
  def getData(): js.Array[scala.Double]
  /**
    * Specifies the raw binary payload of the SMS message. It should be formatted according to the protocol description unit (PDU) standard.
    * @param value A byte array representing message data, formatted according to the protocol description unit (PDU) standard.
    */
  def setData(value: js.Array[scala.Double]): scala.Unit
}

