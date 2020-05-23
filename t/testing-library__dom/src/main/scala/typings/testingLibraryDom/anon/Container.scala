package typings.testingLibraryDom.anon

import typings.std.HTMLElement
import typings.std.MutationObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Container extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var mutationObserverOptions: js.UndefOr[MutationObserverInit] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Container {
  @scala.inline
  def apply(
    container: HTMLElement = null,
    interval: js.UndefOr[Double] = js.undefined,
    mutationObserverOptions: MutationObserverInit = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): Container = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (mutationObserverOptions != null) __obj.updateDynamic("mutationObserverOptions")(mutationObserverOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Container]
  }
}

