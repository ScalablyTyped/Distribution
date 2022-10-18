package typings.tensorflowTfjsCore.distKernelNamesMod

import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.bilinear
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.constant
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.nearest
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.reflect
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformAttrs extends StObject {
  
  var fillMode: constant | reflect | wrap | nearest
  
  var fillValue: Double
  
  var interpolation: nearest | bilinear
  
  var outputShape: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
}
object TransformAttrs {
  
  inline def apply(
    fillMode: constant | reflect | wrap | nearest,
    fillValue: Double,
    interpolation: nearest | bilinear
  ): TransformAttrs = {
    val __obj = js.Dynamic.literal(fillMode = fillMode.asInstanceOf[js.Any], fillValue = fillValue.asInstanceOf[js.Any], interpolation = interpolation.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformAttrs]
  }
  
  extension [Self <: TransformAttrs](x: Self) {
    
    inline def setFillMode(value: constant | reflect | wrap | nearest): Self = StObject.set(x, "fillMode", value.asInstanceOf[js.Any])
    
    inline def setFillValue(value: Double): Self = StObject.set(x, "fillValue", value.asInstanceOf[js.Any])
    
    inline def setInterpolation(value: nearest | bilinear): Self = StObject.set(x, "interpolation", value.asInstanceOf[js.Any])
    
    inline def setOutputShape(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "outputShape", value.asInstanceOf[js.Any])
    
    inline def setOutputShapeUndefined: Self = StObject.set(x, "outputShape", js.undefined)
  }
}
