package typings.winrtUwp.global.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an SMS message in raw PDU format. The data format differs depending on whether the message format (indicated by the value of the Format property) is GSM or CDMA. */
@JSGlobal("Windows.Devices.Sms.SmsBinaryMessage")
@js.native
/** Creates an instance of the SmsBinaryMessage class. */
class SmsBinaryMessage ()
  extends typings.winrtUwp.Windows.Devices.Sms.SmsBinaryMessage {
  /** Retrieves the detected protocol description unit (PDU) format of this message. */
  /* CompleteClass */
  override var format: typings.winrtUwp.Windows.Devices.Sms.SmsDataFormat = js.native
  /** Indicates the ID of the asynchronous message operation. */
  /* CompleteClass */
  override var id: Double = js.native
  /** Returns the message class, as determined by the operator's message network. The two most common classes are None (normal message) or Class0 (special operator message, such as a roaming warning that must be shown immediately to the user). A typical client for end-user messages ignores Class0 messages. */
  /* CompleteClass */
  override var messageClass: typings.winrtUwp.Windows.Devices.Sms.SmsMessageClass = js.native
  /**
    * Returns the raw buffer of the message in binary protocol description unit (PDU) format as a byte array.
    * @return A byte array representing message data. If there is no message data, the returned array is empty.
    */
  /* CompleteClass */
  override def getData(): js.Array[Double] = js.native
  /**
    * Specifies the raw binary payload of the SMS message. It should be formatted according to the protocol description unit (PDU) standard.
    * @param value A byte array representing message data. If there is no message data, the returned array is empty.
    */
  /* CompleteClass */
  override def setData(value: js.Array[Double]): Unit = js.native
}

