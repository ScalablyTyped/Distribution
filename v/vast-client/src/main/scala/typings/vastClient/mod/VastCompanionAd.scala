package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastCompanionAd extends StObject {
  
  var altText: String | Null
  
  var companionClickThroughURLTemplate: String | Null
  
  var companionClickTrackingURLTemplate: js.UndefOr[String | Null] = js.undefined
  
  var companionClickTrackingURLTemplates: js.Array[VastUrlValue]
  
  var height: String
  
  var htmlResources: js.Array[String]
  
  var id: String | Null
  
  var iframeResources: js.Array[String]
  
  var staticResources: js.Array[StaticResource]
  
  var trackingEvents: VastCompanionTrackingEvents
  
  var width: String
}
object VastCompanionAd {
  
  inline def apply(
    companionClickTrackingURLTemplates: js.Array[VastUrlValue],
    height: String,
    htmlResources: js.Array[String],
    iframeResources: js.Array[String],
    staticResources: js.Array[StaticResource],
    trackingEvents: VastCompanionTrackingEvents,
    width: String
  ): VastCompanionAd = {
    val __obj = js.Dynamic.literal(companionClickTrackingURLTemplates = companionClickTrackingURLTemplates.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], htmlResources = htmlResources.asInstanceOf[js.Any], iframeResources = iframeResources.asInstanceOf[js.Any], staticResources = staticResources.asInstanceOf[js.Any], trackingEvents = trackingEvents.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], altText = null, companionClickThroughURLTemplate = null, id = null)
    __obj.asInstanceOf[VastCompanionAd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VastCompanionAd] (val x: Self) extends AnyVal {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setAltTextNull: Self = StObject.set(x, "altText", null)
    
    inline def setCompanionClickThroughURLTemplate(value: String): Self = StObject.set(x, "companionClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    inline def setCompanionClickThroughURLTemplateNull: Self = StObject.set(x, "companionClickThroughURLTemplate", null)
    
    inline def setCompanionClickTrackingURLTemplate(value: String): Self = StObject.set(x, "companionClickTrackingURLTemplate", value.asInstanceOf[js.Any])
    
    inline def setCompanionClickTrackingURLTemplateNull: Self = StObject.set(x, "companionClickTrackingURLTemplate", null)
    
    inline def setCompanionClickTrackingURLTemplateUndefined: Self = StObject.set(x, "companionClickTrackingURLTemplate", js.undefined)
    
    inline def setCompanionClickTrackingURLTemplates(value: js.Array[VastUrlValue]): Self = StObject.set(x, "companionClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    inline def setCompanionClickTrackingURLTemplatesVarargs(value: VastUrlValue*): Self = StObject.set(x, "companionClickTrackingURLTemplates", js.Array(value*))
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHtmlResources(value: js.Array[String]): Self = StObject.set(x, "htmlResources", value.asInstanceOf[js.Any])
    
    inline def setHtmlResourcesVarargs(value: String*): Self = StObject.set(x, "htmlResources", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIframeResources(value: js.Array[String]): Self = StObject.set(x, "iframeResources", value.asInstanceOf[js.Any])
    
    inline def setIframeResourcesVarargs(value: String*): Self = StObject.set(x, "iframeResources", js.Array(value*))
    
    inline def setStaticResources(value: js.Array[StaticResource]): Self = StObject.set(x, "staticResources", value.asInstanceOf[js.Any])
    
    inline def setStaticResourcesVarargs(value: StaticResource*): Self = StObject.set(x, "staticResources", js.Array(value*))
    
    inline def setTrackingEvents(value: VastCompanionTrackingEvents): Self = StObject.set(x, "trackingEvents", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
