package typings
package vegaDashLiteLib.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgSignal extends js.Object {
  var bind: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var name: java.lang.String
  var on: js.UndefOr[js.Array[VgEventHandler]] = js.undefined
  var push: js.UndefOr[java.lang.String] = js.undefined
  var react: js.UndefOr[scala.Boolean] = js.undefined
  var update: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[java.lang.String | scala.Double | scala.Boolean | js.Object | VgSignalRef] = js.undefined
}

object VgSignal {
  @scala.inline
  def apply(
    name: java.lang.String,
    bind: java.lang.String = null,
    description: java.lang.String = null,
    on: js.Array[VgEventHandler] = null,
    push: java.lang.String = null,
    react: js.UndefOr[scala.Boolean] = js.undefined,
    update: java.lang.String = null,
    value: java.lang.String | scala.Double | scala.Boolean | js.Object | VgSignalRef = null
  ): VgSignal = {
    val __obj = js.Dynamic.literal(name = name)
    if (bind != null) __obj.updateDynamic("bind")(bind)
    if (description != null) __obj.updateDynamic("description")(description)
    if (on != null) __obj.updateDynamic("on")(on)
    if (push != null) __obj.updateDynamic("push")(push)
    if (!js.isUndefined(react)) __obj.updateDynamic("react")(react)
    if (update != null) __obj.updateDynamic("update")(update)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[VgSignal]
  }
}

