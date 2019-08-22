package typings.atTypescriptDashEslintExperimentalDashUtils

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GlobalReturn extends js.Object {
  var globalReturn: js.UndefOr[Boolean] = js.undefined
  var jsx: js.UndefOr[Boolean] = js.undefined
}

object Anon_GlobalReturn {
  @scala.inline
  def apply(globalReturn: js.UndefOr[Boolean] = js.undefined, jsx: js.UndefOr[Boolean] = js.undefined): Anon_GlobalReturn = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(globalReturn)) __obj.updateDynamic("globalReturn")(globalReturn)
    if (!js.isUndefined(jsx)) __obj.updateDynamic("jsx")(jsx)
    __obj.asInstanceOf[Anon_GlobalReturn]
  }
}

