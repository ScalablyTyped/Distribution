package typings.uiRouterExtras.mod.ui

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Sticky state provider
  */
trait IStickyStateProvider extends IServiceProvider {
  def debugMode(): Boolean
  def enableDebug(enabled: Boolean): Boolean
  def registerStickyState(state: IStickyState): Unit
}

object IStickyStateProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    debugMode: () => Boolean,
    enableDebug: Boolean => Boolean,
    registerStickyState: IStickyState => Unit
  ): IStickyStateProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], debugMode = js.Any.fromFunction0(debugMode), enableDebug = js.Any.fromFunction1(enableDebug), registerStickyState = js.Any.fromFunction1(registerStickyState))
    __obj.asInstanceOf[IStickyStateProvider]
  }
}

