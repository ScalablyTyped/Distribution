package typings.atUirouterCore.libTransitionMod

import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.atUirouterCore.libTransitionInterfaceMod.HookMatchCriterion
import typings.atUirouterCore.libTransitionInterfaceMod.IHookRegistry
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultTransOpts: TransitionOptions = js.native
  def makeEvent(
    registry: IHookRegistry,
    transitionService: typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
  def matchState(
    state: StateObject,
    criterion: HookMatchCriterion,
    transition: typings.atUirouterCore.libTransitionTransitionMod.Transition
  ): Boolean = js.native
}

