package typings
package tediousLib.tediousMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DebugOptions extends js.Object {
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet data details (default: false).
    */
  var data: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet details (default: false).
    */
  var packet: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean, controlling whether debug events will be emitted with text describing packet payload details (default: false).
    */
  var payload: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A boolean, controlling whether debug events will be emitted with text describing token stream tokens (default: false).
    */
  var token: js.UndefOr[scala.Boolean] = js.undefined
}

object DebugOptions {
  @scala.inline
  def apply(
    data: js.UndefOr[scala.Boolean] = js.undefined,
    packet: js.UndefOr[scala.Boolean] = js.undefined,
    payload: js.UndefOr[scala.Boolean] = js.undefined,
    token: js.UndefOr[scala.Boolean] = js.undefined
  ): DebugOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(data)) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(packet)) __obj.updateDynamic("packet")(packet)
    if (!js.isUndefined(payload)) __obj.updateDynamic("payload")(payload)
    if (!js.isUndefined(token)) __obj.updateDynamic("token")(token)
    __obj.asInstanceOf[DebugOptions]
  }
}

