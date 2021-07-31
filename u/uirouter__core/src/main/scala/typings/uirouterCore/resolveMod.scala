package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveMod {
  
  @JSImport("@uirouter/core/lib/hooks/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/hooks/resolve", "RESOLVE_HOOK_PRIORITY")
  @js.native
  val RESOLVE_HOOK_PRIORITY: /* 1000 */ Double = js.native
  
  @scala.inline
  def registerEagerResolvePath(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerEagerResolvePath")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def registerLazyResolveState(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLazyResolveState")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def registerResolveRemaining(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerResolveRemaining")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
