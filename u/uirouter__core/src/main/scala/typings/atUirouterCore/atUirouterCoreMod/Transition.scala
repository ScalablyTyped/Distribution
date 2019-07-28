package typings.atUirouterCore.atUirouterCoreMod

import typings.atUirouterCore.TypeofClassTransition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "Transition")
@js.native
class Transition protected ()
  extends typings.atUirouterCore.libTransitionMod.Transition {
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
  def this(
    fromPath: js.Array[typings.atUirouterCore.libPathPathNodeMod.PathNode],
    targetState: typings.atUirouterCore.libStateTargetStateMod.TargetState,
    router: typings.atUirouterCore.libRouterMod.UIRouter
  ) = this()
}

/* static members */
@JSImport("@uirouter/core", "Transition")
@js.native
object Transition extends js.Object {
  /** @hidden */
  var diToken: TypeofClassTransition = js.native
}

