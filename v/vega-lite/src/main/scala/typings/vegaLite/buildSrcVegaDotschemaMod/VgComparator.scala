package typings.vegaLite.buildSrcVegaDotschemaMod

import typings.vegaLite.buildSrcSortMod.SortOrder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VgComparator extends StObject {
  
  var field: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var order: js.UndefOr[SortOrder | js.Array[SortOrder]] = js.undefined
}
object VgComparator {
  
  inline def apply(): VgComparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VgComparator]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VgComparator] (val x: Self) extends AnyVal {
    
    inline def setField(value: String | js.Array[String]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setFieldVarargs(value: String*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setOrder(value: SortOrder | js.Array[SortOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: SortOrder*): Self = StObject.set(x, "order", js.Array(value*))
  }
}
