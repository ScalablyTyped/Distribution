package typings.vkOpenapi.vk.OpenAPI.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PollOptions extends StObject {
  
  var pageUrl: js.UndefOr[String] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object PollOptions {
  
  inline def apply(): PollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollOptions]
  }
  
  extension [Self <: PollOptions](x: Self) {
    
    inline def setPageUrl(value: String): Self = StObject.set(x, "pageUrl", value.asInstanceOf[js.Any])
    
    inline def setPageUrlUndefined: Self = StObject.set(x, "pageUrl", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
