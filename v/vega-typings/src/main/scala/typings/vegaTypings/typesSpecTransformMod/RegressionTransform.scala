package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.regression
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegressionTransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  
  var extent: js.UndefOr[(js.Tuple2[Double, Double]) | SignalRef] = js.undefined
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var method: js.UndefOr[RegressionMethod | SignalRef] = js.undefined
  
  var order: js.UndefOr[Double | SignalRef] = js.undefined
  
  var params: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var `type`: regression
  
  var x: FieldRef
  
  var y: FieldRef
}
object RegressionTransform {
  
  inline def apply(x: FieldRef, y: FieldRef): RegressionTransform = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("regression")
    __obj.asInstanceOf[RegressionTransform]
  }
  
  extension [Self <: RegressionTransform](x: Self) {
    
    inline def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setExtent(value: (js.Tuple2[Double, Double]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setMethod(value: RegressionMethod | SignalRef): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setOrder(value: Double | SignalRef): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setParams(value: Boolean | SignalRef): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setType(value: regression): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: FieldRef): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: FieldRef): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
