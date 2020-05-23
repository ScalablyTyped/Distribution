package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIkitScrollspyOptions extends js.Object {
  var cls: js.UndefOr[String] = js.undefined
  var delay: js.UndefOr[Double] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var `offset-left`: js.UndefOr[Double] = js.undefined
  var `offset-top`: js.UndefOr[Double] = js.undefined
  var repeat: js.UndefOr[Boolean] = js.undefined
}

object UIkitScrollspyOptions {
  @scala.inline
  def apply(
    cls: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    hidden: js.UndefOr[Boolean] = js.undefined,
    `offset-left`: js.UndefOr[Double] = js.undefined,
    `offset-top`: js.UndefOr[Double] = js.undefined,
    repeat: js.UndefOr[Boolean] = js.undefined
  ): UIkitScrollspyOptions = {
    val __obj = js.Dynamic.literal()
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`offset-left`)) __obj.updateDynamic("offset-left")(`offset-left`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(`offset-top`)) __obj.updateDynamic("offset-top")(`offset-top`.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitScrollspyOptions]
  }
}

