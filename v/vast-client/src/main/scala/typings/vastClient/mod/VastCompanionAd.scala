package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastCompanionAd extends js.Object {
  
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
  implicit class VastCompanionAdOps[Self <: VastCompanionAd] (val x: Self) extends AnyVal {
    
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
    def setCompanionClickTrackingURLTemplatesVarargs(value: String*): Self = this.set("companionClickTrackingURLTemplates", js.Array(value :_*))
    
    @scala.inline
    def setCompanionClickTrackingURLTemplates(value: js.Array[String]): Self = this.set("companionClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingEvents(value: VastCompanionTrackingEvents): Self = this.set("trackingEvents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltText(value: String): Self = this.set("altText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltTextNull: Self = this.set("altText", null)
    
    @scala.inline
    def setCompanionClickThroughURLTemplate(value: String): Self = this.set("companionClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompanionClickThroughURLTemplateNull: Self = this.set("companionClickThroughURLTemplate", null)
    
    @scala.inline
    def setCompanionClickTrackingURLTemplate(value: String): Self = this.set("companionClickTrackingURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompanionClickTrackingURLTemplate: Self = this.set("companionClickTrackingURLTemplate", js.undefined)
    
    @scala.inline
    def setCompanionClickTrackingURLTemplateNull: Self = this.set("companionClickTrackingURLTemplate", null)
    
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
    def setStaticResource(value: String): Self = this.set("staticResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticResourceNull: Self = this.set("staticResource", null)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = this.set("type", null)
  }
}
