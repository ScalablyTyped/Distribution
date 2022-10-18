package typings.uirouterCore

import typings.uirouterCore.libStateInterfaceMod.LazyLoadResult
import typings.uirouterCore.libStateInterfaceMod.StateDeclaration
import typings.uirouterCore.libTransitionTransitionMod.Transition
import typings.uirouterCore.libTransitionTransitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksLazyLoadMod {
  
  @JSImport("@uirouter/core/lib/hooks/lazyLoad", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def lazyLoadState(transition: Transition, state: StateDeclaration): js.Promise[LazyLoadResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("lazyLoadState")(transition.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[js.Promise[LazyLoadResult]]
  
  inline def registerLazyLoadHook(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLazyLoadHook")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
