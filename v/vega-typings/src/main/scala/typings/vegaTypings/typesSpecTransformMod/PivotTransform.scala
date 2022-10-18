package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.vegaTypingsStrings.pivot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PivotTransform
  extends StObject
     with Transforms {
  
  var field: FieldRef
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var key: js.UndefOr[String | TransformField] = js.undefined
  
  var limit: js.UndefOr[Double | SignalRef] = js.undefined
  
  var op: js.UndefOr[String | SignalRef] = js.undefined
  
  var `type`: pivot
  
  var value: FieldRef
}
object PivotTransform {
  
  inline def apply(field: FieldRef, value: FieldRef): PivotTransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("pivot")
    __obj.asInstanceOf[PivotTransform]
  }
  
  extension [Self <: PivotTransform](x: Self) {
    
    inline def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setKey(value: String | TransformField): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setLimit(value: Double | SignalRef): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setOp(value: String | SignalRef): Self = StObject.set(x, "op", value.asInstanceOf[js.Any])
    
    inline def setOpUndefined: Self = StObject.set(x, "op", js.undefined)
    
    inline def setType(value: pivot): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: FieldRef): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
