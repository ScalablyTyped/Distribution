package typings.twilioVideo.mod

import typings.twilioVideo.twilioVideoStrings.VP8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VP8CodecSettings extends VideoCodecSettings {
  
  @JSName("codec")
  var codec_VP8CodecSettings: VP8 = js.native
  
  var simulcast: js.UndefOr[Boolean] = js.native
}
object VP8CodecSettings {
  
  @scala.inline
  def apply(codec: VP8): VP8CodecSettings = {
    val __obj = js.Dynamic.literal(codec = codec.asInstanceOf[js.Any])
    __obj.asInstanceOf[VP8CodecSettings]
  }
  
  @scala.inline
  implicit class VP8CodecSettingsMutableBuilder[Self <: VP8CodecSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodec(value: VP8): Self = StObject.set(x, "codec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulcast(value: Boolean): Self = StObject.set(x, "simulcast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSimulcastUndefined: Self = StObject.set(x, "simulcast", js.undefined)
  }
}
