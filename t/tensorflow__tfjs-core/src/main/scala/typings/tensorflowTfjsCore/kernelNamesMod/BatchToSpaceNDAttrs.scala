package typings.tensorflowTfjsCore.kernelNamesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchToSpaceNDAttrs extends StObject {
  
  var blockShape: js.Array[Double]
  
  var crops: js.Array[js.Array[Double]]
}
object BatchToSpaceNDAttrs {
  
  @scala.inline
  def apply(blockShape: js.Array[Double], crops: js.Array[js.Array[Double]]): BatchToSpaceNDAttrs = {
    val __obj = js.Dynamic.literal(blockShape = blockShape.asInstanceOf[js.Any], crops = crops.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchToSpaceNDAttrs]
  }
  
  @scala.inline
  implicit class BatchToSpaceNDAttrsMutableBuilder[Self <: BatchToSpaceNDAttrs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlockShape(value: js.Array[Double]): Self = StObject.set(x, "blockShape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBlockShapeVarargs(value: Double*): Self = StObject.set(x, "blockShape", js.Array(value :_*))
    
    @scala.inline
    def setCrops(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "crops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCropsVarargs(value: js.Array[Double]*): Self = StObject.set(x, "crops", js.Array(value :_*))
  }
}
