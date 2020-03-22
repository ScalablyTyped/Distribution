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
    delay: Int | Double = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    `offset-left`: Int | Double = null,
    `offset-top`: Int | Double = null,
    repeat: js.UndefOr[Boolean] = js.undefined
  ): UIkitScrollspyOptions = {
    val __obj = js.Dynamic.literal()
    if (cls != null) __obj.updateDynamic("cls")(cls.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden.asInstanceOf[js.Any])
    if (`offset-left` != null) __obj.updateDynamic("offset-left")(`offset-left`.asInstanceOf[js.Any])
    if (`offset-top` != null) __obj.updateDynamic("offset-top")(`offset-top`.asInstanceOf[js.Any])
    if (!js.isUndefined(repeat)) __obj.updateDynamic("repeat")(repeat.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitScrollspyOptions]
  }
}

