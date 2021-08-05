package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invalidTransitionMod {
  
  @JSImport("@uirouter/core/lib/hooks/invalidTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerInvalidTransitionHook(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerInvalidTransitionHook")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
