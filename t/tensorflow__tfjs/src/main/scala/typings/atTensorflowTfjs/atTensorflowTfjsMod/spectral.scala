package typings.atTensorflowTfjs.atTensorflowTfjsMod

import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs", "spectral")
@js.native
object spectral extends js.Object {
  val fft: js.Function1[
    /* input */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
  ] = js.native
  val ifft: js.Function1[
    /* input */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
  ] = js.native
  val irfft: js.Function1[
    /* input */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
  ] = js.native
  val rfft: js.Function2[
    /* input */ typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank], 
    /* fftLength */ js.UndefOr[Double], 
    typings.atTensorflowTfjsDashCore.distTensorMod.Tensor[Rank]
  ] = js.native
}

