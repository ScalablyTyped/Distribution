package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgEventHandler extends js.Object {
  var between: js.UndefOr[js.Array[_]] = js.undefined
  var encode: js.UndefOr[java.lang.String] = js.undefined
  var events: js.Array[java.lang.String] | VgSignalRef
  var force: js.UndefOr[scala.Boolean] = js.undefined
  var update: js.UndefOr[java.lang.String] = js.undefined
}

object VgEventHandler {
  @scala.inline
  def apply(
    events: js.Array[java.lang.String] | VgSignalRef,
    between: js.Array[_] = null,
    encode: java.lang.String = null,
    force: js.UndefOr[scala.Boolean] = js.undefined,
    update: java.lang.String = null
  ): VgEventHandler = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    if (between != null) __obj.updateDynamic("between")(between)
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[VgEventHandler]
  }
}

