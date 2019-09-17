package typings.atTestingDashLibraryCypress.atTestingDashLibraryCypressMod

import typings.jquery.JQuery
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CTLMatcherOptions extends js.Object {
  var container: js.UndefOr[JQuery[HTMLElement]] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object CTLMatcherOptions {
  @scala.inline
  def apply(container: JQuery[HTMLElement] = null, timeout: Int | Double = null): CTLMatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (container != null) __obj.updateDynamic("container")(container)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CTLMatcherOptions]
  }
}

