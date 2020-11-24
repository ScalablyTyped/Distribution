package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastCreativeLinear extends VastCreative {
  
  var adParameters: String | Null = js.native
  
  var duration: Double = js.native
  
  var icons: js.Array[VastIcon] = js.native
  
  var mediaFiles: js.Array[VastMediaFile] = js.native
  
  var skipDelay: Double | Null = js.native
  
  var videoClickThroughURLTemplate: String | Null = js.native
  
  var videoClickTrackingURLTemplates: js.Array[String] = js.native
  
  var videoCustomClickURLTemplates: js.Array[String] = js.native
}
object VastCreativeLinear {
  
  @scala.inline
  def apply(
    duration: Double,
    icons: js.Array[VastIcon],
    mediaFiles: js.Array[VastMediaFile],
    trackingEvents: VastTrackingEvents,
    `type`: String,
    videoClickTrackingURLTemplates: js.Array[String],
    videoCustomClickURLTemplates: js.Array[String]
  ): VastCreativeLinear = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], mediaFiles = mediaFiles.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], videoClickTrackingURLTemplates = videoClickTrackingURLTemplates.asInstanceOf[js.Any], videoCustomClickURLTemplates = videoCustomClickURLTemplates.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeLinear]
  }
  
  @scala.inline
  implicit class VastCreativeLinearOps[Self <: VastCreativeLinear] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsVarargs(value: VastIcon*): Self = this.set("icons", js.Array(value :_*))
    
    @scala.inline
    def setIcons(value: js.Array[VastIcon]): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaFilesVarargs(value: VastMediaFile*): Self = this.set("mediaFiles", js.Array(value :_*))
    
    @scala.inline
    def setMediaFiles(value: js.Array[VastMediaFile]): Self = this.set("mediaFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoClickTrackingURLTemplatesVarargs(value: String*): Self = this.set("videoClickTrackingURLTemplates", js.Array(value :_*))
    
    @scala.inline
    def setVideoClickTrackingURLTemplates(value: js.Array[String]): Self = this.set("videoClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCustomClickURLTemplatesVarargs(value: String*): Self = this.set("videoCustomClickURLTemplates", js.Array(value :_*))
    
    @scala.inline
    def setVideoCustomClickURLTemplates(value: js.Array[String]): Self = this.set("videoCustomClickURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdParameters(value: String): Self = this.set("adParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdParametersNull: Self = this.set("adParameters", null)
    
    @scala.inline
    def setSkipDelay(value: Double): Self = this.set("skipDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipDelayNull: Self = this.set("skipDelay", null)
    
    @scala.inline
    def setVideoClickThroughURLTemplate(value: String): Self = this.set("videoClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoClickThroughURLTemplateNull: Self = this.set("videoClickThroughURLTemplate", null)
  }
}
