package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import typings.uirouterCore.transitionTransitionMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreResolvablesMod {
  
  @JSImport("@uirouter/core/lib/hooks/coreResolvables", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def registerAddCoreResolvables(transitionService: TransitionService): js.Function = ^.asInstanceOf[js.Dynamic].applyDynamic("registerAddCoreResolvables")(transitionService.asInstanceOf[js.Any]).asInstanceOf[js.Function]
  
  @scala.inline
  def treeChangesCleanup(trans: Transition): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("treeChangesCleanup")(trans.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
