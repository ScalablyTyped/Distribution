package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor2D
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTensorMod.Tensor5D
import typings.tensorflowTfjsCore.distTensorMod.Tensor6D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object grayscaleToRgbMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/image/grayscale_to_rgb", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def grayscaleToRGB[T /* <: Tensor2D | Tensor3D | Tensor4D | Tensor5D | Tensor6D */](image: T | TensorLike): T = ^.asInstanceOf[js.Dynamic].applyDynamic("grayscaleToRGB")(image.asInstanceOf[js.Any]).asInstanceOf[T]
}
