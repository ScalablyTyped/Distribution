package typings.twilioVideo.mod

import typings.twilioVideo.mod.VideoTrack.Dimensions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoRenderDimensions extends js.Object {
  
  var high: js.UndefOr[Dimensions] = js.native
  
  var low: js.UndefOr[Dimensions] = js.native
  
  var standard: js.UndefOr[Dimensions] = js.native
}
object VideoRenderDimensions {
  
  @scala.inline
  def apply(): VideoRenderDimensions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoRenderDimensions]
  }
  
  @scala.inline
  implicit class VideoRenderDimensionsOps[Self <: VideoRenderDimensions] (val x: Self) extends AnyVal {
    
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
    def setHigh(value: Dimensions): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    
    @scala.inline
    def setLow(value: Dimensions): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    
    @scala.inline
    def setStandard(value: Dimensions): Self = this.set("standard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandard: Self = this.set("standard", js.undefined)
  }
}
