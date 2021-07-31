package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object redirectToMod {
  
  @JSImport("@uirouter/core/lib/hooks/redirectTo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerRedirectToHook(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerRedirectToHook")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
