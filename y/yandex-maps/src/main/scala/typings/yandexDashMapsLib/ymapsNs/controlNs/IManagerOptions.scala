package typings
package yandexDashMapsLib.ymapsNs.controlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManagerOptions extends js.Object {
  var margin: js.UndefOr[scala.Double] = js.undefined
  var pane: js.UndefOr[yandexDashMapsLib.ymapsNs.IPane] = js.undefined
  var states: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object IManagerOptions {
  @scala.inline
  def apply(
    margin: scala.Int | scala.Double = null,
    pane: yandexDashMapsLib.ymapsNs.IPane = null,
    states: js.Array[java.lang.String] = null
  ): IManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane)
    if (states != null) __obj.updateDynamic("states")(states)
    __obj.asInstanceOf[IManagerOptions]
  }
}

