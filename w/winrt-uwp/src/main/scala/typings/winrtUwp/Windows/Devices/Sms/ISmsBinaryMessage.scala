package typings.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This interface provides access to the raw binary format of an SMS message. The message is stored in the industry standard protocol description unit (PDU) format (see the SMS specification GSM 03.40). */
@js.native
trait ISmsBinaryMessage extends ISmsMessage {
  
  /** Retrieves the detected protocol description unit (PDU) format of this message. */
  var format: SmsDataFormat = js.native
  
  /**
    * Returns the raw buffer of the message in binary protocol description unit (PDU) format as a byte array.
    * @return A byte array representing message data. If there is no message data, the returned array is empty.
    */
  def getData(): js.Array[Double] = js.native
  
  /**
    * Specifies the raw binary payload of the SMS message. It should be formatted according to the protocol description unit (PDU) standard.
    * @param value A byte array representing message data, formatted according to the protocol description unit (PDU) standard.
    */
  def setData(value: js.Array[Double]): Unit = js.native
}
object ISmsBinaryMessage {
  
  @scala.inline
  def apply(
    format: SmsDataFormat,
    getData: () => js.Array[Double],
    id: Double,
    messageClass: SmsMessageClass,
    setData: js.Array[Double] => Unit
  ): ISmsBinaryMessage = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], getData = js.Any.fromFunction0(getData), id = id.asInstanceOf[js.Any], messageClass = messageClass.asInstanceOf[js.Any], setData = js.Any.fromFunction1(setData))
    __obj.asInstanceOf[ISmsBinaryMessage]
  }
  
  @scala.inline
  implicit class ISmsBinaryMessageOps[Self <: ISmsBinaryMessage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setFormat(value: SmsDataFormat): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetData(value: () => js.Array[Double]): Self = this.set("getData", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetData(value: js.Array[Double] => Unit): Self = this.set("setData", js.Any.fromFunction1(value))
  }
}
