package typings.vegaLite.anon

import typings.vegaTypings.scaleMod.ScaleField
import typings.vegaTypings.scaleMod.SortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega.vega.ScaleDataRef & {  sort :vega-lite.vega-lite/build/src/vega.schema.VgSortField | undefined} */
@js.native
trait ScaleDataRefsortVgSortFie extends StObject {
  
  var data: String = js.native
  
  var field: ScaleField = js.native
  
  var sort: js.UndefOr[SortField] = js.native
}
object ScaleDataRefsortVgSortFie {
  
  @scala.inline
  def apply(data: String, field: ScaleField): ScaleDataRefsortVgSortFie = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleDataRefsortVgSortFie]
  }
  
  @scala.inline
  implicit class ScaleDataRefsortVgSortFieMutableBuilder[Self <: ScaleDataRefsortVgSortFie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setField(value: ScaleField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSort(value: SortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
