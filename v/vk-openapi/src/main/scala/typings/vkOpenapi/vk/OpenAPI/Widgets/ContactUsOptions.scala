package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vkOpenapiNumbers.`18`
import typings.vkOpenapi.vkOpenapiNumbers.`20`
import typings.vkOpenapi.vkOpenapiNumbers.`22`
import typings.vkOpenapi.vkOpenapiNumbers.`24`
import typings.vkOpenapi.vkOpenapiNumbers.`30`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContactUsOptions extends StObject {
  
  var height: js.UndefOr[`18` | `20` | `22` | `24` | `30`] = js.undefined
  
  var text: js.UndefOr[String] = js.undefined
}
object ContactUsOptions {
  
  inline def apply(): ContactUsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactUsOptions]
  }
  
  extension [Self <: ContactUsOptions](x: Self) {
    
    inline def setHeight(value: `18` | `20` | `22` | `24` | `30`): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
