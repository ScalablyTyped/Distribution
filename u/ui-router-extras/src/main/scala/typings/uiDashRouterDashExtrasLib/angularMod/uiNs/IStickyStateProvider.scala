package typings
package uiDashRouterDashExtrasLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sticky state provider
  */
trait IStickyStateProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  def debugMode(): scala.Boolean
  def enableDebug(enabled: scala.Boolean): scala.Boolean
  def registerStickyState(state: IStickyState): scala.Unit
}

object IStickyStateProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    debugMode: js.Function0[scala.Boolean],
    enableDebug: js.Function1[scala.Boolean, scala.Boolean],
    registerStickyState: js.Function1[IStickyState, scala.Unit]
  ): IStickyStateProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$get")($get)
    __obj.updateDynamic("debugMode")(debugMode)
    __obj.updateDynamic("enableDebug")(enableDebug)
    __obj.updateDynamic("registerStickyState")(registerStickyState)
    __obj.asInstanceOf[IStickyStateProvider]
  }
}

