package typings.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTensorMod.Tensor3D
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "reverse3d")
@js.native
object reverse3d
  extends TopLevel[
      js.Function2[
        /* x */ Tensor3D | TensorLike, 
        /* axis */ js.UndefOr[Double | js.Array[Double]], 
        Tensor3D
      ]
    ]
