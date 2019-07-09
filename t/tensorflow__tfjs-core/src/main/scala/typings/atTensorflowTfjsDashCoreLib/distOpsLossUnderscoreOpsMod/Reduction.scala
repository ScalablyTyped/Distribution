package typings
package atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Reduction extends js.Object

@JSImport("@tensorflow/tfjs-core/dist/ops/loss_ops", "Reduction")
@js.native
object Reduction extends js.Object {
  @js.native
  sealed trait MEAN
    extends atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  
  @js.native
  sealed trait NONE
    extends atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  
  @js.native
  sealed trait SUM
    extends atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  
  @js.native
  sealed trait SUM_BY_NONZERO_WEIGHTS
    extends atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction
  
  /* 1 */ val MEAN: MEAN with scala.Double = js.native
  /* 0 */ val NONE: NONE with scala.Double = js.native
  /* 2 */ val SUM: SUM with scala.Double = js.native
  /* 3 */ val SUM_BY_NONZERO_WEIGHTS: SUM_BY_NONZERO_WEIGHTS with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    atTensorflowTfjsDashCoreLib.distOpsLossUnderscoreOpsMod.Reduction with scala.Double
  ] = js.native
}

