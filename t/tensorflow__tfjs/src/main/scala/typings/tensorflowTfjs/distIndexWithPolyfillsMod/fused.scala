package typings.tensorflowTfjs.distIndexWithPolyfillsMod

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
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "fused")
  @js.native
  val ^ : js.Any = js.native
  
  inline def conv2d[T /* <: Tensor3D | Tensor4D */](param0: Activation[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("conv2d")(param0.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](param0: Bias[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(param0.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "fused.matMul")
  @js.native
  val matMul: js.Function1[/* param0 */ A, Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]] = js.native
}
