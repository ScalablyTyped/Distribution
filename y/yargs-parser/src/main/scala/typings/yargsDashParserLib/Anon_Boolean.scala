package typings
package yargsDashParserLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Boolean extends js.Object {
  var boolean: js.UndefOr[scala.Boolean] = js.undefined
  var key: java.lang.String
  var number: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Boolean {
  @scala.inline
  def apply(
    key: java.lang.String,
    boolean: js.UndefOr[scala.Boolean] = js.undefined,
    number: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Boolean = {
    val __obj = js.Dynamic.literal(key = key)
    if (!js.isUndefined(boolean)) __obj.updateDynamic("boolean")(boolean)
    if (!js.isUndefined(number)) __obj.updateDynamic("number")(number)
    __obj.asInstanceOf[Anon_Boolean]
  }
}

