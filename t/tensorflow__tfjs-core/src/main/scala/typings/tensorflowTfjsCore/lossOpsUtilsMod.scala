package typings.tensorflowTfjsCore

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/ops/loss_ops_utils", JSImport.Namespace)
@js.native
object lossOpsUtilsMod extends js.Object {
  
  @js.native
  sealed trait Reduction extends js.Object
  @js.native
  object Reduction extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[Reduction with Double] = js.native
    
    @js.native
    sealed trait MEAN extends Reduction
    /* 1 */ @js.native
    object MEAN extends TopLevel[MEAN with Double]
    
    @js.native
    sealed trait NONE extends Reduction
    /* 0 */ @js.native
    object NONE extends TopLevel[NONE with Double]
    
    @js.native
    sealed trait SUM extends Reduction
    /* 2 */ @js.native
    object SUM extends TopLevel[SUM with Double]
    
    @js.native
    sealed trait SUM_BY_NONZERO_WEIGHTS extends Reduction
    /* 3 */ @js.native
    object SUM_BY_NONZERO_WEIGHTS extends TopLevel[SUM_BY_NONZERO_WEIGHTS with Double]
  }
}
