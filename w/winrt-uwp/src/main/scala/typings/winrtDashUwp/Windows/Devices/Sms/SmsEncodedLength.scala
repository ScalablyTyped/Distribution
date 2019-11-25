package typings.winrtDashUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This structure represents information about the length of an SmsTextMessage object when it is encoded as a PDU. */
trait SmsEncodedLength extends js.Object {
  /** The number of bytes in the last segment of the encoded message. */
  var byteCountLastSegment: Double
  /** The number of bytes in each segment of the message. */
  var bytesPerSegment: Double
  /** The number of characters in the last segment of the encoded message. */
  var characterCountLastSegment: Double
  /** The estimated number of characters that can fit in one segment of the message. */
  var charactersPerSegment: Double
  /** The number of segments needed to encode the message. */
  var segmentCount: Double
}

object SmsEncodedLength {
  @scala.inline
  def apply(
    byteCountLastSegment: Double,
    bytesPerSegment: Double,
    characterCountLastSegment: Double,
    charactersPerSegment: Double,
    segmentCount: Double
  ): SmsEncodedLength = {
    val __obj = js.Dynamic.literal(byteCountLastSegment = byteCountLastSegment.asInstanceOf[js.Any], bytesPerSegment = bytesPerSegment.asInstanceOf[js.Any], characterCountLastSegment = characterCountLastSegment.asInstanceOf[js.Any], charactersPerSegment = charactersPerSegment.asInstanceOf[js.Any], segmentCount = segmentCount.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SmsEncodedLength]
  }
}

