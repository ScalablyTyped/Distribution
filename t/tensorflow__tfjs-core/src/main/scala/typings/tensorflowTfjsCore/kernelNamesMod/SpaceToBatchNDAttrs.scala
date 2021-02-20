package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpaceToBatchNDAttrs extends StObject {
  
  var blockShape: js.Array[Double] = js.native
  
  var paddings: js.Array[js.Array[Double]] = js.native
}
object SpaceToBatchNDAttrs {
  
  @scala.inline
  def apply(blockShape: js.Array[Double], paddings: js.Array[js.Array[Double]]): SpaceToBatchNDAttrs = {
    val __obj = js.Dynamic.literal(blockShape = blockShape.asInstanceOf[js.Any], paddings = paddings.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceToBatchNDAttrs]
  }
  
  @scala.inline
  implicit class SpaceToBatchNDAttrsMutableBuilder[Self <: SpaceToBatchNDAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockShape(value: js.Array[Double]): Self = StObject.set(x, "blockShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockShapeVarargs(value: Double*): Self = StObject.set(x, "blockShape", js.Array(value :_*))
    
    @scala.inline
    def setPaddings(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "paddings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaddingsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "paddings", js.Array(value :_*))
  }
}
