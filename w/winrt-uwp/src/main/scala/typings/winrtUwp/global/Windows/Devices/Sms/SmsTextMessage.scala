package typings.winrtUwp.global.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Manages a decoded SMS text message, providing direct access to the plain text body of the message, as well as key header properties, such as time stamp. */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
/** Creates an instance of the SmsTextMessage class. */
class SmsTextMessage ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage
/* static members */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
object SmsTextMessage extends js.Object {
  
  /**
    * Decodes a binary message and places the results in a new instance of a text message. This method represents the binary message as a reference to a buffer of bytes and a selection of how the buffer is encoded. Therefore, it can be used when the message did not originate directly from the device or as an instance of an SmsBinaryMessage class.
    * @param format An SmsDataFormat enumerated value that identifies the format of a particular protocol description unit (PDU) buffer.
    * @param value An array of bytes containing the binary data to decode.
    * @return A new SmsTextMessage object if the decoding was successful.
    */
  def fromBinaryData(format: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat, value: js.Array[Double]): typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage = js.native
  
  /**
    * Reads a binary message and decodes it. The results are placed in a new instance of a text message.
    * @param binaryMessage An instance of a binary message to decode.
    * @return A new SmsTextMessage object.
    */
  def fromBinaryMessage(binaryMessage: typings.winrtUwp.Windows.Devices.Sms.SmsBinaryMessage): typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage = js.native
}
