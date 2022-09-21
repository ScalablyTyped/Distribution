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
  
  var videoClickThroughURLTemplate: VastUrlValue | Null
  
  var videoClickTrackingURLTemplates: js.Array[VastUrlValue]
  
  var videoCustomClickURLTemplates: js.Array[VastUrlValue]
}
object VastCreativeLinear {
  
  inline def apply(
    duration: Double,
    icons: js.Array[VastIcon],
    mediaFiles: js.Array[VastMediaFile],
    trackingEvents: VastTrackingEvents,
    `type`: String,
    videoClickTrackingURLTemplates: js.Array[VastUrlValue],
    videoCustomClickURLTemplates: js.Array[VastUrlValue]
  ): VastCreativeLinear = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], icons = icons.asInstanceOf[js.Any], mediaFiles = mediaFiles.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], videoClickTrackingURLTemplates = videoClickTrackingURLTemplates.asInstanceOf[js.Any], videoCustomClickURLTemplates = videoCustomClickURLTemplates.asInstanceOf[js.Any], adId = null, adParameters = null, apiFramework = null, id = null, sequence = null, skipDelay = null, videoClickThroughURLTemplate = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCreativeLinear]
  }
  
  extension [Self <: VastCreativeLinear](x: Self) {
    
    inline def setAdParameters(value: String): Self = StObject.set(x, "adParameters", value.asInstanceOf[js.Any])
    
    inline def setAdParametersNull: Self = StObject.set(x, "adParameters", null)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setIcons(value: js.Array[VastIcon]): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
    
    inline def setIconsVarargs(value: VastIcon*): Self = StObject.set(x, "icons", js.Array(value*))
    
    inline def setMediaFiles(value: js.Array[VastMediaFile]): Self = StObject.set(x, "mediaFiles", value.asInstanceOf[js.Any])
    
    inline def setMediaFilesVarargs(value: VastMediaFile*): Self = StObject.set(x, "mediaFiles", js.Array(value*))
    
    inline def setSkipDelay(value: Double): Self = StObject.set(x, "skipDelay", value.asInstanceOf[js.Any])
    
    inline def setSkipDelayNull: Self = StObject.set(x, "skipDelay", null)
    
    inline def setVideoClickThroughURLTemplate(value: VastUrlValue): Self = StObject.set(x, "videoClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    inline def setVideoClickThroughURLTemplateNull: Self = StObject.set(x, "videoClickThroughURLTemplate", null)
    
    inline def setVideoClickTrackingURLTemplates(value: js.Array[VastUrlValue]): Self = StObject.set(x, "videoClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    inline def setVideoClickTrackingURLTemplatesVarargs(value: VastUrlValue*): Self = StObject.set(x, "videoClickTrackingURLTemplates", js.Array(value*))
    
    inline def setVideoCustomClickURLTemplates(value: js.Array[VastUrlValue]): Self = StObject.set(x, "videoCustomClickURLTemplates", value.asInstanceOf[js.Any])
    
    inline def setVideoCustomClickURLTemplatesVarargs(value: VastUrlValue*): Self = StObject.set(x, "videoCustomClickURLTemplates", js.Array(value*))
  }
}
