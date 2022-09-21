package typings.yelpFusionPlus.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// base interfaces\
trait BusinessesSearchRequest extends StObject {
  
  var attributes: js.UndefOr[String] = js.undefined
  
  var categories: js.UndefOr[String] = js.undefined
  
  var limit: js.UndefOr[Double] = js.undefined
  
  var locale: js.UndefOr[String] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var open_at: js.UndefOr[Double] = js.undefined
  
  var open_now: js.UndefOr[Boolean] = js.undefined
  
  var price: js.UndefOr[String] = js.undefined
  
  var radius: js.UndefOr[Double] = js.undefined
  
  var sort_by: js.UndefOr[String] = js.undefined
  
  var term: js.UndefOr[String] = js.undefined
}
object BusinessesSearchRequest {
  
  inline def apply(): BusinessesSearchRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BusinessesSearchRequest]
  }
  
  extension [Self <: BusinessesSearchRequest](x: Self) {
    
    inline def setAttributes(value: String): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setCategories(value: String): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setLimit(value: Double): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    
    inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setOpen_at(value: Double): Self = StObject.set(x, "open_at", value.asInstanceOf[js.Any])
    
    inline def setOpen_atUndefined: Self = StObject.set(x, "open_at", js.undefined)
    
    inline def setOpen_now(value: Boolean): Self = StObject.set(x, "open_now", value.asInstanceOf[js.Any])
    
    inline def setOpen_nowUndefined: Self = StObject.set(x, "open_now", js.undefined)
    
    inline def setPrice(value: String): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    
    inline def setPriceUndefined: Self = StObject.set(x, "price", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSort_by(value: String): Self = StObject.set(x, "sort_by", value.asInstanceOf[js.Any])
    
    inline def setSort_byUndefined: Self = StObject.set(x, "sort_by", js.undefined)
    
    inline def setTerm(value: String): Self = StObject.set(x, "term", value.asInstanceOf[js.Any])
    
    inline def setTermUndefined: Self = StObject.set(x, "term", js.undefined)
  }
}
