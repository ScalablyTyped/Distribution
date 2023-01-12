package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  var fields: js.UndefOr[ArrayOrValue[FieldParam]] = js.undefined
  
  var filter: js.UndefOr[ArrayOrValue[FilterParam]] = js.undefined
  
  var formats: js.UndefOr[ArrayOrValue[FormatParam]] = js.undefined
  
  var include: js.UndefOr[ArrayOrValue[IncludeParam]] = js.undefined
  
  var limit: js.UndefOr[ArrayOrValue[LimitParam]] = js.undefined
  
  var order: js.UndefOr[ArrayOrValue[OrderParam]] = js.undefined
  
  var page: js.UndefOr[ArrayOrValue[PageParam]] = js.undefined
}
object Params {
  
  inline def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
    
    inline def setFields(value: ArrayOrValue[FieldParam]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: FieldParam*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFilter(value: ArrayOrValue[FilterParam]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: FilterParam*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setFormats(value: ArrayOrValue[FormatParam]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    inline def setFormatsVarargs(value: FormatParam*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def setInclude(value: ArrayOrValue[IncludeParam]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setIncludeVarargs(value: IncludeParam*): Self = StObject.set(x, "include", js.Array(value*))
    
    inline def setLimit(value: ArrayOrValue[LimitParam]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLimitVarargs(value: LimitParam*): Self = StObject.set(x, "limit", js.Array(value*))
    
    inline def setOrder(value: ArrayOrValue[OrderParam]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: OrderParam*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setPage(value: ArrayOrValue[PageParam]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    inline def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    inline def setPageVarargs(value: PageParam*): Self = StObject.set(x, "page", js.Array(value*))
  }
}
