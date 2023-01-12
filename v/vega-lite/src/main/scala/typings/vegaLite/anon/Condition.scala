package typings.vegaLite.anon

import typings.vegaLite.buildSrcChanneldefMod.ConditionalPredicate
import typings.vegaLite.buildSrcChanneldefMod.ValueDef
import typings.vegaLite.buildSrcExprMod.ExprRef
import typings.vegaTypings.typesSpecSignalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Condition[V /* <: (typings.vegaLite.buildSrcChanneldefMod.Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */] extends StObject {
  
  var condition: (ConditionalPredicate[ValueDef[V] | ES]) | (js.Array[ConditionalPredicate[ValueDef[V] | ES]])
}
object Condition {
  
  inline def apply[V /* <: (typings.vegaLite.buildSrcChanneldefMod.Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */](
    condition: (ConditionalPredicate[ValueDef[V] | ES]) | (js.Array[ConditionalPredicate[ValueDef[V] | ES]])
  ): Condition[V, ES] = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition[V, ES]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Condition[?, ?], V /* <: (typings.vegaLite.buildSrcChanneldefMod.Value[ExprRef | SignalRef]) | js.Array[Double] */, ES /* <: ExprRef | SignalRef */] (val x: Self & (Condition[V, ES])) extends AnyVal {
    
    inline def setCondition(
      value: (ConditionalPredicate[ValueDef[V] | ES]) | (js.Array[ConditionalPredicate[ValueDef[V] | ES]])
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionVarargs(value: (ConditionalPredicate[ValueDef[V] | ES])*): Self = StObject.set(x, "condition", js.Array(value*))
  }
}
