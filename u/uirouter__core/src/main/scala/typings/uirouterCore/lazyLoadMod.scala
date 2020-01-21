package typings.uirouterCore

import typings.uirouterCore.stateInterfaceMod.LazyLoadResult
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.transitionServiceMod.TransitionService
import typings.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/hooks/lazyLoad", JSImport.Namespace)
@js.native
object lazyLoadMod extends js.Object {
  def lazyLoadState(transition: Transition, state: StateDeclaration): js.Promise[LazyLoadResult] = js.native
  def registerLazyLoadHook(transitionService: TransitionService): js.Function = js.native
}

