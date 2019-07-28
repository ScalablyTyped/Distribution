package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "spectral")
@js.native
object spectralNs extends js.Object {
  val fft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  val ifft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  val irfft: js.Function1[/* input */ Tensor[Rank], Tensor[Rank]] = js.native
  val rfft: js.Function2[/* input */ Tensor[Rank], /* fftLength */ js.UndefOr[Double], Tensor[Rank]] = js.native
}

