package typings.uirouterCore.stateInterfaceMod

import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransitionPromise
  extends js.Promise[StateObject] {
  
  var transition: Transition = js.native
}
