package typings.vueRouter.routerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigationFailureType extends StObject
@JSImport("vue-router/types/router", "NavigationFailureType")
@js.native
object NavigationFailureType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NavigationFailureType & Double] = js.native
  
  @js.native
  sealed trait aborted
    extends StObject
       with NavigationFailureType
  /* 4 */ val aborted: typings.vueRouter.routerMod.NavigationFailureType.aborted & Double = js.native
  
  @js.native
  sealed trait cancelled
    extends StObject
       with NavigationFailureType
  /* 8 */ val cancelled: typings.vueRouter.routerMod.NavigationFailureType.cancelled & Double = js.native
  
  @js.native
  sealed trait duplicated
    extends StObject
       with NavigationFailureType
  /* 16 */ val duplicated: typings.vueRouter.routerMod.NavigationFailureType.duplicated & Double = js.native
  
  @js.native
  sealed trait redirected
    extends StObject
       with NavigationFailureType
  /* 2 */ val redirected: typings.vueRouter.routerMod.NavigationFailureType.redirected & Double = js.native
}
