package typings.atTypescriptDashEslintExperimentalDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Browser extends js.Object {
  var browser: js.UndefOr[Boolean] = js.undefined
}

object Anon_Browser {
  @scala.inline
  def apply(browser: js.UndefOr[Boolean] = js.undefined): Anon_Browser = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(browser)) __obj.updateDynamic("browser")(browser)
    __obj.asInstanceOf[Anon_Browser]
  }
}

