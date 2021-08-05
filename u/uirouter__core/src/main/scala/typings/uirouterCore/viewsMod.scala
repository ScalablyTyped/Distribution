package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewsMod {
  
  @JSImport("@uirouter/core/lib/hooks/views", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerActivateViews(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerActivateViews")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  inline def registerLoadEnteringViews(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadEnteringViews")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
