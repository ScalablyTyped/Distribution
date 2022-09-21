package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigationFailureType extends StObject
@JSImport("vue-router", "NavigationFailureType")
@js.native
object NavigationFailureType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NavigationFailureType & Double] = js.native
  
  /**
    * An aborted navigation is a navigation that failed because a navigation
    * guard returned `false` or called `next(false)`
    */
  @js.native
  sealed trait aborted
    extends StObject
       with NavigationFailureType
  /* 4 */ val aborted: typings.vueRouter.mod.NavigationFailureType.aborted & Double = js.native
  
  /**
    * A cancelled navigation is a navigation that failed because a more recent
    * navigation finished started (not necessarily finished).
    */
  @js.native
  sealed trait cancelled
    extends StObject
       with NavigationFailureType
  /* 8 */ val cancelled: typings.vueRouter.mod.NavigationFailureType.cancelled & Double = js.native
  
  /**
    * A duplicated navigation is a navigation that failed because it was
    * initiated while already being at the exact same location.
    */
  @js.native
  sealed trait duplicated
    extends StObject
       with NavigationFailureType
  /* 16 */ val duplicated: typings.vueRouter.mod.NavigationFailureType.duplicated & Double = js.native
}
