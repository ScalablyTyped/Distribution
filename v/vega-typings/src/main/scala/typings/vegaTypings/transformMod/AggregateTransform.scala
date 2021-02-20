package typings.vegaTypings.transformMod

import typings.vegaTypings.signalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.aggregate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AggregateTransform extends _Transforms {
  
  var as: js.UndefOr[(js.Array[String | SignalRef | Null]) | SignalRef] = js.native
  
  var cross: js.UndefOr[Boolean | SignalRef] = js.native
  
  var drop: js.UndefOr[Boolean | SignalRef] = js.native
  
  var fields: js.UndefOr[(js.Array[FieldRef | Null]) | SignalRef] = js.native
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.native
  
  var key: js.UndefOr[String | TransformField] = js.native
  
  var ops: js.UndefOr[(js.Array[AggregateOp | SignalRef]) | SignalRef] = js.native
  
  var signal: js.UndefOr[String] = js.native
  
  var `type`: aggregate = js.native
}
object AggregateTransform {
  
  @scala.inline
  def apply(`type`: aggregate): AggregateTransform = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregateTransform]
  }
  
  @scala.inline
  implicit class AggregateTransformMutableBuilder[Self <: AggregateTransform] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAs(value: (js.Array[String | SignalRef | Null]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    @scala.inline
    def setAsVarargs(value: (String | SignalRef | Null)*): Self = StObject.set(x, "as", js.Array(value :_*))
    
    @scala.inline
    def setCross(value: Boolean | SignalRef): Self = StObject.set(x, "cross", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCrossUndefined: Self = StObject.set(x, "cross", js.undefined)
    
    @scala.inline
    def setDrop(value: Boolean | SignalRef): Self = StObject.set(x, "drop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
    
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
    def setKey(value: String | TransformField): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    @scala.inline
    def setOps(value: (js.Array[AggregateOp | SignalRef]) | SignalRef): Self = StObject.set(x, "ops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpsUndefined: Self = StObject.set(x, "ops", js.undefined)
    
    @scala.inline
    def setOpsVarargs(value: (AggregateOp | SignalRef)*): Self = StObject.set(x, "ops", js.Array(value :_*))
    
    @scala.inline
    def setSignal(value: String): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    
    @scala.inline
    def setType(value: aggregate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
