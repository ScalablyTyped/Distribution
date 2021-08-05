package typings.vegaLite.channeldefMod

import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<vega-lite.vega-lite/build/src/channeldef.ValueDef<V | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef>> & {  condition :vega-lite.vega-lite/build/src/channeldef.Conditional<F> | vega-lite.vega-lite/build/src/channeldef.Conditional<vega-lite.vega-lite/build/src/channeldef.ValueDef<V | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef>> | std.Array<vega-lite.vega-lite/build/src/channeldef.Conditional<vega-lite.vega-lite/build/src/channeldef.ValueDef<V | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef>>> | undefined} */
trait ValueDefWithCondition[F /* <: (FieldDef[js.Any, js.Any]) | (DatumDef[js.Any, PrimitiveValue | DateTime | ExprRef | SignalRef]) */, V /* <: Value[ExprRef | SignalRef] */] extends StObject {
  
  /**
    * A field definition or one or more value definition(s) with a selection predicate.
    */
  var condition: js.UndefOr[
    (Conditional[F | (ValueDef[V | ExprRef | SignalRef])]) | (js.Array[Conditional[ValueDef[V | ExprRef | SignalRef]]])
  ] = js.undefined
  
  var value: js.UndefOr[V | ExprRef | SignalRef] = js.undefined
}
object ValueDefWithCondition {
  
  inline def apply[F /* <: (FieldDef[js.Any, js.Any]) | (DatumDef[js.Any, PrimitiveValue | DateTime | ExprRef | SignalRef]) */, V /* <: Value[ExprRef | SignalRef] */](): ValueDefWithCondition[F, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueDefWithCondition[F, V]]
  }
  
  extension [Self <: ValueDefWithCondition[?, ?], F /* <: (FieldDef[js.Any, js.Any]) | (DatumDef[js.Any, PrimitiveValue | DateTime | ExprRef | SignalRef]) */, V /* <: Value[ExprRef | SignalRef] */](x: Self & (ValueDefWithCondition[F, V])) {
    
    inline def setCondition(
      value: (Conditional[F | (ValueDef[V | ExprRef | SignalRef])]) | (js.Array[Conditional[ValueDef[V | ExprRef | SignalRef]]])
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: (Conditional[ValueDef[V | ExprRef | SignalRef]])*): Self = StObject.set(x, "condition", js.Array(value :_*))
    
    inline def setValue(value: V | ExprRef | SignalRef): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
