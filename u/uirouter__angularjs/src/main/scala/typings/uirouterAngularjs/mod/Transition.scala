package typings.uirouterAngularjs.mod

import typings.uirouterCore.anon.TypeofTransition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "Transition")
@js.native
class Transition protected ()
  extends typings.uirouterCore.mod.Transition {
  /**
    * Creates a new Transition object.
    *
    * If the target state is not valid, an error is thrown.
    *
    * @internal
    *
    * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
    *        encapsulates the "from state".
    * @param targetState The target state and parameters being transitioned to (also, the transition options)
    * @param router The [[UIRouter]] instance
    * @internal
    */
  def this(
    fromPath: js.Array[typings.uirouterCore.pathNodeMod.PathNode],
    targetState: typings.uirouterCore.targetStateMod.TargetState,
    router: typings.uirouterCore.routerMod.UIRouter
  ) = this()
}
/* static members */
object Transition {
  
  @JSImport("@uirouter/angularjs", "Transition")
  @js.native
  val ^ : js.Any = js.native
  
  /** @internal */
  @JSImport("@uirouter/angularjs", "Transition.diToken")
  @js.native
  def diToken: TypeofTransition = js.native
  @scala.inline
  def diToken_=(x: TypeofTransition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diToken")(x.asInstanceOf[js.Any])
}
