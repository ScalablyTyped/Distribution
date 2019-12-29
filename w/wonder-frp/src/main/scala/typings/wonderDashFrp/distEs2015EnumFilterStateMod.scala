package typings.wonderDashFrp

import org.scalablytyped.runtime.TopLevel
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
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FilterState with Double] = js.native
    /* 1 */ @js.native
    object ENTER extends TopLevel[ENTER with Double]
    
    /* 2 */ @js.native
    object LEAVE extends TopLevel[LEAVE with Double]
    
    /* 0 */ @js.native
    object TRIGGER extends TopLevel[TRIGGER with Double]
    
  }
  
}

