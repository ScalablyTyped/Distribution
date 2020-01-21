package typings.uiRouterExtras.mod.ui

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sticky state provider
  */
@js.native
trait IStickyStateProvider extends IServiceProvider {
  def debugMode(): Boolean = js.native
  def enableDebug(enabled: Boolean): Boolean = js.native
  def registerStickyState(state: IStickyState): Unit = js.native
}

