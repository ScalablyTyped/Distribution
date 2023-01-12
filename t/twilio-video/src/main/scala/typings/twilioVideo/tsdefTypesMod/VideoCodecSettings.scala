package typings.twilioVideo.tsdefTypesMod

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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VideoCodecSettings] (val x: Self) extends AnyVal {
    
    inline def setCodec(value: VideoCodec): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
  }
}
