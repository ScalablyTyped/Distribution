package typings.winrt.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmsEncodedLength extends js.Object {
  var byteCountLastSegment: Double = js.native
  var bytesPerSegment: Double = js.native
  var characterCountLastSegment: Double = js.native
  var charactersPerSegment: Double = js.native
  var segmentCount: Double = js.native
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
  @scala.inline
  implicit class SmsEncodedLengthOps[Self <: SmsEncodedLength] (val x: Self) extends AnyVal {
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
    def setByteCountLastSegment(value: Double): Self = this.set("byteCountLastSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def setBytesPerSegment(value: Double): Self = this.set("bytesPerSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharacterCountLastSegment(value: Double): Self = this.set("characterCountLastSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharactersPerSegment(value: Double): Self = this.set("charactersPerSegment", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegmentCount(value: Double): Self = this.set("segmentCount", value.asInstanceOf[js.Any])
  }
  
}

