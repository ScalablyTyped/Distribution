package typings.twilioVideo.tsdefTypesMod

import typings.twilioVideo.twilioVideoStrings.VP8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VP8CodecSettings
  extends StObject
     with VideoCodecSettings {
  
  @JSName("codec")
  var codec_VP8CodecSettings: VP8
  
  var simulcast: js.UndefOr[Boolean] = js.undefined
}
object VP8CodecSettings {
  
  inline def apply(): VP8CodecSettings = {
    val __obj = js.Dynamic.literal(codec = "VP8")
    __obj.asInstanceOf[VP8CodecSettings]
  }
  
  extension [Self <: VP8CodecSettings](x: Self) {
    
    inline def setCodec(value: VP8): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setSimulcast(value: Boolean): Self = StObject.set(x, "simulcast", value.asInstanceOf[js.Any])
    
    inline def setSimulcastUndefined: Self = StObject.set(x, "simulcast", js.undefined)
  }
}
