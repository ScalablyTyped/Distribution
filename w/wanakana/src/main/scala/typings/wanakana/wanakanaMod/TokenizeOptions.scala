package typings.wanakana.wanakanaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TokenizeOptions extends js.Object {
  var compact: js.UndefOr[Boolean] = js.undefined
  var detailed: js.UndefOr[Boolean] = js.undefined
}

object TokenizeOptions {
  @scala.inline
  def apply(compact: js.UndefOr[Boolean] = js.undefined, detailed: js.UndefOr[Boolean] = js.undefined): TokenizeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(detailed)) __obj.updateDynamic("detailed")(detailed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenizeOptions]
  }
}

