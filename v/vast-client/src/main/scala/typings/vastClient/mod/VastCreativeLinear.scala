package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastCreativeLinear
  extends StObject
     with VastCreative {
  
  var adParameters: String | Null
  
  var duration: Double
  
  var icons: js.Array[VastIcon]
  
  var mediaFiles: js.Array[VastMediaFile]
  
  var skipDelay: Double | Null
  
  var videoClickThroughURLTemplate: String | Null
  
  var videoClickTrackingURLTemplates: js.Array[String]
  
  var videoCustomClickURLTemplates: js.Array[String]
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
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], mediaFiles = mediaFiles.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], videoClickTrackingURLTemplates = videoClickTrackingURLTemplates.asInstanceOf[js.Any], videoCustomClickURLTemplates = videoCustomClickURLTemplates.asInstanceOf[js.Any], adId = null, adParameters = null, apiFramework = null, id = null, sequence = null, skipDelay = null, videoClickThroughURLTemplate = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeLinear]
  }
  
  @scala.inline
  implicit class VastCreativeLinearMutableBuilder[Self <: VastCreativeLinear] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdParameters(value: String): Self = StObject.set(x, "adParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdParametersNull: Self = StObject.set(x, "adParameters", null)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcons(value: js.Array[VastIcon]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconsVarargs(value: VastIcon*): Self = StObject.set(x, "icons", js.Array(value :_*))
    
    @scala.inline
    def setMediaFiles(value: js.Array[VastMediaFile]): Self = StObject.set(x, "mediaFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaFilesVarargs(value: VastMediaFile*): Self = StObject.set(x, "mediaFiles", js.Array(value :_*))
    
    @scala.inline
    def setSkipDelay(value: Double): Self = StObject.set(x, "skipDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSkipDelayNull: Self = StObject.set(x, "skipDelay", null)
    
    @scala.inline
    def setVideoClickThroughURLTemplate(value: String): Self = StObject.set(x, "videoClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoClickThroughURLTemplateNull: Self = StObject.set(x, "videoClickThroughURLTemplate", null)
    
    @scala.inline
    def setVideoClickTrackingURLTemplates(value: js.Array[String]): Self = StObject.set(x, "videoClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoClickTrackingURLTemplatesVarargs(value: String*): Self = StObject.set(x, "videoClickTrackingURLTemplates", js.Array(value :_*))
    
    @scala.inline
    def setVideoCustomClickURLTemplates(value: js.Array[String]): Self = StObject.set(x, "videoCustomClickURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideoCustomClickURLTemplatesVarargs(value: String*): Self = StObject.set(x, "videoCustomClickURLTemplates", js.Array(value :_*))
  }
}
