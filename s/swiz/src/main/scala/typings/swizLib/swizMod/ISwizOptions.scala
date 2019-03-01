package typings
package swizLib.swizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISwizOptions extends js.Object {
  var `for`: js.UndefOr[java.lang.String] = js.undefined
  var stripNulls: js.UndefOr[scala.Boolean] = js.undefined
  var stripSerializerType: js.UndefOr[scala.Boolean] = js.undefined
}

object ISwizOptions {
  @scala.inline
  def apply(
    `for`: java.lang.String = null,
    stripNulls: js.UndefOr[scala.Boolean] = js.undefined,
    stripSerializerType: js.UndefOr[scala.Boolean] = js.undefined
  ): ISwizOptions = {
    val __obj = js.Dynamic.literal()
    if (`for` != null) __obj.updateDynamic("for")(`for`)
    if (!js.isUndefined(stripNulls)) __obj.updateDynamic("stripNulls")(stripNulls)
    if (!js.isUndefined(stripSerializerType)) __obj.updateDynamic("stripSerializerType")(stripSerializerType)
    __obj.asInstanceOf[ISwizOptions]
  }
}

