package typings.twilioVideo.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoCodecSettings extends StObject {
  
  var codec: VideoCodec
}
object VideoCodecSettings {
  
  inline def apply(codec: VideoCodec): VideoCodecSettings = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoCodecSettings]
  }
  
  extension [Self <: VideoCodecSettings](x: Self) {
    
    inline def setCodec(value: VideoCodec): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
  }
}
