package typings.winrtUwp.global.Windows.Devices.Sms

import typings.std.Date
import typings.winrtUwp.Windows.Devices.Sms.ISmsBinaryMessage
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Manages a decoded SMS text message, providing direct access to the plain text body of the message, as well as key header properties, such as time stamp. */
@JSGlobal("Windows.Devices.Sms.SmsTextMessage")
@js.native
/** Creates an instance of the SmsTextMessage class. */
class SmsTextMessage ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsTextMessage {
  /** Specifies the plain text body of the message. */
  /* CompleteClass */
  override var body: String = js.native
  /** Specifies the encoding type that has been set to use when sending this message. */
  /* CompleteClass */
  override var encoding: typings.winrtUwp.Windows.Devices.Sms.SmsEncoding = js.native
  /** Specifies the phone number of the sender of the message. */
  /* CompleteClass */
  override var from: String = js.native
  /** Indicates the ID of the SMS text message. */
  /* CompleteClass */
  override var id: Double = js.native
  /** Specifies the message class of a message. This message class typically originates on the network, not the mobile device. */
  /* CompleteClass */
  override var messageClass: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass = js.native
  /** Indicates the total number of parts in the original message if the message is part of a multi-part message. */
  /* CompleteClass */
  override var partCount: Double = js.native
  /** Indicates the part number of a multi-part message if this message is part of a multi-part message. It can be used to reconstruct the original message by joining the parts together, in conjunction with the PartReferenceId and PartCount properties. */
  /* CompleteClass */
  override var partNumber: Double = js.native
  /** Indicates a reference value that can be used if the message is part of a multi-part message. If this message belongs to a multi-part message, the PartNumber value can be used to reconstruct the full original message, and each part of that message will have the same value for PartReferenceId. */
  /* CompleteClass */
  override var partReferenceId: Double = js.native
  /** Indicates the timestamp of the message. It is determined locally for a constructed message instance or from the service center timestamp of a received message. */
  /* CompleteClass */
  override var timestamp: Date = js.native
  /** Indicates the recipient phone number of this message. */
  /* CompleteClass */
  override var to: String = js.native
  /**
    * Reads a message in the specified format and places the results in a new instance of a binary message.
    * @param format A value from the SmsDataFormat enumeration.
    * @return The new binary message that holds the result of this method call.
    */
  /* CompleteClass */
  override def toBinaryMessages(format: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat): IVectorView[ISmsBinaryMessage] = js.native
}

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

