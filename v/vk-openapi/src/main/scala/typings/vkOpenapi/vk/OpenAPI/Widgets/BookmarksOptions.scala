package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vkOpenapiInts.`18`
import typings.vkOpenapi.vkOpenapiInts.`20`
import typings.vkOpenapi.vkOpenapiInts.`22`
import typings.vkOpenapi.vkOpenapiInts.`24`
import typings.vkOpenapi.vkOpenapiInts.`30`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarksOptions extends StObject {
  
  var height: js.UndefOr[`18` | `20` | `22` | `24` | `30`] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object BookmarksOptions {
  
  inline def apply(): BookmarksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarksOptions]
  }
  
  extension [Self <: BookmarksOptions](x: Self) {
    
    inline def setHeight(value: `18` | `20` | `22` | `24` | `30`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
