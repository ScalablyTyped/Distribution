package typings.atUirouterCore.libStateInterfaceMod

import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.atUirouterCore.libTransitionTransitionMod.Transition
import typings.std.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitionPromise extends Promise[StateObject] {
  var transition: Transition = js.native
}

