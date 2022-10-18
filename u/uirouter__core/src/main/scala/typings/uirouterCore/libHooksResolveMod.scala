package typings.uirouterCore

import typings.uirouterCore.libTransitionTransitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksResolveMod {
  
  @JSImport("@uirouter/core/lib/hooks/resolve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/hooks/resolve", "RESOLVE_HOOK_PRIORITY")
  @js.native
  val RESOLVE_HOOK_PRIORITY: /* 1000 */ Double = js.native
  
  inline def registerEagerResolvePath(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerEagerResolvePath")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def registerLazyResolveState(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLazyResolveState")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def registerResolveRemaining(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerResolveRemaining")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
