package typings.winrt.Windows.Devices.Sms

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmsEncodedLength extends StObject {
  
  var byteCountLastSegment: Double
  
  var bytesPerSegment: Double
  
  var characterCountLastSegment: Double
  
  var charactersPerSegment: Double
  
  var segmentCount: Double
}
object SmsEncodedLength {
  
  inline def apply(
    byteCountLastSegment: Double,
    bytesPerSegment: Double,
    characterCountLastSegment: Double,
    charactersPerSegment: Double,
    segmentCount: Double
  ): SmsEncodedLength = {
    val __obj = js.Dynamic.literal(byteCountLastSegment = byteCountLastSegment.asInstanceOf[js.Any], bytesPerSegment = bytesPerSegment.asInstanceOf[js.Any], characterCountLastSegment = characterCountLastSegment.asInstanceOf[js.Any], charactersPerSegment = charactersPerSegment.asInstanceOf[js.Any], segmentCount = segmentCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmsEncodedLength]
  }
  
  extension [Self <: SmsEncodedLength](x: Self) {
    
    inline def setByteCountLastSegment(value: Double): Self = StObject.set(x, "byteCountLastSegment", value.asInstanceOf[js.Any])
    
    inline def setBytesPerSegment(value: Double): Self = StObject.set(x, "bytesPerSegment", value.asInstanceOf[js.Any])
    
    inline def setCharacterCountLastSegment(value: Double): Self = StObject.set(x, "characterCountLastSegment", value.asInstanceOf[js.Any])
    
    inline def setCharactersPerSegment(value: Double): Self = StObject.set(x, "charactersPerSegment", value.asInstanceOf[js.Any])
    
    inline def setSegmentCount(value: Double): Self = StObject.set(x, "segmentCount", value.asInstanceOf[js.Any])
  }
}
