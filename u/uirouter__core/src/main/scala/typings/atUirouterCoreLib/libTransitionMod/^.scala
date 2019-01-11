package typings
package atUirouterCoreLib.libTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var defaultTransOpts: atUirouterCoreLib.libTransitionInterfaceMod.TransitionOptions = js.native
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
    criterion: atUirouterCoreLib.libTransitionInterfaceMod.HookMatchCriterion,
    transition: atUirouterCoreLib.libTransitionTransitionMod.Transition
  ): scala.Boolean = js.native
}

