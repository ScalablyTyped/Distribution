package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import typings.vkOpenapi.vkOpenapiNumbers.`18`
import typings.vkOpenapi.vkOpenapiNumbers.`20`
import typings.vkOpenapi.vkOpenapiNumbers.`22`
import typings.vkOpenapi.vkOpenapiNumbers.`24`
import typings.vkOpenapi.vkOpenapiNumbers.`30`
import typings.vkOpenapi.vkOpenapiStrings.button
import typings.vkOpenapi.vkOpenapiStrings.full
import typings.vkOpenapi.vkOpenapiStrings.mini
import typings.vkOpenapi.vkOpenapiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LikeOptions extends StObject {
  
  var height: js.UndefOr[`18` | `20` | `22` | `24` | `30`] = js.native
  
  var pageImage: js.UndefOr[String] = js.native
  
  var pageTitle: js.UndefOr[String] = js.native
  
  var pageUrl: js.UndefOr[String] = js.native
  
  var `type`: js.UndefOr[button | mini | vertical | full] = js.native
  
  var verb: js.UndefOr[NumericBoolean] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object LikeOptions {
  
  @scala.inline
  def apply(): LikeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LikeOptions]
  }
  
  @scala.inline
  implicit class LikeOptionsMutableBuilder[Self <: LikeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: `18` | `20` | `22` | `24` | `30`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPageImage(value: String): Self = StObject.set(x, "pageImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageImageUndefined: Self = StObject.set(x, "pageImage", js.undefined)
    
    @scala.inline
    def setPageTitle(value: String): Self = StObject.set(x, "pageTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageTitleUndefined: Self = StObject.set(x, "pageTitle", js.undefined)
    
    @scala.inline
    def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    @scala.inline
    def setType(value: button | mini | vertical | full): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setVerb(value: NumericBoolean): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
