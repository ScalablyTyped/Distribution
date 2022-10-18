package typings.vegaTypings.typesSpecTransformMod

import typings.vegaTypings.typesSpecSignalMod.SignalRef
import typings.vegaTypings.typesSpecUtilMod.Vector2
import typings.vegaTypings.vegaTypingsStrings.kde
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KDETransform
  extends StObject
     with Transforms {
  
  var as: js.UndefOr[(Vector2[String | SignalRef]) | SignalRef] = js.undefined
  
  var bandwidth: js.UndefOr[Double | SignalRef] = js.undefined
  
  var counts: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var cumulative: js.UndefOr[Boolean | SignalRef] = js.undefined
  
  var extent: js.UndefOr[(Vector2[Double | SignalRef]) | SignalRef] = js.undefined
  
  var field: FieldRef
  
  var groupby: js.UndefOr[js.Array[FieldRef] | SignalRef] = js.undefined
  
  var maxsteps: js.UndefOr[Double | SignalRef] = js.undefined
  
  var minsteps: js.UndefOr[Double | SignalRef] = js.undefined
  
  var resolve: js.UndefOr[KDEResolve | SignalRef] = js.undefined
  
  var steps: js.UndefOr[Double | SignalRef] = js.undefined
  
  var `type`: kde
}
object KDETransform {
  
  inline def apply(field: FieldRef): KDETransform = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("kde")
    __obj.asInstanceOf[KDETransform]
  }
  
  extension [Self <: KDETransform](x: Self) {
    
    inline def setAs(value: (Vector2[String | SignalRef]) | SignalRef): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
    
    inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
    
    inline def setBandwidth(value: Double | SignalRef): Self = StObject.set(x, "bandwidth", value.asInstanceOf[js.Any])
    
    inline def setBandwidthUndefined: Self = StObject.set(x, "bandwidth", js.undefined)
    
    inline def setCounts(value: Boolean | SignalRef): Self = StObject.set(x, "counts", value.asInstanceOf[js.Any])
    
    inline def setCountsUndefined: Self = StObject.set(x, "counts", js.undefined)
    
    inline def setCumulative(value: Boolean | SignalRef): Self = StObject.set(x, "cumulative", value.asInstanceOf[js.Any])
    
    inline def setCumulativeUndefined: Self = StObject.set(x, "cumulative", js.undefined)
    
    inline def setExtent(value: (Vector2[Double | SignalRef]) | SignalRef): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setField(value: FieldRef): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setGroupby(value: js.Array[FieldRef] | SignalRef): Self = StObject.set(x, "groupby", value.asInstanceOf[js.Any])
    
    inline def setGroupbyUndefined: Self = StObject.set(x, "groupby", js.undefined)
    
    inline def setGroupbyVarargs(value: FieldRef*): Self = StObject.set(x, "groupby", js.Array(value*))
    
    inline def setMaxsteps(value: Double | SignalRef): Self = StObject.set(x, "maxsteps", value.asInstanceOf[js.Any])
    
    inline def setMaxstepsUndefined: Self = StObject.set(x, "maxsteps", js.undefined)
    
    inline def setMinsteps(value: Double | SignalRef): Self = StObject.set(x, "minsteps", value.asInstanceOf[js.Any])
    
    inline def setMinstepsUndefined: Self = StObject.set(x, "minsteps", js.undefined)
    
    inline def setResolve(value: KDEResolve | SignalRef): Self = StObject.set(x, "resolve", value.asInstanceOf[js.Any])
    
    inline def setResolveUndefined: Self = StObject.set(x, "resolve", js.undefined)
    
    inline def setSteps(value: Double | SignalRef): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsUndefined: Self = StObject.set(x, "steps", js.undefined)
    
    inline def setType(value: kde): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
