package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an SMS message in raw PDU format. The data format differs depending on whether the message format (indicated by the value of the Format property) is GSM or CDMA. */
trait SmsBinaryMessage extends StObject {
  
  /** Retrieves the detected protocol description unit (PDU) format of this message. */
  var format: SmsDataFormat
  
  /**
    * Returns the raw buffer of the message in binary protocol description unit (PDU) format as a byte array.
    * @return A byte array representing message data. If there is no message data, the returned array is empty.
    */
  def getData(): js.Array[Double]
  
  /** Indicates the ID of the asynchronous message operation. */
  var id: Double
  
  /** Returns the message class, as determined by the operator's message network. The two most common classes are None (normal message) or Class0 (special operator message, such as a roaming warning that must be shown immediately to the user). A typical client for end-user messages ignores Class0 messages. */
  var messageClass: SmsMessageClass
  
  /**
    * Specifies the raw binary payload of the SMS message. It should be formatted according to the protocol description unit (PDU) standard.
    * @param value A byte array representing message data. If there is no message data, the returned array is empty.
    */
  def setData(value: js.Array[Double]): Unit
}
object SmsBinaryMessage {
  
  @scala.inline
  def apply(
    format: SmsDataFormat,
    getData: () => js.Array[Double],
    id: Double,
    messageClass: SmsMessageClass,
    setData: js.Array[Double] => Unit
  ): SmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData), id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[SmsBinaryMessage]
  }
  
  @scala.inline
  implicit class SmsBinaryMessageMutableBuilder[Self <: SmsBinaryMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFormat(value: SmsDataFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetData(value: () => js.Array[Double]): Self = StObject.set(x, "getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageClass(value: SmsMessageClass): Self = StObject.set(x, "messageClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetData(value: js.Array[Double] => Unit): Self = StObject.set(x, "setData", js.Any.fromFunction1(value))
  }
}
