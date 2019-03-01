package typings
package yandexDashMapsLib.ymapsNs.behaviorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDragOptions extends js.Object {
  var actionCursor: js.UndefOr[java.lang.String] = js.undefined
  var cursor: js.UndefOr[java.lang.String] = js.undefined
  var inertia: js.UndefOr[scala.Boolean] = js.undefined
  var inertiaDuration: js.UndefOr[scala.Double] = js.undefined
  var tremor: js.UndefOr[scala.Double] = js.undefined
}

object IDragOptions {
  @scala.inline
  def apply(
    actionCursor: java.lang.String = null,
    cursor: java.lang.String = null,
    inertia: js.UndefOr[scala.Boolean] = js.undefined,
    inertiaDuration: scala.Int | scala.Double = null,
    tremor: scala.Int | scala.Double = null
  ): IDragOptions = {
    val __obj = js.Dynamic.literal()
    if (actionCursor != null) __obj.updateDynamic("actionCursor")(actionCursor)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor)
    if (!js.isUndefined(inertia)) __obj.updateDynamic("inertia")(inertia)
    if (inertiaDuration != null) __obj.updateDynamic("inertiaDuration")(inertiaDuration.asInstanceOf[js.Any])
    if (tremor != null) __obj.updateDynamic("tremor")(tremor.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDragOptions]
  }
}

