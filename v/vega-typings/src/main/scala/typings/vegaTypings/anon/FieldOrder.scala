package typings.vegaTypings.anon

import typings.vegaTypings.typesSpecExprMod.ExprRef
import typings.vegaTypings.typesSpecMarkMod.Compare
import typings.vegaTypings.typesSpecScaleMod.SortOrder
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FieldOrder
  extends StObject
     with Compare {
  
  var field: js.Array[String | ExprRef | SignalRef]
  
  var order: js.UndefOr[js.Array[SortOrder]] = js.undefined
}
object FieldOrder {
  
  inline def apply(field: js.Array[String | ExprRef | SignalRef]): FieldOrder = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldOrder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FieldOrder] (val x: Self) extends AnyVal {
    
    inline def setField(value: js.Array[String | ExprRef | SignalRef]): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldVarargs(value: (String | ExprRef | SignalRef)*): Self = StObject.set(x, "field", js.Array(value*))
    
    inline def setOrder(value: js.Array[SortOrder]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: SortOrder*): Self = StObject.set(x, "order", js.Array(value*))
  }
}
