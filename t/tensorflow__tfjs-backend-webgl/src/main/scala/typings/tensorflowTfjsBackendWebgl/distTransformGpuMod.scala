package typings.tensorflowTfjsBackendWebgl

import typings.tensorflowTfjsBackendWebgl.distGpgpuMathMod.GPGPUProgram
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.bilinear
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.constant
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.nearest
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.reflect
import typings.tensorflowTfjsBackendWebgl.tensorflowTfjsBackendWebglStrings.wrap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformGpuMod {
  
  @JSImport("@tensorflow/tfjs-backend-webgl/dist/transform_gpu", "TransformProgram")
  @js.native
  open class TransformProgram protected ()
    extends StObject
       with GPGPUProgram {
    def this(
      imageHeight: Double,
      imageWidth: Double,
      interpolation: nearest | bilinear,
      fillMode: constant | reflect | wrap | nearest,
      fillValue: Double,
      outShape: js.Tuple4[Double, Double, Double, Double]
    ) = this()
    
    /* CompleteClass */
    var outputShape: js.Array[Double] = js.native
    
    /* CompleteClass */
    var userCode: String = js.native
    
    /* CompleteClass */
    var variableNames: js.Array[String] = js.native
  }
}
