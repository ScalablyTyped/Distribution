package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateGlobalsMod {
  
  @JSImport("@uirouter/core/lib/hooks/updateGlobals", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerUpdateGlobalState(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerUpdateGlobalState")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
