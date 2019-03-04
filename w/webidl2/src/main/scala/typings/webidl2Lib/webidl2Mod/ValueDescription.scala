package typings
package webidl2Lib.webidl2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueDescription extends js.Object {
  var negative: scala.Boolean | scala.Null
  var `type`: webidl2Lib.webidl2LibStrings.string | webidl2Lib.webidl2LibStrings.number | webidl2Lib.webidl2LibStrings.boolean | webidl2Lib.webidl2LibStrings.`null` | webidl2Lib.webidl2LibStrings.Infinity | webidl2Lib.webidl2LibStrings.NaN | webidl2Lib.webidl2LibStrings.sequence
  var value: java.lang.String | js.Array[_] | scala.Null
}

object ValueDescription {
  @scala.inline
  def apply(
    `type`: webidl2Lib.webidl2LibStrings.string | webidl2Lib.webidl2LibStrings.number | webidl2Lib.webidl2LibStrings.boolean | webidl2Lib.webidl2LibStrings.`null` | webidl2Lib.webidl2LibStrings.Infinity | webidl2Lib.webidl2LibStrings.NaN | webidl2Lib.webidl2LibStrings.sequence,
    negative: js.UndefOr[scala.Boolean] = js.undefined,
    value: java.lang.String | js.Array[_] = null
  ): ValueDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
}

