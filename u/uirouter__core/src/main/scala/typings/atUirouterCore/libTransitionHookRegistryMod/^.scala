package typings.atUirouterCore.libTransitionHookRegistryMod

import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.atUirouterCore.libTransitionInterfaceMod.HookMatchCriterion
import typings.atUirouterCore.libTransitionInterfaceMod.IHookRegistry
import typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType
import typings.atUirouterCore.libTransitionTransitionMod.Transition
import typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition/hookRegistry", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def makeEvent(registry: IHookRegistry, transitionService: TransitionService, eventType: TransitionEventType): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
  def matchState(state: StateObject, criterion: HookMatchCriterion, transition: Transition): Boolean = js.native
}

