package typings.vegaTypings.anon

import typings.vegaTypings.scaleMod.ScaleField
import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.scaleMod._SortField
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Op
  extends StObject
     with _SortField {
  
  var field: js.UndefOr[ScaleField] = js.undefined
  
  var op: ScaleField
  
  var order: js.UndefOr[SortOrder] = js.undefined
}
object Op {
  
  @scala.inline
  def apply(op: ScaleField): Op = {
    val __obj = js.Dynamic.literal(op = op.asInstanceOf[js.Any])
    __obj.asInstanceOf[Op]
  }
  
  @scala.inline
  implicit class OpMutableBuilder[Self <: Op] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: ScaleField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setOp(value: ScaleField): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrder(value: SortOrder): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
  }
}
