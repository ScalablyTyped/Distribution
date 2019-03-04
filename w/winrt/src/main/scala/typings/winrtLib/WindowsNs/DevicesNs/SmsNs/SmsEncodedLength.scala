package typings
package winrtLib.WindowsNs.DevicesNs.SmsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmsEncodedLength extends js.Object {
  var byteCountLastSegment: scala.Double
  var bytesPerSegment: scala.Double
  var characterCountLastSegment: scala.Double
  var charactersPerSegment: scala.Double
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
    val __obj = js.Dynamic.literal(byteCountLastSegment = byteCountLastSegment, bytesPerSegment = bytesPerSegment, characterCountLastSegment = characterCountLastSegment, charactersPerSegment = charactersPerSegment, segmentCount = segmentCount)
  
    __obj.asInstanceOf[SmsEncodedLength]
  }
}

