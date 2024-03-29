package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vkOpenapiInts.`22`
import typings.vkOpenapi.vkOpenapiInts.`24`
import typings.vkOpenapi.vkOpenapiInts.`30`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowMessagesFromCommunityOptions extends StObject {
  
  var height: js.UndefOr[`22` | `24` | `30`] = js.undefined
}
object AllowMessagesFromCommunityOptions {
  
  inline def apply(): AllowMessagesFromCommunityOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowMessagesFromCommunityOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AllowMessagesFromCommunityOptions] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: `22` | `24` | `30`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
  }
}
