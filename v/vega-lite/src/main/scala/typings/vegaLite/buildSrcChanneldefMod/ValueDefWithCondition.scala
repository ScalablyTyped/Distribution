package typings.vegaLite.buildSrcChanneldefMod

import typings.vegaLite.buildSrcDatetimeMod.DateTime
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<vega-lite.vega-lite/build/src/channeldef.ValueDef<V | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef>> & {  condition :vega-lite.vega-lite/build/src/channeldef.Conditional<F> | vega-lite.vega-lite/build/src/channeldef.Conditional<vega-lite.vega-lite/build/src/channeldef.ValueDef<V | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef>> | std.Array<vega-lite.vega-lite/build/src/channeldef.Conditional<vega-lite.vega-lite/build/src/channeldef.ValueDef<V | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef>>> | undefined} */
trait ValueDefWithCondition[F /* <: (FieldDef[Any, Any]) | (DatumDef[Any, PrimitiveValue | DateTime | ExprRef | SignalRef]) */, V /* <: Value[ExprRef | SignalRef] */] extends StObject {
  
  /**
    * A field definition or one or more value definition(s) with a parameter predicate.
    */
  var condition: js.UndefOr[
    (Conditional[F | (ValueDef[V | ExprRef | SignalRef])]) | (js.Array[Conditional[ValueDef[V | ExprRef | SignalRef]]])
  ] = js.undefined
  
  var value: js.UndefOr[V | ExprRef | SignalRef] = js.undefined
}
object ValueDefWithCondition {
  
  inline def apply[F /* <: (FieldDef[Any, Any]) | (DatumDef[Any, PrimitiveValue | DateTime | ExprRef | SignalRef]) */, V /* <: Value[ExprRef | SignalRef] */](): ValueDefWithCondition[F, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueDefWithCondition[F, V]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueDefWithCondition[?, ?], F /* <: (FieldDef[Any, Any]) | (DatumDef[Any, PrimitiveValue | DateTime | ExprRef | SignalRef]) */, V /* <: Value[ExprRef | SignalRef] */] (val x: Self & (ValueDefWithCondition[F, V])) extends AnyVal {
    
    inline def setCondition(
      value: (Conditional[F | (ValueDef[V | ExprRef | SignalRef])]) | (js.Array[Conditional[ValueDef[V | ExprRef | SignalRef]]])
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: (Conditional[ValueDef[V | ExprRef | SignalRef]])*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setValue(value: V | ExprRef | SignalRef): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
