package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import typings.vkOpenapi.vkOpenapiNumbers.`1`
import typings.vkOpenapi.vkOpenapiNumbers.`3`
import typings.vkOpenapi.vkOpenapiNumbers.`4`
import typings.vkOpenapi.vkOpenapiStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupOptions extends StObject {
  
  var color1: js.UndefOr[String] = js.native
  
  var color2: js.UndefOr[String] = js.native
  
  var color3: js.UndefOr[String] = js.native
  
  var height: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[`1` | `3` | `4`] = js.native
  
  var no_cover: js.UndefOr[NumericBoolean] = js.native
  
  var wide: js.UndefOr[NumericBoolean] = js.native
  
  var width: js.UndefOr[Double | auto] = js.native
}
object GroupOptions {
  
  @scala.inline
  def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  
  @scala.inline
  implicit class GroupOptionsMutableBuilder[Self <: GroupOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor1(value: String): Self = StObject.set(x, "color1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor1Undefined: Self = StObject.set(x, "color1", js.undefined)
    
    @scala.inline
    def setColor2(value: String): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor2Undefined: Self = StObject.set(x, "color2", js.undefined)
    
    @scala.inline
    def setColor3(value: String): Self = StObject.set(x, "color3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor3Undefined: Self = StObject.set(x, "color3", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setMode(value: `1` | `3` | `4`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setNo_cover(value: NumericBoolean): Self = StObject.set(x, "no_cover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNo_coverUndefined: Self = StObject.set(x, "no_cover", js.undefined)
    
    @scala.inline
    def setWide(value: NumericBoolean): Self = StObject.set(x, "wide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWideUndefined: Self = StObject.set(x, "wide", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
