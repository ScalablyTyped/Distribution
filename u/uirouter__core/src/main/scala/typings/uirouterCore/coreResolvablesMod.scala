package typings.uirouterCore

import typings.uirouterCore.transitionServiceMod.TransitionService
import typings.uirouterCore.transitionTransitionMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object coreResolvablesMod {
  
  @JSImport("@uirouter/core/lib/hooks/coreResolvables", "registerAddCoreResolvables")
  @js.native
  def registerAddCoreResolvables(transitionService: TransitionService): js.Function = js.native
  
  @JSImport("@uirouter/core/lib/hooks/coreResolvables", "treeChangesCleanup")
  @js.native
  def treeChangesCleanup(trans: Transition): Unit = js.native
}
