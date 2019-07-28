package typings.winrt.WindowsNs.DevicesNs.SmsNs

import typings.std.Date
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISmsTextMessage extends ISmsMessage {
  var body: String
  var encoding: SmsEncoding
  var from: String
  var partCount: Double
  var partNumber: Double
  var partReferenceId: Double
  var timestamp: Date
  var to: String
  def toBinaryMessages(format: SmsDataFormat): IVectorView[ISmsBinaryMessage]
}

object ISmsTextMessage {
  @scala.inline
  def apply(
    body: String,
    encoding: SmsEncoding,
    from: String,
    id: Double,
    messageClass: SmsMessageClass,
    partCount: Double,
    partNumber: Double,
    partReferenceId: Double,
    timestamp: Date,
    to: String,
    toBinaryMessages: SmsDataFormat => IVectorView[ISmsBinaryMessage]
  ): ISmsTextMessage = {
    val __obj = js.Dynamic.literal(body = body, encoding = encoding, from = from, id = id, messageClass = messageClass, partCount = partCount, partNumber = partNumber, partReferenceId = partReferenceId, timestamp = timestamp, to = to, toBinaryMessages = js.Any.fromFunction1(toBinaryMessages))
  
    __obj.asInstanceOf[ISmsTextMessage]
  }
}

