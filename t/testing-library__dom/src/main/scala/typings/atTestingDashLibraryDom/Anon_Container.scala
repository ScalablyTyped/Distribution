package typings.atTestingDashLibraryDom

import typings.std.HTMLElement
import typings.std.MutationObserverInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Container extends js.Object {
  var container: js.UndefOr[HTMLElement] = js.undefined
  var mutationObserverOptions: js.UndefOr[MutationObserverInit] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object Anon_Container {
  @scala.inline
  def apply(
    container: HTMLElement = null,
    mutationObserverOptions: MutationObserverInit = null,
    timeout: Int | Double = null
  ): Anon_Container = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (mutationObserverOptions != null) __obj.updateDynamic("mutationObserverOptions")(mutationObserverOptions)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Container]
  }
}

