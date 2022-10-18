package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distTensorMod.Tensor
import typings.tensorflowTfjsCore.distTypesMod.Rank
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distOpsSpectralRfftMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/ops/spectral/rfft", "rfft")
  @js.native
  val rfft: js.Function2[/* input */ Tensor[Rank], /* fftLength */ js.UndefOr[Double], Tensor[Rank]] = js.native
}
