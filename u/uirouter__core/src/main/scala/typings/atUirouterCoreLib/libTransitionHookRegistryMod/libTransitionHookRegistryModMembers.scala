package typings
package atUirouterCoreLib.libTransitionHookRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition/hookRegistry", JSImport.Namespace)
@js.native
object libTransitionHookRegistryModMembers extends js.Object {
  def makeEvent(
    registry: atUirouterCoreLib.libTransitionInterfaceMod.IHookRegistry,
    transitionService: atUirouterCoreLib.libTransitionTransitionServiceMod.TransitionService,
    eventType: atUirouterCoreLib.libTransitionTransitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
  def matchState(
    state: atUirouterCoreLib.libStateStateObjectMod.StateObject,
    criterion: atUirouterCoreLib.libTransitionInterfaceMod.HookMatchCriterion
  ): scala.Boolean = js.native
}

