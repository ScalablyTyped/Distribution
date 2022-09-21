package typings.vegaLite.channeldefMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcTypeMod.Type
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/channeldef.ValueDefWithCondition<vega-lite.vega-lite/build/src/channeldef.MarkPropFieldOrDatumDef<F, T>, string | null> */
trait StringValueDefWithCondition[F /* <: Field */, T /* <: Type */] extends StObject {
  
  /**
    * A field definition or one or more value definition(s) with a parameter predicate.
    */
  var condition: js.UndefOr[
    (Conditional[
      (MarkPropFieldOrDatumDef[F, T]) | (ValueDef[String | Null | ExprRef | SignalRef])
    ]) | (js.Array[Conditional[ValueDef[String | Null | ExprRef | SignalRef]]])
  ] = js.undefined
  
  var value: js.UndefOr[String | Null | ExprRef | SignalRef] = js.undefined
}
object StringValueDefWithCondition {
  
  inline def apply[F /* <: Field */, T /* <: Type */](): StringValueDefWithCondition[F, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringValueDefWithCondition[F, T]]
  }
  
  extension [Self <: StringValueDefWithCondition[?, ?], F /* <: Field */, T /* <: Type */](x: Self & (StringValueDefWithCondition[F, T])) {
    
    inline def setCondition(
      value: (Conditional[
          (MarkPropFieldOrDatumDef[F, T]) | (ValueDef[String | Null | ExprRef | SignalRef])
        ]) | (js.Array[Conditional[ValueDef[String | Null | ExprRef | SignalRef]]])
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    inline def setConditionVarargs(value: (Conditional[ValueDef[String | Null | ExprRef | SignalRef]])*): Self = StObject.set(x, "condition", js.Array(value*))
    
    inline def setValue(value: String | ExprRef | SignalRef): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
