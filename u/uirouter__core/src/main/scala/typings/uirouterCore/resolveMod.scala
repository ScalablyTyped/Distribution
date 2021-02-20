package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveMod {
  
  @JSImport("@uirouter/core/lib/hooks/resolve", "RESOLVE_HOOK_PRIORITY")
  @js.native
  val RESOLVE_HOOK_PRIORITY: /* 1000 */ Double = js.native
  
  @JSImport("@uirouter/core/lib/hooks/resolve", "registerEagerResolvePath")
  @js.native
  def registerEagerResolvePath(transitionService: TransitionService): js.Function = js.native
  
  @JSImport("@uirouter/core/lib/hooks/resolve", "registerLazyResolveState")
  @js.native
  def registerLazyResolveState(transitionService: TransitionService): js.Function = js.native
  
  @JSImport("@uirouter/core/lib/hooks/resolve", "registerResolveRemaining")
  @js.native
  def registerResolveRemaining(transitionService: TransitionService): js.Function = js.native
}
