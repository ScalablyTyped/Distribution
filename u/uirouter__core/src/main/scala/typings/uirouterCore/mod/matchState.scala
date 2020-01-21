package typings.uirouterCore.mod

import typings.uirouterCore.transitionInterfaceMod.HookMatchCriterion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "matchState")
@js.native
object matchState extends js.Object {
  def apply(
    state: typings.uirouterCore.stateObjectMod.StateObject,
    criterion: HookMatchCriterion,
    transition: typings.uirouterCore.transitionTransitionMod.Transition
  ): Boolean = js.native
}

