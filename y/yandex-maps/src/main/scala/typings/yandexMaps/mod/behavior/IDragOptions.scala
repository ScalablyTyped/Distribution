package typings.yandexMaps.mod.behavior

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragOptions extends js.Object {
  var actionCursor: js.UndefOr[String] = js.undefined
  var cursor: js.UndefOr[String] = js.undefined
  var inertia: js.UndefOr[Boolean] = js.undefined
  var inertiaDuration: js.UndefOr[Double] = js.undefined
  var tremor: js.UndefOr[Double] = js.undefined
}

object IDragOptions {
  @scala.inline
  def apply(
    actionCursor: String = null,
    cursor: String = null,
    inertia: js.UndefOr[Boolean] = js.undefined,
    inertiaDuration: js.UndefOr[Double] = js.undefined,
    tremor: js.UndefOr[Double] = js.undefined
  ): IDragOptions = {
    val __obj = js.Dynamic.literal()
    if (actionCursor != null) __obj.updateDynamic("actionCursor")(actionCursor.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inertiaDuration)) __obj.updateDynamic("inertiaDuration")(inertiaDuration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(tremor)) __obj.updateDynamic("tremor")(tremor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragOptions]
  }
}

