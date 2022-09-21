package typings.tensorflowModelsFaceDetection

import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shiftImageValueMod {
  
  @JSImport("@tensorflow-models/face-detection/dist/shared/calculators/shift_image_value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def shiftImageValue(image: Tensor4D, outputFloatRange: js.Tuple2[Double, Double]): Tensor4D = (^.asInstanceOf[js.Dynamic].applyDynamic("shiftImageValue")(image.asInstanceOf[js.Any], outputFloatRange.asInstanceOf[js.Any])).asInstanceOf[Tensor4D]
}
