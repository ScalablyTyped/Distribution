package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsTextMessage extends ISmsMessage {
  var body: java.lang.String
  var encoding: SmsEncoding
  var from: java.lang.String
  var partCount: scala.Double
  var partNumber: scala.Double
  var partReferenceId: scala.Double
  var timestamp: stdLib.Date
  var to: java.lang.String
  def toBinaryMessages(format: SmsDataFormat): winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsBinaryMessage]
}

object ISmsTextMessage {
  @scala.inline
  def apply(
    body: java.lang.String,
    encoding: SmsEncoding,
    from: java.lang.String,
    id: scala.Double,
    messageClass: SmsMessageClass,
    partCount: scala.Double,
    partNumber: scala.Double,
    partReferenceId: scala.Double,
    timestamp: stdLib.Date,
    to: java.lang.String,
    toBinaryMessages: js.Function1[
      SmsDataFormat, 
      winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[ISmsBinaryMessage]
    ]
  ): ISmsTextMessage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("body")(body)
    __obj.updateDynamic("encoding")(encoding)
    __obj.updateDynamic("from")(from)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("messageClass")(messageClass)
    __obj.updateDynamic("partCount")(partCount)
    __obj.updateDynamic("partNumber")(partNumber)
    __obj.updateDynamic("partReferenceId")(partReferenceId)
    __obj.updateDynamic("timestamp")(timestamp)
    __obj.updateDynamic("to")(to)
    __obj.updateDynamic("toBinaryMessages")(toBinaryMessages)
    __obj.asInstanceOf[ISmsTextMessage]
  }
}

