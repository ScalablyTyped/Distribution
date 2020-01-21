package typings.tensorflowTfjsNode.mod

import typings.tensorflowTfjsCore.tensorMod.Tensor
import typings.tensorflowTfjsCore.tensorMod.Tensor1D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "signal")
@js.native
object signal extends js.Object {
  val frame: js.Function5[
    /* signal */ Tensor1D, 
    /* frameLength */ Double, 
    /* frameStep */ Double, 
    /* padEnd */ js.UndefOr[Boolean], 
    /* padValue */ js.UndefOr[Double], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
  val hammingWindow: js.Function1[/* windowLength */ Double, Tensor1D] = js.native
  val hannWindow: js.Function1[/* windowLength */ Double, Tensor1D] = js.native
  val stft: js.Function5[
    /* signal */ Tensor1D, 
    /* frameLength */ Double, 
    /* frameStep */ Double, 
    /* fftLength */ js.UndefOr[Double], 
    /* windowFn */ js.UndefOr[js.Function1[/* length */ Double, Tensor1D]], 
    Tensor[typings.tensorflowTfjsCore.distTypesMod.Rank]
  ] = js.native
}

