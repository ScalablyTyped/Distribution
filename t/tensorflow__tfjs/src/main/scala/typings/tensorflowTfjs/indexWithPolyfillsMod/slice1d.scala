package typings.tensorflowTfjs.indexWithPolyfillsMod

import org.scalablytyped.runtime.TopLevel
import typings.tensorflowTfjsCore.distTypesMod.TensorLike
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs/dist/index_with_polyfills", "slice1d")
@js.native
object slice1d
  extends TopLevel[
      js.Function3[/* x */ Tensor1D | TensorLike, /* begin */ Double, /* size */ Double, Tensor1D]
    ]

