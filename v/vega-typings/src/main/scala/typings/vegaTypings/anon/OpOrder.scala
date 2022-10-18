package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecScaleMod.SortOrder
import typings.vegaTypings.typesSpecScaleMod._UnionSortField
import typings.vegaTypings.vegaTypingsStrings.count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpOrder
  extends StObject
     with _UnionSortField {
  
  var op: count
  
  var order: js.UndefOr[SortOrder] = js.undefined
}
object OpOrder {
  
  inline def apply(): OpOrder = {
    val __obj = js.Dynamic.literal(op = "count")
    __obj.asInstanceOf[OpOrder]
  }
  
  extension [Self <: OpOrder](x: Self) {
    
    inline def setOp(value: count): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
