package typings.tensorflowTfjsCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait KeptDims extends StObject {
  
  var keptDims: js.Array[Double] = js.native
  
  var newShape: js.Array[Double] = js.native
}
object KeptDims {
  
  @scala.inline
  def apply(keptDims: js.Array[Double], newShape: js.Array[Double]): KeptDims = {
    val __obj = js.Dynamic.literal(keptDims = keptDims.asInstanceOf[js.Any], newShape = newShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeptDims]
  }
  
  @scala.inline
  implicit class KeptDimsMutableBuilder[Self <: KeptDims] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeptDims(value: js.Array[Double]): Self = StObject.set(x, "keptDims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeptDimsVarargs(value: Double*): Self = StObject.set(x, "keptDims", js.Array(value :_*))
    
    @scala.inline
    def setNewShape(value: js.Array[Double]): Self = StObject.set(x, "newShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewShapeVarargs(value: Double*): Self = StObject.set(x, "newShape", js.Array(value :_*))
  }
}
