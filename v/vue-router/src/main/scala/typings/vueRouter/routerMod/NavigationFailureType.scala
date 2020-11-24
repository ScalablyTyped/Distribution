package typings.vueRouter.routerMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait NavigationFailureType extends js.Object
@JSImport("vue-router/types/router", "NavigationFailureType")
@js.native
object NavigationFailureType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NavigationFailureType with Double] = js.native
  
  @js.native
  sealed trait aborted extends NavigationFailureType
  /* 4 */ @js.native
  object aborted extends TopLevel[aborted with Double]
  
  @js.native
  sealed trait cancelled extends NavigationFailureType
  /* 8 */ @js.native
  object cancelled extends TopLevel[cancelled with Double]
  
  @js.native
  sealed trait duplicated extends NavigationFailureType
  /* 16 */ @js.native
  object duplicated extends TopLevel[duplicated with Double]
  
  @js.native
  sealed trait redirected extends NavigationFailureType
  /* 2 */ @js.native
  object redirected extends TopLevel[redirected with Double]
}
