package typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Reduction extends js.Object

@JSImport("@tensorflow/tfjs-core/dist/ops/loss_ops", "Reduction")
@js.native
object Reduction extends js.Object {
  @js.native
  sealed trait MEAN extends Reduction
  
  @js.native
  sealed trait NONE extends Reduction
  
  @js.native
  sealed trait SUM extends Reduction
  
  @js.native
  sealed trait SUM_BY_NONZERO_WEIGHTS extends Reduction
  
  /* 1 */ val MEAN: typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod.Reduction.MEAN with Double = js.native
  /* 0 */ val NONE: typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod.Reduction.NONE with Double = js.native
  /* 2 */ val SUM: typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod.Reduction.SUM with Double = js.native
  /* 3 */ val SUM_BY_NONZERO_WEIGHTS: typings.atTensorflowTfjsDashCore.distOpsLossUnderscoreOpsMod.Reduction.SUM_BY_NONZERO_WEIGHTS with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Reduction with Double] = js.native
}

