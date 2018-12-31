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

