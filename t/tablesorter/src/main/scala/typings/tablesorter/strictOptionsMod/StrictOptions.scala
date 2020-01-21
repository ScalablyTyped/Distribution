package typings.tablesorter.strictOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictOptions extends js.Object {
  /**
    * A value indicatin whether only exact matching values should be included.
    */
  var exactMatch: js.UndefOr[Boolean] = js.undefined
}

object StrictOptions {
  @scala.inline
  def apply(exactMatch: js.UndefOr[Boolean] = js.undefined): StrictOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exactMatch)) __obj.updateDynamic("exactMatch")(exactMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictOptions]
  }
}

