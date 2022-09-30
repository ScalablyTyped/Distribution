package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import typings.vkOpenapi.vkOpenapiInts.`18`
import typings.vkOpenapi.vkOpenapiInts.`20`
import typings.vkOpenapi.vkOpenapiInts.`22`
import typings.vkOpenapi.vkOpenapiInts.`24`
import typings.vkOpenapi.vkOpenapiInts.`30`
import typings.vkOpenapi.vkOpenapiStrings.button
import typings.vkOpenapi.vkOpenapiStrings.full
import typings.vkOpenapi.vkOpenapiStrings.mini
import typings.vkOpenapi.vkOpenapiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LikeOptions extends StObject {
  
  var height: js.UndefOr[`18` | `20` | `22` | `24` | `30`] = js.undefined
  
  var pageImage: js.UndefOr[String] = js.undefined
  
  var pageTitle: js.UndefOr[String] = js.undefined
  
  var pageUrl: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[button | mini | vertical | full] = js.undefined
  
  var verb: js.UndefOr[NumericBoolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object LikeOptions {
  
  inline def apply(): LikeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LikeOptions]
  }
  
  extension [Self <: LikeOptions](x: Self) {
    
    inline def setHeight(value: `18` | `20` | `22` | `24` | `30`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPageImage(value: String): Self = StObject.set(x, "pageImage", value.asInstanceOf[js.Any])
    
    inline def setPageImageUndefined: Self = StObject.set(x, "pageImage", js.undefined)
    
    inline def setPageTitle(value: String): Self = StObject.set(x, "pageTitle", value.asInstanceOf[js.Any])
    
    inline def setPageTitleUndefined: Self = StObject.set(x, "pageTitle", js.undefined)
    
    inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    
    inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    inline def setType(value: button | mini | vertical | full): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setVerb(value: NumericBoolean): Self = StObject.set(x, "verb", value.asInstanceOf[js.Any])
    
    inline def setVerbUndefined: Self = StObject.set(x, "verb", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
