package typings.atTensorflowTfjsDashCore.distOpsOpsMod

import org.scalablytyped.runtime.TopLevel
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor
import typings.atTensorflowTfjsDashCore.distTensorMod.Tensor2D
import typings.atTensorflowTfjsDashCore.distTypesMod.Rank
import typings.atTensorflowTfjsDashCore.distTypesMod.TensorLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@tensorflow/tfjs-core/dist/ops/ops", "whereAsync")
@js.native
object whereAsync
  extends TopLevel[js.Function1[/* condition */ Tensor[Rank] | TensorLike, js.Promise[Tensor2D]]]

