package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTensorMod.Tensor4D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.same_
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.valid_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object separableConv2dMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/separable_conv2d", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def separableConv2d[T /* <: Tensor3D | Tensor4D */](
    x: T | TensorLike,
    depthwiseFilter: Tensor4D | TensorLike,
    pointwiseFilter: Tensor4D | TensorLike,
    strides: (js.Tuple2[Double, Double]) | Double,
    pad: valid_ | same_,
    dilation: js.UndefOr[(js.Tuple2[Double, Double]) | Double],
    dataFormat: js.UndefOr[NHWC | NCHW]
  ): T = (^.asInstanceOf[js.Dynamic].applyDynamic("separableConv2d")(x.asInstanceOf[js.Any], depthwiseFilter.asInstanceOf[js.Any], pointwiseFilter.asInstanceOf[js.Any], strides.asInstanceOf[js.Any], pad.asInstanceOf[js.Any], dilation.asInstanceOf[js.Any], dataFormat.asInstanceOf[js.Any])).asInstanceOf[T]
}
