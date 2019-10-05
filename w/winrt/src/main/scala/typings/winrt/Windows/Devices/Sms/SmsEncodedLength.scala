package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsEncodedLength extends js.Object {
  var byteCountLastSegment: Double
  var bytesPerSegment: Double
  var characterCountLastSegment: Double
  var charactersPerSegment: Double
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
    val __obj = js.Dynamic.literal(byteCountLastSegment = byteCountLastSegment, bytesPerSegment = bytesPerSegment, characterCountLastSegment = characterCountLastSegment, charactersPerSegment = charactersPerSegment, segmentCount = segmentCount)
  
    __obj.asInstanceOf[SmsEncodedLength]
  }
}

