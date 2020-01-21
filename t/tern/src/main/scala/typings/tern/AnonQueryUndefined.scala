package typings.tern

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryUndefined extends js.Object {
  var query: js.UndefOr[scala.Nothing] = js.undefined
}

object AnonQueryUndefined {
  @scala.inline
  def apply(query: js.UndefOr[scala.Nothing] = js.undefined): AnonQueryUndefined = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(query)) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueryUndefined]
  }
}

