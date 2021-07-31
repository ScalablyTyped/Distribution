package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vkOpenapiNumbers.`18`
import typings.vkOpenapi.vkOpenapiNumbers.`20`
import typings.vkOpenapi.vkOpenapiNumbers.`22`
import typings.vkOpenapi.vkOpenapiNumbers.`24`
import typings.vkOpenapi.vkOpenapiNumbers.`30`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BookmarksOptions extends StObject {
  
  var height: js.UndefOr[`18` | `20` | `22` | `24` | `30`] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object BookmarksOptions {
  
  @scala.inline
  def apply(): BookmarksOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BookmarksOptions]
  }
  
  @scala.inline
  implicit class BookmarksOptionsMutableBuilder[Self <: BookmarksOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: `18` | `20` | `22` | `24` | `30`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
