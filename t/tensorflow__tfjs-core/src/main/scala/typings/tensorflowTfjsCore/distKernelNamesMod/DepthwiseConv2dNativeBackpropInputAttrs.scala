package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.distOpsConvUtilMod.ExplicitPadding
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepthwiseConv2dNativeBackpropInputAttrs extends StObject {
  
  var dilations: (js.Tuple2[Double, Double]) | Double
  
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.undefined
  
  var inputShape: js.Tuple4[Double, Double, Double, Double]
  
  var pad: valid_ | same_ | Double | ExplicitPadding
  
  var strides: (js.Tuple2[Double, Double]) | Double
}
object DepthwiseConv2dNativeBackpropInputAttrs {
  
  inline def apply(
    dilations: (js.Tuple2[Double, Double]) | Double,
    inputShape: js.Tuple4[Double, Double, Double, Double],
    pad: valid_ | same_ | Double | ExplicitPadding,
    strides: (js.Tuple2[Double, Double]) | Double
  ): DepthwiseConv2dNativeBackpropInputAttrs = {
    val __obj = js.Dynamic.literal(dilations = dilations.asInstanceOf[js.Any], inputShape = inputShape.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepthwiseConv2dNativeBackpropInputAttrs]
  }
  
  extension [Self <: DepthwiseConv2dNativeBackpropInputAttrs](x: Self) {
    
    inline def setDilations(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "dilations", value.asInstanceOf[js.Any])
    
    inline def setDimRoundingMode(value: floor | round | ceil): Self = StObject.set(x, "dimRoundingMode", value.asInstanceOf[js.Any])
    
    inline def setDimRoundingModeUndefined: Self = StObject.set(x, "dimRoundingMode", js.undefined)
    
    inline def setInputShape(value: js.Tuple4[Double, Double, Double, Double]): Self = StObject.set(x, "inputShape", value.asInstanceOf[js.Any])
    
    inline def setPad(value: valid_ | same_ | Double | ExplicitPadding): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    inline def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}
