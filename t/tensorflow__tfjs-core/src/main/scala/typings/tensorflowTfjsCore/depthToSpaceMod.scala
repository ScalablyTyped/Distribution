package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NCHW
import typings.tensorflowTfjsCore.tensorflowTfjsCoreStrings.NHWC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/depth_to_space", JSImport.Namespace)
@js.native
object depthToSpaceMod extends js.Object {
  val depthToSpace: js.Function3[
    /* x */ Tensor4D | TensorLike4D, 
    /* blockSize */ Double, 
    /* dataFormat */ js.UndefOr[NHWC | NCHW], 
    Tensor4D
  ] = js.native
}

