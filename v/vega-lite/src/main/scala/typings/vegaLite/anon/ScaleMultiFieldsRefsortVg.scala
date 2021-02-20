package typings.vegaLite.anon

import typings.vegaTypings.scaleMod.ScaleField
import typings.vegaTypings.scaleMod.SortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega.vega.ScaleMultiFieldsRef & {  sort :vega-lite.vega-lite/build/src/vega.schema.VgSortField | undefined} */
@js.native
trait ScaleMultiFieldsRefsortVg extends StObject {
  
  var data: String = js.native
  
  var fields: js.Array[ScaleField] = js.native
  
  var sort: js.UndefOr[SortField] = js.native
}
object ScaleMultiFieldsRefsortVg {
  
  @scala.inline
  def apply(data: String, fields: js.Array[ScaleField]): ScaleMultiFieldsRefsortVg = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleMultiFieldsRefsortVg]
  }
  
  @scala.inline
  implicit class ScaleMultiFieldsRefsortVgMutableBuilder[Self <: ScaleMultiFieldsRefsortVg] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[ScaleField]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: ScaleField*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setSort(value: SortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
