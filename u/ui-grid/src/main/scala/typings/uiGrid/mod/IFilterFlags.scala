package typings.uiGrid.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFilterFlags extends js.Object {
  var caseSensitive: js.UndefOr[Boolean] = js.undefined
}

object IFilterFlags {
  @scala.inline
  def apply(caseSensitive: js.UndefOr[Boolean] = js.undefined): IFilterFlags = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFilterFlags]
  }
}

