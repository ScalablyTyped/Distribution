package typings.yandexDashMaps.yandexDashMapsMod.control

import typings.yandexDashMaps.yandexDashMapsMod.IPane
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IManagerOptions extends js.Object {
  var margin: js.UndefOr[Double] = js.undefined
  var pane: js.UndefOr[IPane] = js.undefined
  var states: js.UndefOr[js.Array[String]] = js.undefined
}

object IManagerOptions {
  @scala.inline
  def apply(margin: Int | Double = null, pane: IPane = null, states: js.Array[String] = null): IManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (pane != null) __obj.updateDynamic("pane")(pane.asInstanceOf[js.Any])
    if (states != null) __obj.updateDynamic("states")(states.asInstanceOf[js.Any])
    __obj.asInstanceOf[IManagerOptions]
  }
}

