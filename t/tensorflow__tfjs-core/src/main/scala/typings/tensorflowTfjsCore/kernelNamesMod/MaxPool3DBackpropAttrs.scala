package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.ceil
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.floor
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.round
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxPool3DBackpropAttrs extends StObject {
  
  var dilations: js.UndefOr[(js.Tuple3[Double, Double, Double]) | Double] = js.native
  
  var dimRoundingMode: js.UndefOr[floor | round | ceil] = js.native
  
  var filterSize: (js.Tuple3[Double, Double, Double]) | Double = js.native
  
  var pad: valid_ | same_ | Double = js.native
  
  var strides: (js.Tuple3[Double, Double, Double]) | Double = js.native
}
object MaxPool3DBackpropAttrs {
  
  @scala.inline
  def apply(
    filterSize: (js.Tuple3[Double, Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple3[Double, Double, Double]) | Double
  ): MaxPool3DBackpropAttrs = {
    val __obj = js.Dynamic.literal(filterSize = filterSize.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxPool3DBackpropAttrs]
  }
  
  @scala.inline
  implicit class MaxPool3DBackpropAttrsMutableBuilder[Self <: MaxPool3DBackpropAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDilations(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "dilations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDilationsUndefined: Self = StObject.set(x, "dilations", js.undefined)
    
    @scala.inline
    def setDimRoundingMode(value: floor | round | ceil): Self = StObject.set(x, "dimRoundingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimRoundingModeUndefined: Self = StObject.set(x, "dimRoundingMode", js.undefined)
    
    @scala.inline
    def setFilterSize(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "filterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_ | Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple3[Double, Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}
