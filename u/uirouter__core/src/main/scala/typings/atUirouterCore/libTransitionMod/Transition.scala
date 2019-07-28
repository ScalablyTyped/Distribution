package typings.atUirouterCore.libTransitionMod

import typings.atUirouterCore.TypeofClassTransition
import typings.atUirouterCore.libPathPathNodeMod.PathNode
import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libStateTargetStateMod.TargetState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition", "Transition")
@js.native
class Transition protected ()
  extends typings.atUirouterCore.libTransitionTransitionMod.Transition {
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
  def this(fromPath: js.Array[PathNode], targetState: TargetState, router: UIRouter) = this()
}

/* static members */
@JSImport("@uirouter/core/lib/transition", "Transition")
@js.native
object Transition extends js.Object {
  /** @hidden */
  var diToken: TypeofClassTransition = js.native
}

