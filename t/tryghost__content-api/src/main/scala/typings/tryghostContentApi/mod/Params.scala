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
  
  @scala.inline
  def apply(): Params = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Params]
  }
  
  @scala.inline
  implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFields(value: ArrayOrValue[FieldParam]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: FieldParam*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setFilter(value: ArrayOrValue[FilterParam]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    @scala.inline
    def setFilterVarargs(value: FilterParam*): Self = StObject.set(x, "filter", js.Array(value :_*))
    
    @scala.inline
    def setFormats(value: ArrayOrValue[FormatParam]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
    
    @scala.inline
    def setFormatsVarargs(value: FormatParam*): Self = StObject.set(x, "formats", js.Array(value :_*))
    
    @scala.inline
    def setInclude(value: ArrayOrValue[IncludeParam]): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    @scala.inline
    def setIncludeVarargs(value: IncludeParam*): Self = StObject.set(x, "include", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: ArrayOrValue[LimitParam]): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    @scala.inline
    def setLimitVarargs(value: LimitParam*): Self = StObject.set(x, "limit", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: ArrayOrValue[OrderParam]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: OrderParam*): Self = StObject.set(x, "order", js.Array(value :_*))
    
    @scala.inline
    def setPage(value: ArrayOrValue[PageParam]): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
    
    @scala.inline
    def setPageVarargs(value: PageParam*): Self = StObject.set(x, "page", js.Array(value :_*))
  }
}
