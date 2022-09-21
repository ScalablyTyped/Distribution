package typings.vegaLite.channeldefMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConditionValueDefMixins[V /* <: Value[ExprRef | SignalRef] */] extends StObject {
  
  /**
    * One or more value definition(s) with [a parameter or a test predicate](https://vega.github.io/vega-lite/docs/condition.html).
    *
    * __Note:__ A field definition's `condition` property can only contain [conditional value definitions](https://vega.github.io/vega-lite/docs/condition.html#value)
    * since Vega-Lite only allows at most one encoded field per encoding channel.
    */
  var condition: js.UndefOr[Conditional[ValueDef[V]] | js.Array[Conditional[ValueDef[V]]]] = js.undefined
}
object ConditionValueDefMixins {
  
  inline def apply[V /* <: Value[ExprRef | SignalRef] */](): ConditionValueDefMixins[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConditionValueDefMixins[V]]
  }
  
  extension [Self <: ConditionValueDefMixins[?], V /* <: Value[ExprRef | SignalRef] */](x: Self & ConditionValueDefMixins[V]) {
    
    inline def setCondition(value: Conditional[ValueDef[V]] | js.Array[Conditional[ValueDef[V]]]): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: Conditional[ValueDef[V]]*): Self = StObject.set(x, "condition", js.Array(value*))
  }
}
