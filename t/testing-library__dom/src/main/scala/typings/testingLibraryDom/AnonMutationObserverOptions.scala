package typings.testingLibraryDom

import typings.std.HTMLElement
import typings.std.MutationObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMutationObserverOptions extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
  var mutationObserverOptions: js.UndefOr[MutationObserverInit] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object AnonMutationObserverOptions {
  @scala.inline
  def apply(
    container: HTMLElement = null,
    mutationObserverOptions: MutationObserverInit = null,
    timeout: Int | Double = null
  ): AnonMutationObserverOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (mutationObserverOptions != null) __obj.updateDynamic("mutationObserverOptions")(mutationObserverOptions.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMutationObserverOptions]
  }
}

