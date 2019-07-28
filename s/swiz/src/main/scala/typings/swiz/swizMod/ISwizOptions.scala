package typings.swiz.swizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwizOptions extends js.Object {
  var `for`: js.UndefOr[String] = js.undefined
  var stripNulls: js.UndefOr[Boolean] = js.undefined
  var stripSerializerType: js.UndefOr[Boolean] = js.undefined
}

object ISwizOptions {
  @scala.inline
  def apply(
    `for`: String = null,
    stripNulls: js.UndefOr[Boolean] = js.undefined,
    stripSerializerType: js.UndefOr[Boolean] = js.undefined
  ): ISwizOptions = {
    val __obj = js.Dynamic.literal()
    if (`for` != null) __obj.updateDynamic("for")(`for`)
    if (!js.isUndefined(stripNulls)) __obj.updateDynamic("stripNulls")(stripNulls)
    if (!js.isUndefined(stripSerializerType)) __obj.updateDynamic("stripSerializerType")(stripSerializerType)
    __obj.asInstanceOf[ISwizOptions]
  }
}

