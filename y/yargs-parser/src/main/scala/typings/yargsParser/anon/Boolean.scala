package typings.yargsParser.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Boolean extends js.Object {
  var boolean: js.UndefOr[scala.Boolean] = js.undefined
  var key: String
  var number: js.UndefOr[scala.Boolean] = js.undefined
}

object Boolean {
  @scala.inline
  def apply(
    key: String,
    boolean: js.UndefOr[scala.Boolean] = js.undefined,
    number: js.UndefOr[scala.Boolean] = js.undefined
  ): Boolean = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(boolean)) __obj.updateDynamic("boolean")(boolean.get.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Boolean]
  }
}

