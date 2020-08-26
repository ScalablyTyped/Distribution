package typings.winrtUwp.Windows.Networking.NetworkOperators

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a USSD message that is used for sending messages to and receiving messages from the network. */
@js.native
trait UssdMessage extends js.Object {
  /** Gets or sets the encoding scheme of the payload of this UssdMessage . */
  var dataCodingScheme: Double = js.native
  /** Gets or sets the payload of this UssdMessage as text. */
  var payloadAsText: String = js.native
  /**
    * Gets the raw payload of this UssdMessage .
    * @return The raw payload of this UssdMessage .
    */
  def getPayload(): js.Array[Double] = js.native
  /**
    * Sets the raw payload of this UssdMessage .
    * @param value The raw payload of this UssdMessage .
    */
  def setPayload(value: js.Array[Double]): Unit = js.native
}

object UssdMessage {
  @scala.inline
  def apply(
    dataCodingScheme: Double,
    getPayload: () => js.Array[Double],
    payloadAsText: String,
    setPayload: js.Array[Double] => Unit
  ): UssdMessage = {
    val __obj = js.Dynamic.literal(dataCodingScheme = dataCodingScheme.asInstanceOf[js.Any], getPayload = js.Any.fromFunction0(getPayload), payloadAsText = payloadAsText.asInstanceOf[js.Any], setPayload = js.Any.fromFunction1(setPayload))
    __obj.asInstanceOf[UssdMessage]
  }
  @scala.inline
  implicit class UssdMessageOps[Self <: UssdMessage] (val x: Self) extends AnyVal {
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
    def setDataCodingScheme(value: Double): Self = this.set("dataCodingScheme", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetPayload(value: () => js.Array[Double]): Self = this.set("getPayload", js.Any.fromFunction0(value))
    @scala.inline
    def setPayloadAsText(value: String): Self = this.set("payloadAsText", value.asInstanceOf[js.Any])
    @scala.inline
    def setSetPayload(value: js.Array[Double] => Unit): Self = this.set("setPayload", js.Any.fromFunction1(value))
  }
  
}

