package typings.twilioVideo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BandwidthProfileOptions extends StObject {
  
  var video: js.UndefOr[VideoBandwidthProfileOptions] = js.undefined
}
object BandwidthProfileOptions {
  
  @scala.inline
  def apply(): BandwidthProfileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandwidthProfileOptions]
  }
  
  @scala.inline
  implicit class BandwidthProfileOptionsMutableBuilder[Self <: BandwidthProfileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVideo(value: VideoBandwidthProfileOptions): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
