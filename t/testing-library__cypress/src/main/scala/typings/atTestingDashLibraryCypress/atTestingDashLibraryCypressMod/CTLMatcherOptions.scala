package typings.atTestingDashLibraryCypress.atTestingDashLibraryCypressMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CTLMatcherOptions extends js.Object {
  var timeout: js.UndefOr[Double] = js.undefined
}

object CTLMatcherOptions {
  @scala.inline
  def apply(timeout: Int | Double = null): CTLMatcherOptions = {
    val __obj = js.Dynamic.literal()
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[CTLMatcherOptions]
  }
}

