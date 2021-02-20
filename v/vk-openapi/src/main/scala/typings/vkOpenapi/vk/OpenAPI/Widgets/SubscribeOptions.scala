package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeOptions extends StObject {
  
  var mode: js.UndefOr[NumericBoolean] = js.native
  
  var soft: js.UndefOr[NumericBoolean] = js.native
}
object SubscribeOptions {
  
  @scala.inline
  def apply(): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeOptions]
  }
  
  @scala.inline
  implicit class SubscribeOptionsMutableBuilder[Self <: SubscribeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: NumericBoolean): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSoft(value: NumericBoolean): Self = StObject.set(x, "soft", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSoftUndefined: Self = StObject.set(x, "soft", js.undefined)
  }
}
