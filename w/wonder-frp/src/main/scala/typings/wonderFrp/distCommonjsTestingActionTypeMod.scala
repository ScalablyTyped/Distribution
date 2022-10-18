package typings.wonderFrp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsTestingActionTypeMod {
  
  @js.native
  sealed trait ActionType extends StObject
  @JSImport("wonder-frp/dist/commonjs/testing/ActionType", "ActionType")
  @js.native
  object ActionType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[ActionType & Double] = js.native
    
    @js.native
    sealed trait COMPLETED
      extends StObject
         with ActionType
    /* 2 */ val COMPLETED: typings.wonderFrp.distCommonjsTestingActionTypeMod.ActionType.COMPLETED & Double = js.native
    
    @js.native
    sealed trait ERROR
      extends StObject
         with ActionType
    /* 1 */ val ERROR: typings.wonderFrp.distCommonjsTestingActionTypeMod.ActionType.ERROR & Double = js.native
    
    @js.native
    sealed trait NEXT
      extends StObject
         with ActionType
    /* 0 */ val NEXT: typings.wonderFrp.distCommonjsTestingActionTypeMod.ActionType.NEXT & Double = js.native
  }
}
