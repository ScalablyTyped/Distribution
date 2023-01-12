package typings.vegaLite.buildSrcVegaDotschemaMod

import typings.vegaTypings.typesSpecScaleMod.ScaleDataRef
import typings.vegaTypings.typesSpecScaleMod.ScaleField
import typings.vegaTypings.typesSpecScaleMod.SortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VgScaleDataRefWithSort
  extends StObject
     with ScaleDataRef {
  
  var sort: js.UndefOr[SortField] = js.undefined
}
object VgScaleDataRefWithSort {
  
  inline def apply(data: String, field: ScaleField): VgScaleDataRefWithSort = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgScaleDataRefWithSort]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VgScaleDataRefWithSort] (val x: Self) extends AnyVal {
    
    inline def setSort(value: SortField): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
  }
}
