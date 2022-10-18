package typings.wonderFrp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCommonjsEnumFilterStateMod {
  
  @js.native
  sealed trait FilterState extends StObject
  @JSImport("wonder-frp/dist/commonjs/enum/FilterState", "FilterState")
  @js.native
  object FilterState extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FilterState & Double] = js.native
    
    @js.native
    sealed trait ENTER
      extends StObject
         with FilterState
    /* 1 */ val ENTER: typings.wonderFrp.distCommonjsEnumFilterStateMod.FilterState.ENTER & Double = js.native
    
    @js.native
    sealed trait LEAVE
      extends StObject
         with FilterState
    /* 2 */ val LEAVE: typings.wonderFrp.distCommonjsEnumFilterStateMod.FilterState.LEAVE & Double = js.native
    
    @js.native
    sealed trait TRIGGER
      extends StObject
         with FilterState
    /* 0 */ val TRIGGER: typings.wonderFrp.distCommonjsEnumFilterStateMod.FilterState.TRIGGER & Double = js.native
  }
}
