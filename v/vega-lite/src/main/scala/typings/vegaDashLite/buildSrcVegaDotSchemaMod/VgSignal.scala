package typings.vegaDashLite.buildSrcVegaDotSchemaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VgSignal extends js.Object {
  var bind: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var name: String
  var on: js.UndefOr[js.Array[VgEventHandler]] = js.undefined
  var push: js.UndefOr[String] = js.undefined
  var react: js.UndefOr[Boolean] = js.undefined
  var update: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[String | Double | Boolean | js.Object | VgSignalRef] = js.undefined
}

object VgSignal {
  @scala.inline
  def apply(
    name: String,
    bind: String = null,
    description: String = null,
    on: js.Array[VgEventHandler] = null,
    push: String = null,
    react: js.UndefOr[Boolean] = js.undefined,
    update: String = null,
    value: String | Double | Boolean | js.Object | VgSignalRef = null
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

