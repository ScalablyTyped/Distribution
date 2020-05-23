package typings.tensorflowTfjsConverter.compiledApiMod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAny extends js.Object {
  /** Any typeUrl */
  var typeUrl: js.UndefOr[String | Null] = js.undefined
  /** Any value */
  var value: js.UndefOr[Uint8Array | Null] = js.undefined
}

object IAny {
  @scala.inline
  def apply(
    typeUrl: js.UndefOr[Null | String] = js.undefined,
    value: js.UndefOr[Null | Uint8Array] = js.undefined
  ): IAny = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(typeUrl)) __obj.updateDynamic("typeUrl")(typeUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAny]
  }
}

