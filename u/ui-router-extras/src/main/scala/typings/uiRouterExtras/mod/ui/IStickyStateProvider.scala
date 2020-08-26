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
  @scala.inline
  implicit class IStickyStateProviderOps[Self <: IStickyStateProvider] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDebugMode(value: () => Boolean): Self = this.set("debugMode", js.Any.fromFunction0(value))
    @scala.inline
    def setEnableDebug(value: Boolean => Boolean): Self = this.set("enableDebug", js.Any.fromFunction1(value))
    @scala.inline
    def setRegisterStickyState(value: IStickyState => Unit): Self = this.set("registerStickyState", js.Any.fromFunction1(value))
  }
  
}

