package typings.umd.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var commonJS: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(commonJS: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commonJS)) __obj.updateDynamic("commonJS")(commonJS.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

