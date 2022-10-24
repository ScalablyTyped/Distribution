package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.anon.Bias
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsFusedDepthwiseConv2dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/fused/depthwise_conv2d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def depthwiseConv2d[T /* <: Tensor3D | Tensor4D */](param0: Bias[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("depthwiseConv2d")(param0.asInstanceOf[js.Any]).asInstanceOf[T]
}
