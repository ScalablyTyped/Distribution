package typings
package uiDashRouterDashExtrasLib.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sticky state provider
  */
trait IStickyStateProvider
  extends angularLib.angularMod.IServiceProvider {
  def debugMode(): scala.Boolean
  def enableDebug(enabled: scala.Boolean): scala.Boolean
  def registerStickyState(state: IStickyState): scala.Unit
}

object IStickyStateProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    debugMode: () => scala.Boolean,
    enableDebug: scala.Boolean => scala.Boolean,
    registerStickyState: IStickyState => scala.Unit
  ): IStickyStateProvider = {
    val __obj = js.Dynamic.literal($get = $get, debugMode = js.Any.fromFunction0(debugMode), enableDebug = js.Any.fromFunction1(enableDebug), registerStickyState = js.Any.fromFunction1(registerStickyState))
  
    __obj.asInstanceOf[IStickyStateProvider]
  }
}

