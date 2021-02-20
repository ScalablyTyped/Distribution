package typings.vegaTypings.anon

import typings.vegaTypings.exprMod.ExprRef
import typings.vegaTypings.markMod.Compare
import typings.vegaTypings.scaleMod.SortOrder
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FieldOrder extends Compare {
  
  var field: js.Array[String | ExprRef | SignalRef] = js.native
  
  var order: js.UndefOr[js.Array[SortOrder]] = js.native
}
object FieldOrder {
  
  @scala.inline
  def apply(field: js.Array[String | ExprRef | SignalRef]): FieldOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOrder]
  }
  
  @scala.inline
  implicit class FieldOrderMutableBuilder[Self <: FieldOrder] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: js.Array[String | ExprRef | SignalRef]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldVarargs(value: (String | ExprRef | SignalRef)*): Self = StObject.set(x, "field", js.Array(value :_*))
    
    @scala.inline
    def setOrder(value: js.Array[SortOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    @scala.inline
    def setOrderVarargs(value: SortOrder*): Self = StObject.set(x, "order", js.Array(value :_*))
  }
}
