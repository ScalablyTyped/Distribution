package typings.twilioVideo.tsdefTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AudioCodecSettings extends StObject {
  
  var codec: AudioCodec
}
object AudioCodecSettings {
  
  inline def apply(codec: AudioCodec): AudioCodecSettings = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[AudioCodecSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AudioCodecSettings] (val x: Self) extends AnyVal {
    
    inline def setCodec(value: AudioCodec): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
  }
}
