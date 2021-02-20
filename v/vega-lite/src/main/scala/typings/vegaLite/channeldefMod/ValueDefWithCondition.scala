package typings.vegaLite.channeldefMod

import typings.vegaLite.datetimeMod.DateTime
import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<vega-lite.vega-lite/build/src/channeldef.ValueDef<V | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef>> & {  condition :vega-lite.vega-lite/build/src/channeldef.Conditional<F> | vega-lite.vega-lite/build/src/channeldef.Conditional<vega-lite.vega-lite/build/src/channeldef.ValueDef<V | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef>> | std.Array<vega-lite.vega-lite/build/src/channeldef.Conditional<vega-lite.vega-lite/build/src/channeldef.ValueDef<V | vega-lite.vega-lite/build/src/expr.ExprRef | vega.vega.SignalRef>>> | undefined} */
@js.native
trait ValueDefWithCondition[F /* <: (FieldDef[_, _]) | (DatumDef[_, PrimitiveValue | DateTime | ExprRef | SignalRef]) */, V /* <: Value[ExprRef | SignalRef] */] extends StObject {
  
  /**
    * A field definition or one or more value definition(s) with a selection predicate.
    */
  var condition: js.UndefOr[
    (Conditional[F | (ValueDef[V | ExprRef | SignalRef])]) | (js.Array[Conditional[ValueDef[V | ExprRef | SignalRef]]])
  ] = js.native
  
  var value: js.UndefOr[V | ExprRef | SignalRef] = js.native
}
object ValueDefWithCondition {
  
  @scala.inline
  def apply[F /* <: (FieldDef[_, _]) | (DatumDef[_, PrimitiveValue | DateTime | ExprRef | SignalRef]) */, V /* <: Value[ExprRef | SignalRef] */](): ValueDefWithCondition[F, V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValueDefWithCondition[F, V]]
  }
  
  @scala.inline
  implicit class ValueDefWithConditionMutableBuilder[Self <: ValueDefWithCondition[_, _], F /* <: (FieldDef[_, _]) | (DatumDef[_, PrimitiveValue | DateTime | ExprRef | SignalRef]) */, V /* <: Value[ExprRef | SignalRef] */] (val x: Self with (ValueDefWithCondition[F, V])) extends AnyVal {
    
    @scala.inline
    def setCondition(
      value: (Conditional[F | (ValueDef[V | ExprRef | SignalRef])]) | (js.Array[Conditional[ValueDef[V | ExprRef | SignalRef]]])
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setConditionVarargs(value: (Conditional[ValueDef[V | ExprRef | SignalRef]])*): Self = StObject.set(x, "condition", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: V | ExprRef | SignalRef): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
