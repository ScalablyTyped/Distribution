package typings.twilioVideo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateLocalTracksOptions extends js.Object {
  
  var audio: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.native
  
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.native
  
  var video: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.native
}
object CreateLocalTracksOptions {
  
  @scala.inline
  def apply(): CreateLocalTracksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLocalTracksOptions]
  }
  
  @scala.inline
  implicit class CreateLocalTracksOptionsOps[Self <: CreateLocalTracksOptions] (val x: Self) extends AnyVal {
    
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
    def setAudio(value: Boolean | CreateLocalTrackOptions): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel | LogLevels): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setVideo(value: Boolean | CreateLocalTrackOptions): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
