package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecScaleMod.ScaleData
import typings.vegaTypings.typesSpecScaleMod.ScaleField
import typings.vegaTypings.typesSpecScaleMod.SortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-typings.vega-typings/types/spec/scale.ScaleDataRef & {  sort :vega-typings.vega-typings/types/spec/scale.SortField | undefined} */
trait ScaleDataRefsortSortField
  extends StObject
     with ScaleData {
  
  var data: String
  
  var field: ScaleField
  
  var sort: js.UndefOr[SortField] = js.undefined
}
object ScaleDataRefsortSortField {
  
  inline def apply(data: String, field: ScaleField): ScaleDataRefsortSortField = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleDataRefsortSortField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScaleDataRefsortSortField] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setField(value: ScaleField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setSort(value: SortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
