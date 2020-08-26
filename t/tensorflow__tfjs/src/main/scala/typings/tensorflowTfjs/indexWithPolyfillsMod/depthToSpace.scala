package typings.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjs.tensorflowTfjsStrings.NCHW
import typings.tensorflowTfjs.tensorflowTfjsStrings.NHWC
import typings.tensorflowTfjsCore.distTypesMod.TensorLike4D
import typings.tensorflowTfjsCore.tensorMod.Tensor4D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "depthToSpace")
@js.native
object depthToSpace
  extends TopLevel[
      js.Function3[
        /* x */ Tensor4D | TensorLike4D, 
        /* blockSize */ Double, 
        /* dataFormat */ js.UndefOr[NHWC | NCHW], 
        Tensor4D
      ]
    ]

