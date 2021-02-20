package typings.vueRouter.routerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigationFailureType extends StObject
@JSImport("vue-router/types/router", "NavigationFailureType")
@js.native
object NavigationFailureType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NavigationFailureType with Double] = js.native
  
  @js.native
  sealed trait aborted extends NavigationFailureType
  /* 4 */ val aborted: typings.vueRouter.routerMod.NavigationFailureType.aborted with Double = js.native
  
  @js.native
  sealed trait cancelled extends NavigationFailureType
  /* 8 */ val cancelled: typings.vueRouter.routerMod.NavigationFailureType.cancelled with Double = js.native
  
  @js.native
  sealed trait duplicated extends NavigationFailureType
  /* 16 */ val duplicated: typings.vueRouter.routerMod.NavigationFailureType.duplicated with Double = js.native
  
  @js.native
  sealed trait redirected extends NavigationFailureType
  /* 2 */ val redirected: typings.vueRouter.routerMod.NavigationFailureType.redirected with Double = js.native
}
