package typings
package atUirouterCoreLib.libGlobalsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/globals", "UIRouterGlobals")
@js.native
class UIRouterGlobals ()
  extends atUirouterCoreLib.libInterfaceMod.Disposable {
  /**
       * Current state (internal object)
       *
       * The to-state from the latest successful transition
       * @internalapi
       */
  @JSName("$current")
  var $current: atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
  /**
       * Current state
       *
       * The to-state from the latest successful transition
       */
  var current: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration = js.native
  /** @internalapi */
  var lastStartedTransitionId: scala.Double = js.native
  /**
       * Current parameter values
       *
       * The parameter values from the latest successful transition
       */
  var params: atUirouterCoreLib.libParamsStateParamsMod.StateParams = js.native
  /** @internalapi */
  var successfulTransitions: atUirouterCoreLib.libCommonQueueMod.Queue[atUirouterCoreLib.libTransitionTransitionMod.Transition] = js.native
  /**
       * The current started/running transition.
       * This transition has reached at least the onStart phase, but is not yet complete
       */
  var transition: atUirouterCoreLib.libTransitionTransitionMod.Transition = js.native
  /** @internalapi */
  var transitionHistory: atUirouterCoreLib.libCommonQueueMod.Queue[atUirouterCoreLib.libTransitionTransitionMod.Transition] = js.native
}

