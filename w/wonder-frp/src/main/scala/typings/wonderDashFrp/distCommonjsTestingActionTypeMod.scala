package typings.wonderDashFrp

import typings.wonderDashFrp.distCommonjsTestingActionTypeMod.ActionType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/commonjs/testing/ActionType", JSImport.Namespace)
@js.native
object distCommonjsTestingActionTypeMod extends js.Object {
  @js.native
  sealed trait ActionType extends js.Object
  
  @js.native
  object ActionType extends js.Object {
    @js.native
    sealed trait COMPLETED extends ActionType
    
    @js.native
    sealed trait ERROR extends ActionType
    
    @js.native
    sealed trait NEXT extends ActionType
    
    /* 2 */ val COMPLETED: typings.wonderDashFrp.distCommonjsTestingActionTypeMod.ActionType.COMPLETED with Double = js.native
    /* 1 */ val ERROR: typings.wonderDashFrp.distCommonjsTestingActionTypeMod.ActionType.ERROR with Double = js.native
    /* 0 */ val NEXT: typings.wonderDashFrp.distCommonjsTestingActionTypeMod.ActionType.NEXT with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ActionType with Double] = js.native
  }
  
}

