package typings.vastClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VastIcon extends StObject {
  
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
  implicit class VastIconMutableBuilder[Self <: VastIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiFramework(value: String): Self = StObject.set(x, "apiFramework", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiFrameworkNull: Self = StObject.set(x, "apiFramework", null)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlResource(value: String): Self = StObject.set(x, "htmlResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlResourceNull: Self = StObject.set(x, "htmlResource", null)
    
    @scala.inline
    def setIconClickThroughURLTemplate(value: String): Self = StObject.set(x, "iconClickThroughURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClickThroughURLTemplateNull: Self = StObject.set(x, "iconClickThroughURLTemplate", null)
    
    @scala.inline
    def setIconClickTrackingURLTemplates(value: js.Array[String]): Self = StObject.set(x, "iconClickTrackingURLTemplates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconClickTrackingURLTemplatesVarargs(value: String*): Self = StObject.set(x, "iconClickTrackingURLTemplates", js.Array(value :_*))
    
    @scala.inline
    def setIconViewTrackingURLTemplate(value: String): Self = StObject.set(x, "iconViewTrackingURLTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconViewTrackingURLTemplateNull: Self = StObject.set(x, "iconViewTrackingURLTemplate", null)
    
    @scala.inline
    def setIframeResource(value: String): Self = StObject.set(x, "iframeResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIframeResourceNull: Self = StObject.set(x, "iframeResource", null)
    
    @scala.inline
    def setOffset(value: String): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetNull: Self = StObject.set(x, "offset", null)
    
    @scala.inline
    def setProgram(value: String): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgramNull: Self = StObject.set(x, "program", null)
    
    @scala.inline
    def setStaticResource(value: String): Self = StObject.set(x, "staticResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStaticResourceNull: Self = StObject.set(x, "staticResource", null)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeNull: Self = StObject.set(x, "type", null)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXPosition(value: Double): Self = StObject.set(x, "xPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYPosition(value: Double): Self = StObject.set(x, "yPosition", value.asInstanceOf[js.Any])
  }
}
