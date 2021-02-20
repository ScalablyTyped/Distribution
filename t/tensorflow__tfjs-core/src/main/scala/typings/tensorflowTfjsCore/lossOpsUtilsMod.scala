package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lossOpsUtilsMod {
  
  @js.native
  sealed trait Reduction extends StObject
  @JSImport("@tensorflow/tfjs-core/dist/ops/loss_ops_utils", "Reduction")
  @js.native
  object Reduction extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Reduction with Double] = js.native
    
    @js.native
    sealed trait MEAN extends Reduction
    /* 1 */ val MEAN: typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction.MEAN with Double = js.native
    
    @js.native
    sealed trait NONE extends Reduction
    /* 0 */ val NONE: typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction.NONE with Double = js.native
    
    @js.native
    sealed trait SUM extends Reduction
    /* 2 */ val SUM: typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction.SUM with Double = js.native
    
    @js.native
    sealed trait SUM_BY_NONZERO_WEIGHTS extends Reduction
    /* 3 */ val SUM_BY_NONZERO_WEIGHTS: typings.tensorflowTfjsCore.lossOpsUtilsMod.Reduction.SUM_BY_NONZERO_WEIGHTS with Double = js.native
  }
}
