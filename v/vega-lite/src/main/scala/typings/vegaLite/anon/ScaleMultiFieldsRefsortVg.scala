package typings.vegaLite.anon

import typings.vegaTypings.scaleMod.ScaleField
import typings.vegaTypings.scaleMod.SortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega.vega.ScaleMultiFieldsRef & {  sort :vega-lite.vega-lite/build/src/vega.schema.VgSortField | undefined} */
trait ScaleMultiFieldsRefsortVg extends StObject {
  
  var data: String
  
  var fields: js.Array[ScaleField]
  
  var sort: js.UndefOr[SortField] = js.undefined
}
object ScaleMultiFieldsRefsortVg {
  
  inline def apply(data: String, fields: js.Array[ScaleField]): ScaleMultiFieldsRefsortVg = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMultiFieldsRefsortVg]
  }
  
  extension [Self <: ScaleMultiFieldsRefsortVg](x: Self) {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[ScaleField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: ScaleField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    inline def setSort(value: SortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
