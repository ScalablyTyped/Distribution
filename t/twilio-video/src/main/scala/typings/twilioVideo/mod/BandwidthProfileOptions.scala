package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BandwidthProfileOptions extends js.Object {
  
  var video: js.UndefOr[VideoBandwidthProfileOptions] = js.native
}
object BandwidthProfileOptions {
  
  @scala.inline
  def apply(): BandwidthProfileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BandwidthProfileOptions]
  }
  
  @scala.inline
  implicit class BandwidthProfileOptionsOps[Self <: BandwidthProfileOptions] (val x: Self) extends AnyVal {
    
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
    def setVideo(value: VideoBandwidthProfileOptions): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
