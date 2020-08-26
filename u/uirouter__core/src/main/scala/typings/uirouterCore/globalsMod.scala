package typings.uirouterCore

import typings.uirouterCore.interfaceMod.Disposable
import typings.uirouterCore.queueMod.Queue
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.stateParamsMod.StateParams
import typings.uirouterCore.transitionTransitionMod.Transition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/globals", JSImport.Namespace)
@js.native
object globalsMod extends js.Object {
  @js.native
  class UIRouterGlobals () extends Disposable {
    /**
      * Current state (internal object)
      *
      * The to-state from the latest successful transition
      * @internal
      */
    @JSName("$current")
    var $current: StateObject = js.native
    /**
      * Current state
      *
      * The to-state from the latest successful transition
      */
    var current: StateDeclaration = js.native
    /** @internal */
    var lastStartedTransitionId: Double = js.native
    /**
      * Current parameter values
      *
      * The parameter values from the latest successful transition
      */
    var params: StateParams = js.native
    /** @internal */
    var successfulTransitions: Queue[Transition] = js.native
    /**
      * The current started/running transition.
      * This transition has reached at least the onStart phase, but is not yet complete
      */
    var transition: Transition = js.native
    /** @internal */
    var transitionHistory: Queue[Transition] = js.native
  }
  
}

