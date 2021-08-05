package typings.vis.mod

import typings.vis.anon.DrawThreshold
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsScaling extends StObject {
  
  var customScalingFunction: js.UndefOr[
    js.Function4[
      /* min */ js.UndefOr[Double], 
      /* max */ js.UndefOr[Double], 
      /* total */ js.UndefOr[Double], 
      /* value */ js.UndefOr[Double], 
      Double
    ]
  ] = js.undefined
  
  var label: js.UndefOr[Boolean | DrawThreshold] = js.undefined
  
  var max: js.UndefOr[Double] = js.undefined
  
  var min: js.UndefOr[Double] = js.undefined
}
object OptionsScaling {
  
  inline def apply(): OptionsScaling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsScaling]
  }
  
  extension [Self <: OptionsScaling](x: Self) {
    
    inline def setCustomScalingFunction(
      value: (/* min */ js.UndefOr[Double], /* max */ js.UndefOr[Double], /* total */ js.UndefOr[Double], /* value */ js.UndefOr[Double]) => Double
    ): Self = StObject.set(x, "customScalingFunction", js.Any.fromFunction4(value))
    
    inline def setCustomScalingFunctionUndefined: Self = StObject.set(x, "customScalingFunction", js.undefined)
    
    inline def setLabel(value: Boolean | DrawThreshold): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
