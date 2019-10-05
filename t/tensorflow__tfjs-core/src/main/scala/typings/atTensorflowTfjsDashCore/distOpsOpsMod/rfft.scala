package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "rfft")
@js.native
object rfft
  extends TopLevel[
      js.Function2[/* input */ Tensor[Rank], /* fftLength */ js.UndefOr[Double], Tensor[Rank]]
    ]

