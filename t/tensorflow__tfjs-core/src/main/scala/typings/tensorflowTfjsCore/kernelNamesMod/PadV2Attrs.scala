package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PadV2Attrs extends StObject {
  
  var constantValue: Double = js.native
  
  var paddings: js.Array[js.Tuple2[Double, Double]] = js.native
}
object PadV2Attrs {
  
  @scala.inline
  def apply(constantValue: Double, paddings: js.Array[js.Tuple2[Double, Double]]): PadV2Attrs = {
    val __obj = js.Dynamic.literal(constantValue = constantValue.asInstanceOf[js.Any], paddings = paddings.asInstanceOf[js.Any])
    __obj.asInstanceOf[PadV2Attrs]
  }
  
  @scala.inline
  implicit class PadV2AttrsMutableBuilder[Self <: PadV2Attrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstantValue(value: Double): Self = StObject.set(x, "constantValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddings(value: js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "paddings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingsVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "paddings", js.Array(value :_*))
  }
}
