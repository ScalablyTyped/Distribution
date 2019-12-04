package typings.atUirouterCore

import typings.atUirouterCore.libTransitionTransitionMod.Transition
import typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/hooks/coreResolvables", JSImport.Namespace)
@js.native
object libHooksCoreResolvablesMod extends js.Object {
  def registerAddCoreResolvables(transitionService: TransitionService): js.Function = js.native
  def treeChangesCleanup(trans: Transition): Unit = js.native
}

