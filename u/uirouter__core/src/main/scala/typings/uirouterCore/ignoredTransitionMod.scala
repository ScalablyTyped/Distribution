package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ignoredTransitionMod {
  
  @JSImport("@uirouter/core/lib/hooks/ignoredTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerIgnoredTransitionHook(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerIgnoredTransitionHook")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
