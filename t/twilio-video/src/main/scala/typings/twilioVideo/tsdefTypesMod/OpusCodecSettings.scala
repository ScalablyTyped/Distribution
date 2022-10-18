package typings.twilioVideo.tsdefTypesMod

import typings.twilioVideo.twilioVideoStrings.opus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpusCodecSettings
  extends StObject
     with AudioCodecSettings {
  
  @JSName("codec")
  var codec_OpusCodecSettings: opus
  
  var dtx: js.UndefOr[Boolean] = js.undefined
}
object OpusCodecSettings {
  
  inline def apply(): OpusCodecSettings = {
    val __obj = js.Dynamic.literal(codec = "opus")
    __obj.asInstanceOf[OpusCodecSettings]
  }
  
  extension [Self <: OpusCodecSettings](x: Self) {
    
    inline def setCodec(value: opus): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    inline def setDtx(value: Boolean): Self = StObject.set(x, "dtx", value.asInstanceOf[js.Any])
    
    inline def setDtxUndefined: Self = StObject.set(x, "dtx", js.undefined)
  }
}
