package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastCompanionAd extends StObject {
  
  var altText: String | Null = js.native
  
  var companionClickThroughURLTemplate: String | Null = js.native
  
  var companionClickTrackingURLTemplate: js.UndefOr[String | Null] = js.native
  
  var companionClickTrackingURLTemplates: js.Array[String] = js.native
  
  var height: String = js.native
  
  var htmlResource: String | Null = js.native
  
  var id: String | Null = js.native
  
  var iframeResource: String | Null = js.native
  
  var staticResource: String | Null = js.native
  
  var trackingEvents: VastCompanionTrackingEvents = js.native
  
  var `type`: String | Null = js.native
  
  var width: String = js.native
}
object VastCompanionAd {
  
  @scala.inline
  def apply(
    companionClickTrackingURLTemplates: js.Array[String],
    height: String,
    trackingEvents: VastCompanionTrackingEvents,
    width: String
  ): VastCompanionAd = {
    val __obj = js.Dynamic.literal(companionClickTrackingURLTemplates = companionClickTrackingURLTemplates.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastCompanionAd]
  }
  
  @scala.inline
  implicit class VastCompanionAdMutableBuilder[Self <: VastCompanionAd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextNull: Self = StObject.set(x, "altText", null)
    
    @scala.inline
    def setCompanionClickThroughURLTemplate(value: String): Self = StObject.set(x, "companionClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionClickThroughURLTemplateNull: Self = StObject.set(x, "companionClickThroughURLTemplate", null)
    
    @scala.inline
    def setCompanionClickTrackingURLTemplate(value: String): Self = StObject.set(x, "companionClickTrackingURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionClickTrackingURLTemplateNull: Self = StObject.set(x, "companionClickTrackingURLTemplate", null)
    
    @scala.inline
    def setCompanionClickTrackingURLTemplateUndefined: Self = StObject.set(x, "companionClickTrackingURLTemplate", js.undefined)
    
    @scala.inline
    def setCompanionClickTrackingURLTemplates(value: js.Array[String]): Self = StObject.set(x, "companionClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionClickTrackingURLTemplatesVarargs(value: String*): Self = StObject.set(x, "companionClickTrackingURLTemplates", js.Array(value :_*))
    
    @scala.inline
    def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlResource(value: String): Self = StObject.set(x, "htmlResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlResourceNull: Self = StObject.set(x, "htmlResource", null)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = StObject.set(x, "id", null)
    
    @scala.inline
    def setIframeResource(value: String): Self = StObject.set(x, "iframeResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeResourceNull: Self = StObject.set(x, "iframeResource", null)
    
    @scala.inline
    def setStaticResource(value: String): Self = StObject.set(x, "staticResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticResourceNull: Self = StObject.set(x, "staticResource", null)
    
    @scala.inline
    def setTrackingEvents(value: VastCompanionTrackingEvents): Self = StObject.set(x, "trackingEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
