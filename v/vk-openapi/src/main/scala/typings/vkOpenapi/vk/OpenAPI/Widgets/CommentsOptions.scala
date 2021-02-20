package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommentsOptions extends StObject {
  
  var attach: js.UndefOr[String] = js.native
  
  var autoPublish: js.UndefOr[NumericBoolean] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var limit: js.UndefOr[Double] = js.native
  
  var norealtime: js.UndefOr[NumericBoolean] = js.native
  
  var pageUrl: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object CommentsOptions {
  
  @scala.inline
  def apply(): CommentsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommentsOptions]
  }
  
  @scala.inline
  implicit class CommentsOptionsMutableBuilder[Self <: CommentsOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttach(value: String): Self = StObject.set(x, "attach", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttachUndefined: Self = StObject.set(x, "attach", js.undefined)
    
    @scala.inline
    def setAutoPublish(value: NumericBoolean): Self = StObject.set(x, "autoPublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoPublishUndefined: Self = StObject.set(x, "autoPublish", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setNorealtime(value: NumericBoolean): Self = StObject.set(x, "norealtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNorealtimeUndefined: Self = StObject.set(x, "norealtime", js.undefined)
    
    @scala.inline
    def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
