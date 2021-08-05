package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vk.OpenAPI.NumericBoolean
import typings.vkOpenapi.vkOpenapiNumbers.`1`
import typings.vkOpenapi.vkOpenapiNumbers.`3`
import typings.vkOpenapi.vkOpenapiNumbers.`4`
import typings.vkOpenapi.vkOpenapiStrings.auto
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupOptions extends StObject {
  
  var color1: js.UndefOr[String] = js.undefined
  
  var color2: js.UndefOr[String] = js.undefined
  
  var color3: js.UndefOr[String] = js.undefined
  
  var height: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[`1` | `3` | `4`] = js.undefined
  
  var no_cover: js.UndefOr[NumericBoolean] = js.undefined
  
  var wide: js.UndefOr[NumericBoolean] = js.undefined
  
  var width: js.UndefOr[Double | auto] = js.undefined
}
object GroupOptions {
  
  inline def apply(): GroupOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupOptions]
  }
  
  extension [Self <: GroupOptions](x: Self) {
    
    inline def setColor1(value: String): Self = StObject.set(x, "color1", value.asInstanceOf[js.Any])
    
    inline def setColor1Undefined: Self = StObject.set(x, "color1", js.undefined)
    
    inline def setColor2(value: String): Self = StObject.set(x, "color2", value.asInstanceOf[js.Any])
    
    inline def setColor2Undefined: Self = StObject.set(x, "color2", js.undefined)
    
    inline def setColor3(value: String): Self = StObject.set(x, "color3", value.asInstanceOf[js.Any])
    
    inline def setColor3Undefined: Self = StObject.set(x, "color3", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setMode(value: `1` | `3` | `4`): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setNo_cover(value: NumericBoolean): Self = StObject.set(x, "no_cover", value.asInstanceOf[js.Any])
    
    inline def setNo_coverUndefined: Self = StObject.set(x, "no_cover", js.undefined)
    
    inline def setWide(value: NumericBoolean): Self = StObject.set(x, "wide", value.asInstanceOf[js.Any])
    
    inline def setWideUndefined: Self = StObject.set(x, "wide", js.undefined)
    
    inline def setWidth(value: Double | auto): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
