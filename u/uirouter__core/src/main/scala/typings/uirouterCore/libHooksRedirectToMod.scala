package typings.uirouterCore

import typings.uirouterCore.libTransitionTransitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHooksRedirectToMod {
  
  @JSImport("@uirouter/core/lib/hooks/redirectTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerRedirectToHook(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRedirectToHook")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
