package typings.uirouterCore.stateInterfaceMod

import typings.std.Promise
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionPromise extends Promise[StateObject] {
  var transition: Transition = js.native
}

