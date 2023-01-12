package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VastNonLinearAd extends StObject {
  
  var adParameters: String | Null
  
  var apiFramework: String
  
  var expandedHeight: String
  
  var expandedWidth: String
  
  var height: String
  
  var htmlResource: String | Null
  
  var id: String | Null
  
  var iframeResource: String | Null
  
  var maintainAspectRatio: Boolean
  
  var minSuggestedDuration: Double
  
  var nonLinearClickThroughURLTemplate: String | Null
  
  var nonLinearClickTrackingURLTemplates: js.Array[VastUrlValue]
  
  var scalable: Boolean
  
  var staticResource: String | Null
  
  var `type`: String | Null
  
  var width: String
}
object VastNonLinearAd {
  
  inline def apply(
    apiFramework: String,
    expandedHeight: String,
    expandedWidth: String,
    height: String,
    maintainAspectRatio: Boolean,
    minSuggestedDuration: Double,
    nonLinearClickTrackingURLTemplates: js.Array[VastUrlValue],
    scalable: Boolean,
    width: String
  ): VastNonLinearAd = {
    val __obj = js.Dynamic.literal(apiFramework = apiFramework.asInstanceOf[js.Any], expandedHeight = expandedHeight.asInstanceOf[js.Any], expandedWidth = expandedWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maintainAspectRatio = maintainAspectRatio.asInstanceOf[js.Any], minSuggestedDuration = minSuggestedDuration.asInstanceOf[js.Any], nonLinearClickTrackingURLTemplates = nonLinearClickTrackingURLTemplates.asInstanceOf[js.Any], scalable = scalable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], adParameters = null, htmlResource = null, id = null, iframeResource = null, nonLinearClickThroughURLTemplate = null, staticResource = null)
    __obj.updateDynamic("type")(null)
    __obj.asInstanceOf[VastNonLinearAd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VastNonLinearAd] (val x: Self) extends AnyVal {
    
    inline def setAdParameters(value: String): Self = StObject.set(x, "adParameters", value.asInstanceOf[js.Any])
    
    inline def setAdParametersNull: Self = StObject.set(x, "adParameters", null)
    
    inline def setApiFramework(value: String): Self = StObject.set(x, "apiFramework", value.asInstanceOf[js.Any])
    
    inline def setExpandedHeight(value: String): Self = StObject.set(x, "expandedHeight", value.asInstanceOf[js.Any])
    
    inline def setExpandedWidth(value: String): Self = StObject.set(x, "expandedWidth", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHtmlResource(value: String): Self = StObject.set(x, "htmlResource", value.asInstanceOf[js.Any])
    
    inline def setHtmlResourceNull: Self = StObject.set(x, "htmlResource", null)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdNull: Self = StObject.set(x, "id", null)
    
    inline def setIframeResource(value: String): Self = StObject.set(x, "iframeResource", value.asInstanceOf[js.Any])
    
    inline def setIframeResourceNull: Self = StObject.set(x, "iframeResource", null)
    
    inline def setMaintainAspectRatio(value: Boolean): Self = StObject.set(x, "maintainAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setMinSuggestedDuration(value: Double): Self = StObject.set(x, "minSuggestedDuration", value.asInstanceOf[js.Any])
    
    inline def setNonLinearClickThroughURLTemplate(value: String): Self = StObject.set(x, "nonLinearClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    inline def setNonLinearClickThroughURLTemplateNull: Self = StObject.set(x, "nonLinearClickThroughURLTemplate", null)
    
    inline def setNonLinearClickTrackingURLTemplates(value: js.Array[VastUrlValue]): Self = StObject.set(x, "nonLinearClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    inline def setNonLinearClickTrackingURLTemplatesVarargs(value: VastUrlValue*): Self = StObject.set(x, "nonLinearClickTrackingURLTemplates", js.Array(value*))
    
    inline def setScalable(value: Boolean): Self = StObject.set(x, "scalable", value.asInstanceOf[js.Any])
    
    inline def setStaticResource(value: String): Self = StObject.set(x, "staticResource", value.asInstanceOf[js.Any])
    
    inline def setStaticResourceNull: Self = StObject.set(x, "staticResource", null)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
