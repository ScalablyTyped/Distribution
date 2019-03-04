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
    val __obj = js.Dynamic.literal(body = body, encoding = encoding, from = from, id = id, messageClass = messageClass, partCount = partCount, partNumber = partNumber, partReferenceId = partReferenceId, timestamp = timestamp, to = to, toBinaryMessages = toBinaryMessages)
  
    __obj.asInstanceOf[ISmsTextMessage]
  }
}

