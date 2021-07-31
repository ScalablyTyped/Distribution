package typings.winrtUwp.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This structure represents information about the length of an SmsTextMessage object when it is encoded as a PDU. */
trait SmsEncodedLength extends StObject {
  
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
  
  @scala.inline
  implicit class SmsEncodedLengthMutableBuilder[Self <: SmsEncodedLength] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setByteCountLastSegment(value: Double): Self = StObject.set(x, "byteCountLastSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesPerSegment(value: Double): Self = StObject.set(x, "bytesPerSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharacterCountLastSegment(value: Double): Self = StObject.set(x, "characterCountLastSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCharactersPerSegment(value: Double): Self = StObject.set(x, "charactersPerSegment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentCount(value: Double): Self = StObject.set(x, "segmentCount", value.asInstanceOf[js.Any])
  }
}
