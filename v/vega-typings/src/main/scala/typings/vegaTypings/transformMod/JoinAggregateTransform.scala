package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.joinaggregate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JoinAggregateTransform
  extends StObject
     with _Transforms {
  
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.undefined
  
  var fields: js.UndefOr[(js.Array[FieldRef | Null]) | SignalRef] = js.undefined
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var ops: js.UndefOr[(js.Array[AggregateOp | SignalRef]) | SignalRef] = js.undefined
  
  var `type`: joinaggregate
}
object JoinAggregateTransform {
  
  @scala.inline
  def apply(): JoinAggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("joinaggregate")
    __obj.asInstanceOf[JoinAggregateTransform]
  }
  
  @scala.inline
  implicit class JoinAggregateTransformMutableBuilder[Self <: JoinAggregateTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef | Null]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAsVarargs(value: (String | SignalRef | Null)*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    @scala.inline
    def setFields(value: (js.Array[FieldRef | Null]) | SignalRef): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFieldsVarargs(value: (FieldRef | Null)*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    @scala.inline
    def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value :_*))
    
    @scala.inline
    def setOps(value: (js.Array[AggregateOp | SignalRef]) | SignalRef): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsUndefined: Self = StObject.set(x, "ops", js.undefined)
    
    @scala.inline
    def setOpsVarargs(value: (AggregateOp | SignalRef)*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    @scala.inline
    def setType(value: joinaggregate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
