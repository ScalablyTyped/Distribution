package typings
package winrtDashUwpLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This structure represents information about the length of an SmsTextMessage object when it is encoded as a PDU. */
trait SmsEncodedLength extends js.Object {
  /** The number of bytes in the last segment of the encoded message. */
  var byteCountLastSegment: scala.Double
  /** The number of bytes in each segment of the message. */
  var bytesPerSegment: scala.Double
  /** The number of characters in the last segment of the encoded message. */
  var characterCountLastSegment: scala.Double
  /** The estimated number of characters that can fit in one segment of the message. */
  var charactersPerSegment: scala.Double
  /** The number of segments needed to encode the message. */
  var segmentCount: scala.Double
}

object SmsEncodedLength {
  @scala.inline
  def apply(
    byteCountLastSegment: scala.Double,
    bytesPerSegment: scala.Double,
    characterCountLastSegment: scala.Double,
    charactersPerSegment: scala.Double,
    segmentCount: scala.Double
  ): SmsEncodedLength = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("byteCountLastSegment")(byteCountLastSegment)
    __obj.updateDynamic("bytesPerSegment")(bytesPerSegment)
    __obj.updateDynamic("characterCountLastSegment")(characterCountLastSegment)
    __obj.updateDynamic("charactersPerSegment")(charactersPerSegment)
    __obj.updateDynamic("segmentCount")(segmentCount)
    __obj.asInstanceOf[SmsEncodedLength]
  }
}

