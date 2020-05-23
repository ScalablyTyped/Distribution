package typings.testingLibraryCypress.mod

import typings.cypress.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CTLMatcherOptions extends js.Object {
  var container: js.UndefOr[HTMLElement | JQuery[HTMLElement]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object CTLMatcherOptions {
  @scala.inline
  def apply(container: HTMLElement | JQuery[HTMLElement] = null, timeout: js.UndefOr[Double] = js.undefined): CTLMatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CTLMatcherOptions]
  }
}

