package typings
package atUirouterCoreLib.libTransitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition", "Transition")
@js.native
class Transition protected ()
  extends atUirouterCoreLib.libTransitionTransitionMod.Transition {
  /**
    * Creates a new Transition object.
    *
    * If the target state is not valid, an error is thrown.
    *
    * @internalapi
    *
    * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
    *        encapsulates the "from state".
    * @param targetState The target state and parameters being transitioned to (also, the transition options)
    * @param router The [[UIRouter]] instance
    */
  def this(fromPath: js.Array[atUirouterCoreLib.libPathPathNodeMod.PathNode], targetState: atUirouterCoreLib.libStateTargetStateMod.TargetState, router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
}

/* static members */
@JSImport("@uirouter/core/lib/transition", "Transition")
@js.native
object Transition extends js.Object {
  /** @hidden */
  var diToken: atUirouterCoreLib.TypeofClassTransition = js.native
}

