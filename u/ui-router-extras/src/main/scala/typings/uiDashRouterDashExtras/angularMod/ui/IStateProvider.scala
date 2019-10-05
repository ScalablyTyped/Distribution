package typings.uiDashRouterDashExtras.angularMod.ui

import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStateProvider extends IServiceProvider {
  def state(config: IStickyState): IStateProvider = js.native
  def state(name: String, config: IStickyState): IStateProvider = js.native
}

