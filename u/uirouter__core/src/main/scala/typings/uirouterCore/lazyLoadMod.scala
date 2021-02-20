package typings.uirouterCore

import typings.uirouterCore.stateInterfaceMod.LazyLoadResult
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.transitionServiceMod.TransitionService
import typings.uirouterCore.transitionTransitionMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lazyLoadMod {
  
  @JSImport("@uirouter/core/lib/hooks/lazyLoad", "lazyLoadState")
  @js.native
  def lazyLoadState(transition: Transition, state: StateDeclaration): js.Promise[LazyLoadResult] = js.native
  
  @JSImport("@uirouter/core/lib/hooks/lazyLoad", "registerLazyLoadHook")
  @js.native
  def registerLazyLoadHook(transitionService: TransitionService): js.Function = js.native
}
