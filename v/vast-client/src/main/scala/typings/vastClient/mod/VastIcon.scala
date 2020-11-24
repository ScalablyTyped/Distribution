package typings.vastClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastIcon extends js.Object {
  
  var apiFramework: String | Null = js.native
  
  var duration: Double = js.native
  
  var height: Double = js.native
  
  var htmlResource: String | Null = js.native
  
  var iconClickThroughURLTemplate: String | Null = js.native
  
  var iconClickTrackingURLTemplates: js.Array[String] = js.native
  
  var iconViewTrackingURLTemplate: String | Null = js.native
  
  var iframeResource: String | Null = js.native
  
  var offset: String | Null = js.native
  
  var program: String | Null = js.native
  
  var staticResource: String | Null = js.native
  
  var `type`: String | Null = js.native
  
  var width: Double = js.native
  
  var xPosition: Double = js.native
  
  var yPosition: Double = js.native
}
object VastIcon {
  
  @scala.inline
  def apply(
    duration: Double,
    height: Double,
    iconClickTrackingURLTemplates: js.Array[String],
    width: Double,
    xPosition: Double,
    yPosition: Double
  ): VastIcon = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], iconClickTrackingURLTemplates = iconClickTrackingURLTemplates.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], xPosition = xPosition.asInstanceOf[js.Any], yPosition = yPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[VastIcon]
  }
  
  @scala.inline
  implicit class VastIconOps[Self <: VastIcon] (val x: Self) extends AnyVal {
    
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
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClickTrackingURLTemplatesVarargs(value: String*): Self = this.set("iconClickTrackingURLTemplates", js.Array(value :_*))
    
    @scala.inline
    def setIconClickTrackingURLTemplates(value: js.Array[String]): Self = this.set("iconClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPosition(value: Double): Self = this.set("xPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPosition(value: Double): Self = this.set("yPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiFramework(value: String): Self = this.set("apiFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiFrameworkNull: Self = this.set("apiFramework", null)
    
    @scala.inline
    def setHtmlResource(value: String): Self = this.set("htmlResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlResourceNull: Self = this.set("htmlResource", null)
    
    @scala.inline
    def setIconClickThroughURLTemplate(value: String): Self = this.set("iconClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClickThroughURLTemplateNull: Self = this.set("iconClickThroughURLTemplate", null)
    
    @scala.inline
    def setIconViewTrackingURLTemplate(value: String): Self = this.set("iconViewTrackingURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconViewTrackingURLTemplateNull: Self = this.set("iconViewTrackingURLTemplate", null)
    
    @scala.inline
    def setIframeResource(value: String): Self = this.set("iframeResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeResourceNull: Self = this.set("iframeResource", null)
    
    @scala.inline
    def setOffset(value: String): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetNull: Self = this.set("offset", null)
    
    @scala.inline
    def setProgram(value: String): Self = this.set("program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramNull: Self = this.set("program", null)
    
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
