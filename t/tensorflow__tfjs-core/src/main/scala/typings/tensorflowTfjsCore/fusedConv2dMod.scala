package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Activation
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fusedConv2dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused/conv2d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeightsLeakyreluAlpha: Activation[T]
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeightsLeakyreluAlpha.asInstanceOf[js.Any]).asInstanceOf[T]
}
