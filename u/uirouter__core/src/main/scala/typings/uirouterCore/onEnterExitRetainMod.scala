package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object onEnterExitRetainMod {
  
  @JSImport("@uirouter/core/lib/hooks/onEnterExitRetain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerOnEnterHook(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnEnterHook")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def registerOnExitHook(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnExitHook")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def registerOnRetainHook(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerOnRetainHook")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
}
