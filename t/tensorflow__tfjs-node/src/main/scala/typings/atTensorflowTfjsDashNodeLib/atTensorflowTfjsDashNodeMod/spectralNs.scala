package typings
package atTensorflowTfjsDashNodeLib.atTensorflowTfjsDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-node", "spectral")
@js.native
object spectralNs extends js.Object {
  val fft: js.Function1[
    /* input */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val ifft: js.Function1[
    /* input */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val irfft: js.Function1[
    /* input */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
  val rfft: js.Function2[
    /* input */ atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank], 
    /* fftLength */ js.UndefOr[scala.Double], 
    atTensorflowTfjsDashCoreLib.distTensorMod.Tensor[atTensorflowTfjsDashCoreLib.distTypesMod.Rank]
  ] = js.native
}

