package typings.vkOpenapi.vk.OpenAPI.Widgets

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PollOptions extends StObject {
  
  var pageUrl: js.UndefOr[String] = js.native
  
  var width: js.UndefOr[Double] = js.native
}
object PollOptions {
  
  @scala.inline
  def apply(): PollOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PollOptions]
  }
  
  @scala.inline
  implicit class PollOptionsMutableBuilder[Self <: PollOptions] (val x: Self) extends AnyVal {
    
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
