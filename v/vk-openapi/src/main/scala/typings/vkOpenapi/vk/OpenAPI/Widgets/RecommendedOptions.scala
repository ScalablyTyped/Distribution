package typings.vkOpenapi.vk.OpenAPI.Widgets

import typings.vkOpenapi.vkOpenapiStrings.day
import typings.vkOpenapi.vkOpenapiStrings.month
import typings.vkOpenapi.vkOpenapiStrings.week
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendedOptions extends StObject {
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var period: js.UndefOr[day | week | month] = js.undefined
}
object RecommendedOptions {
  
  inline def apply(): RecommendedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendedOptions]
  }
  
  extension [Self <: RecommendedOptions](x: Self) {
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setPeriod(value: day | week | month): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
  }
}
