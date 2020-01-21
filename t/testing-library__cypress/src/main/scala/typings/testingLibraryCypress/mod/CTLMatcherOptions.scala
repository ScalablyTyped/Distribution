package typings.testingLibraryCypress.mod

import typings.cypress.JQuery_
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CTLMatcherOptions extends js.Object {
  var container: js.UndefOr[HTMLElement | JQuery_[HTMLElement]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object CTLMatcherOptions {
  @scala.inline
  def apply(container: HTMLElement | JQuery_[HTMLElement] = null, timeout: Int | Double = null): CTLMatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CTLMatcherOptions]
  }
}

