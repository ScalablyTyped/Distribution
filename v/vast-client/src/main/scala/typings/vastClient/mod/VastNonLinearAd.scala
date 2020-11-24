package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastNonLinearAd extends js.Object {
  
  var adParameters: String | Null = js.native
  
  var apiFramework: String = js.native
  
  var expandedHeight: String = js.native
  
  var expandedWidth: String = js.native
  
  var height: String = js.native
  
  var htmlResource: String | Null = js.native
  
  var id: String | Null = js.native
  
  var iframeResource: String | Null = js.native
  
  var maintainAspectRatio: Boolean = js.native
  
  var minSuggestedDuration: Double = js.native
  
  var nonLinearClickThroughURLTemplate: String | Null = js.native
  
  var nonLinearClickTrackingURLTemplates: js.Array[String] = js.native
  
  var scalable: Boolean = js.native
  
  var staticResource: String | Null = js.native
  
  var `type`: String | Null = js.native
  
  var width: String = js.native
}
object VastNonLinearAd {
  
  @scala.inline
  def apply(
    apiFramework: String,
    expandedHeight: String,
    expandedWidth: String,
    height: String,
    maintainAspectRatio: Boolean,
    minSuggestedDuration: Double,
    nonLinearClickTrackingURLTemplates: js.Array[String],
    scalable: Boolean,
    width: String
  ): VastNonLinearAd = {
    val __obj = js.Dynamic.literal(apiFramework = apiFramework.asInstanceOf[js.Any], expandedHeight = expandedHeight.asInstanceOf[js.Any], expandedWidth = expandedWidth.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maintainAspectRatio = maintainAspectRatio.asInstanceOf[js.Any], minSuggestedDuration = minSuggestedDuration.asInstanceOf[js.Any], nonLinearClickTrackingURLTemplates = nonLinearClickTrackingURLTemplates.asInstanceOf[js.Any], scalable = scalable.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastNonLinearAd]
  }
  
  @scala.inline
  implicit class VastNonLinearAdOps[Self <: VastNonLinearAd] (val x: Self) extends AnyVal {
    
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
    def setApiFramework(value: String): Self = this.set("apiFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedHeight(value: String): Self = this.set("expandedHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandedWidth(value: String): Self = this.set("expandedWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaintainAspectRatio(value: Boolean): Self = this.set("maintainAspectRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinSuggestedDuration(value: Double): Self = this.set("minSuggestedDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonLinearClickTrackingURLTemplatesVarargs(value: String*): Self = this.set("nonLinearClickTrackingURLTemplates", js.Array(value :_*))
    
    @scala.inline
    def setNonLinearClickTrackingURLTemplates(value: js.Array[String]): Self = this.set("nonLinearClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScalable(value: Boolean): Self = this.set("scalable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdParameters(value: String): Self = this.set("adParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdParametersNull: Self = this.set("adParameters", null)
    
    @scala.inline
    def setHtmlResource(value: String): Self = this.set("htmlResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlResourceNull: Self = this.set("htmlResource", null)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdNull: Self = this.set("id", null)
    
    @scala.inline
    def setIframeResource(value: String): Self = this.set("iframeResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeResourceNull: Self = this.set("iframeResource", null)
    
    @scala.inline
    def setNonLinearClickThroughURLTemplate(value: String): Self = this.set("nonLinearClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonLinearClickThroughURLTemplateNull: Self = this.set("nonLinearClickThroughURLTemplate", null)
    
    @scala.inline
    def setStaticResource(value: String): Self = this.set("staticResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticResourceNull: Self = this.set("staticResource", null)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
