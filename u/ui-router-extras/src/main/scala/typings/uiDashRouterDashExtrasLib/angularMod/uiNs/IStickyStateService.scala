package typings
package uiDashRouterDashExtrasLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
         * Sticky state service
         */
@js.native
trait IStickyStateService extends js.Object {
  def getInactiveStates(): js.Array[IStickyState] = js.native
  /*
               * If there is an inactive state named inactiveStateName, this method exits that state.
               * If stateParams is provided, then the state is only exited if the params match the inactive params.
               * If inactiveStateName === '*', then all inactive states are exited
               */
  def reset(inactiveStateName: java.lang.String): scala.Unit = js.native
  /*
               * If there is an inactive state named inactiveStateName, this method exits that state.
               * If stateParams is provided, then the state is only exited if the params match the inactive params.
               * If inactiveStateName === '*', then all inactive states are exited
               */
  def reset(
    inactiveStateName: java.lang.String,
    stateParams: ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  ): scala.Unit = js.native
}

