package typings.wonderDashFrp

import typings.wonderDashFrp.distEs2015EnumFilterStateMod.FilterState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder-frp/dist/es2015/enum/FilterState", JSImport.Namespace)
@js.native
object distEs2015EnumFilterStateMod extends js.Object {
  @js.native
  sealed trait FilterState extends js.Object
  
  @js.native
  object FilterState extends js.Object {
    @js.native
    sealed trait ENTER extends FilterState
    
    @js.native
    sealed trait LEAVE extends FilterState
    
    @js.native
    sealed trait TRIGGER extends FilterState
    
    /* 1 */ val ENTER: typings.wonderDashFrp.distEs2015EnumFilterStateMod.FilterState.ENTER with Double = js.native
    /* 2 */ val LEAVE: typings.wonderDashFrp.distEs2015EnumFilterStateMod.FilterState.LEAVE with Double = js.native
    /* 0 */ val TRIGGER: typings.wonderDashFrp.distEs2015EnumFilterStateMod.FilterState.TRIGGER with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FilterState with Double] = js.native
  }
  
}

