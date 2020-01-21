package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/hooks/resolve", JSImport.Namespace)
@js.native
object resolveMod extends js.Object {
  val RESOLVE_HOOK_PRIORITY: js.Any = js.native
  def registerEagerResolvePath(transitionService: TransitionService): js.Function = js.native
  def registerLazyResolveState(transitionService: TransitionService): js.Function = js.native
  def registerResolveRemaining(transitionService: TransitionService): js.Function = js.native
}

