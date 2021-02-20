package typings.vegaLite.channeldefMod

import typings.vegaLite.exprMod.ExprRef
import typings.vegaLite.srcTypeMod.Type
import typings.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vega-lite.vega-lite/build/src/channeldef.ValueDefWithCondition<vega-lite.vega-lite/build/src/channeldef.MarkPropFieldOrDatumDef<F, T>, string | null> */
@js.native
trait StringValueDefWithCondition[F /* <: Field */, T /* <: Type */] extends StObject {
  
  /**
    * A field definition or one or more value definition(s) with a selection predicate.
    */
  var condition: js.UndefOr[
    (Conditional[
      (MarkPropFieldOrDatumDef[F, T]) | (ValueDef[String | Null | ExprRef | SignalRef])
    ]) | (js.Array[Conditional[ValueDef[String | Null | ExprRef | SignalRef]]])
  ] = js.native
  
  var value: js.UndefOr[String | Null | ExprRef | SignalRef] = js.native
}
object StringValueDefWithCondition {
  
  @scala.inline
  def apply[F /* <: Field */, T /* <: Type */](): StringValueDefWithCondition[F, T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StringValueDefWithCondition[F, T]]
  }
  
  @scala.inline
  implicit class StringValueDefWithConditionMutableBuilder[Self <: StringValueDefWithCondition[_, _], F /* <: Field */, T /* <: Type */] (val x: Self with (StringValueDefWithCondition[F, T])) extends AnyVal {
    
    @scala.inline
    def setCondition(
      value: (Conditional[
          (MarkPropFieldOrDatumDef[F, T]) | (ValueDef[String | Null | ExprRef | SignalRef])
        ]) | (js.Array[Conditional[ValueDef[String | Null | ExprRef | SignalRef]]])
    ): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConditionUndefined: Self = StObject.set(x, "condition", js.undefined)
    
    @scala.inline
    def setConditionVarargs(value: (Conditional[ValueDef[String | Null | ExprRef | SignalRef]])*): Self = StObject.set(x, "condition", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: String | ExprRef | SignalRef): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueNull: Self = StObject.set(x, "value", null)
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
