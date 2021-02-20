package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vkOpenapiNumbers.`1`
import typings.vkOpenapi.vkOpenapiNumbers.`2`
import typings.vkOpenapi.vkOpenapiNumbers.`3`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppOptions extends StObject {
  
  var height: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[`1` | `2` | `3`] = js.native
}
object AppOptions {
  
  @scala.inline
  def apply(): AppOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppOptions]
  }
  
  @scala.inline
  implicit class AppOptionsMutableBuilder[Self <: AppOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMode(value: `1` | `2` | `3`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
