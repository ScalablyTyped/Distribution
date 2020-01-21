package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.tensorMod.Tensor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "spectral")
@js.native
object spectral extends js.Object {
  val fft: js.Function1[
    /* input */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  val ifft: js.Function1[
    /* input */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  val irfft: js.Function1[
    /* input */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  val rfft: js.Function2[
    /* input */ Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank], 
    /* fftLength */ js.UndefOr[Double], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
}

