package typings.vegaLite.buildSrcVegaDotschemaMod

import typings.vegaTypings.typesSpecScaleMod.ScaleField
import typings.vegaTypings.typesSpecScaleMod.ScaleMultiFieldsRef
import typings.vegaTypings.typesSpecScaleMod.UnionSortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VgMultiFieldsRefWithSort
  extends StObject
     with ScaleMultiFieldsRef {
  
  var sort: js.UndefOr[UnionSortField] = js.undefined
}
object VgMultiFieldsRefWithSort {
  
  inline def apply(data: String, fields: js.Array[ScaleField]): VgMultiFieldsRefWithSort = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgMultiFieldsRefWithSort]
  }
  
  extension [Self <: VgMultiFieldsRefWithSort](x: Self) {
    
    inline def setSort(value: UnionSortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
