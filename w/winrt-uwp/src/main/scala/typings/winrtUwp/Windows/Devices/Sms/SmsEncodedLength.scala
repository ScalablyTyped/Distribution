package typings.winrtUwp.Windows.Devices.Sms

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This structure represents information about the length of an SmsTextMessage object when it is encoded as a PDU. */
@js.native
trait SmsEncodedLength extends js.Object {
  
  /** The number of bytes in the last segment of the encoded message. */
  var byteCountLastSegment: Double = js.native
  
  /** The number of bytes in each segment of the message. */
  var bytesPerSegment: Double = js.native
  
  /** The number of characters in the last segment of the encoded message. */
  var characterCountLastSegment: Double = js.native
  
  /** The estimated number of characters that can fit in one segment of the message. */
  var charactersPerSegment: Double = js.native
  
  /** The number of segments needed to encode the message. */
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
