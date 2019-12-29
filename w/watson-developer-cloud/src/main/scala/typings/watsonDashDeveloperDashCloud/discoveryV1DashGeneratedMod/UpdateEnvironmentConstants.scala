package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `updateEnvironment` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "UpdateEnvironmentConstants")
@js.native
object UpdateEnvironmentConstants extends js.Object {
  @js.native
  sealed trait Size extends js.Object
  
  /** Size that the environment should be increased to. Environment size cannot be modified when using a Lite plan. Environment size can only increased and not decreased. */
  @js.native
  object Size extends js.Object {
    @js.native
    sealed trait L extends Size
    
    @js.native
    sealed trait M extends Size
    
    @js.native
    sealed trait ML extends Size
    
    @js.native
    sealed trait MS extends Size
    
    @js.native
    sealed trait S extends Size
    
    @js.native
    sealed trait XL extends Size
    
    @js.native
    sealed trait XXL extends Size
    
    @js.native
    sealed trait XXXL extends Size
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Size with String] = js.native
    /* "L" */ @js.native
    object L extends TopLevel[L with String]
    
    /* "M" */ @js.native
    object M extends TopLevel[M with String]
    
    /* "ML" */ @js.native
    object ML extends TopLevel[ML with String]
    
    /* "MS" */ @js.native
    object MS extends TopLevel[MS with String]
    
    /* "S" */ @js.native
    object S extends TopLevel[S with String]
    
    /* "XL" */ @js.native
    object XL extends TopLevel[XL with String]
    
    /* "XXL" */ @js.native
    object XXL extends TopLevel[XXL with String]
    
    /* "XXXL" */ @js.native
    object XXXL extends TopLevel[XXXL with String]
    
  }
  
}

