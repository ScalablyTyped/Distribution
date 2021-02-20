package typings.tensorflowTfjsCore.kernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvgPoolBackpropAttrs extends StObject {
  
  var filterSize: (js.Tuple2[Double, Double]) | Double = js.native
  
  var pad: valid_ | same_ | Double = js.native
  
  var strides: (js.Tuple2[Double, Double]) | Double = js.native
}
object AvgPoolBackpropAttrs {
  
  @scala.inline
  def apply(
    filterSize: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_ | Double,
    strides: (js.Tuple2[Double, Double]) | Double
  ): AvgPoolBackpropAttrs = {
    val __obj = js.Dynamic.literal(filterSize = filterSize.asInstanceOf[js.Any], pad = pad.asInstanceOf[js.Any], strides = strides.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvgPoolBackpropAttrs]
  }
  
  @scala.inline
  implicit class AvgPoolBackpropAttrsMutableBuilder[Self <: AvgPoolBackpropAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilterSize(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "filterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPad(value: valid_ | same_ | Double): Self = StObject.set(x, "pad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrides(value: (js.Tuple2[Double, Double]) | Double): Self = StObject.set(x, "strides", value.asInstanceOf[js.Any])
  }
}
