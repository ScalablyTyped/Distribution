package typings.yargsParser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoolean extends js.Object {
  var boolean: js.UndefOr[Boolean] = js.undefined
  var key: String
  var number: js.UndefOr[Boolean] = js.undefined
}

object AnonBoolean {
  @scala.inline
  def apply(
    key: String,
    boolean: js.UndefOr[Boolean] = js.undefined,
    number: js.UndefOr[Boolean] = js.undefined
  ): AnonBoolean = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (!js.isUndefined(boolean)) __obj.updateDynamic("boolean")(boolean.asInstanceOf[js.Any])
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoolean]
  }
}

