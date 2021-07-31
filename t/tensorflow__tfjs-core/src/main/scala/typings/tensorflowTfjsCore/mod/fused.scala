package typings.tensorflowTfjsCore.mod

import typings.tensorflowTfjsCore.anon.A
import typings.tensorflowTfjsCore.anon.Activation
import typings.tensorflowTfjsCore.anon.Bias
import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fused {
  
  @JSImport("@tensorflow/tfjs-core", "fused")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def conv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Activation[T]
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](
    hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights: Bias[T]
  ): T = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(hasXFilterStridesPadDataFormatDilationsDimRoundingModeBiasActivationPreluActivationWeights.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @scala.inline
  def matMul[T /* <: Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank] */](hasABTransposeATransposeBBiasActivationPreluActivationWeights: A[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("matMul")(hasABTransposeATransposeBBiasActivationPreluActivationWeights.asInstanceOf[js.Any]).asInstanceOf[T]
}
