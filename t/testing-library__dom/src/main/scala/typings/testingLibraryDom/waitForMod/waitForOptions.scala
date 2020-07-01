package typings.testingLibraryDom.waitForMod

import typings.std.Error
import typings.std.HTMLElement
import typings.std.MutationObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait waitForOptions extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
  var interval: js.UndefOr[Double] = js.undefined
  var mutationObserverOptions: js.UndefOr[MutationObserverInit] = js.undefined
  var onTimeout: js.UndefOr[js.Function1[/* error */ Error, Error]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object waitForOptions {
  @scala.inline
  def apply(
    container: HTMLElement = null,
    interval: js.UndefOr[Double] = js.undefined,
    mutationObserverOptions: MutationObserverInit = null,
    onTimeout: /* error */ Error => Error = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): waitForOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(interval)) __obj.updateDynamic("interval")(interval.get.asInstanceOf[js.Any])
    if (mutationObserverOptions != null) __obj.updateDynamic("mutationObserverOptions")(mutationObserverOptions.asInstanceOf[js.Any])
    if (onTimeout != null) __obj.updateDynamic("onTimeout")(js.Any.fromFunction1(onTimeout))
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[waitForOptions]
  }
}

