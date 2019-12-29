package typings.wonderDashFrp

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ActionType with Double] = js.native
    /* 2 */ @js.native
    object COMPLETED extends TopLevel[COMPLETED with Double]
    
    /* 1 */ @js.native
    object ERROR extends TopLevel[ERROR with Double]
    
    /* 0 */ @js.native
    object NEXT extends TopLevel[NEXT with Double]
    
  }
  
}

