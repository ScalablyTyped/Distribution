package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.scaleMod._UnionSortField
import typings.vegaTypings.vegaTypingsStrings.count
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpOrder extends _UnionSortField {
  
  var op: count = js.native
  
  var order: js.UndefOr[SortOrder] = js.native
}
object OpOrder {
  
  @scala.inline
  def apply(op: count): OpOrder = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpOrder]
  }
  
  @scala.inline
  implicit class OpOrderMutableBuilder[Self <: OpOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOp(value: count): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
