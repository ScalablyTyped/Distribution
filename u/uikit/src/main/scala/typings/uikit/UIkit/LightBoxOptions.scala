package typings.uikit.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LightBoxOptions extends js.Object {
  /**
    * Animation duration between gallery item change
    * @default 400
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Group name to group elements as a gallery to show.
    * @default false
    */
  var group: js.UndefOr[String] = js.undefined
  /**
    * Allow keyboard navigation
    * @default true
    */
  var keyboard: js.UndefOr[Boolean] = js.undefined
}

object LightBoxOptions {
  @scala.inline
  def apply(duration: Int | Double = null, group: String = null, keyboard: js.UndefOr[Boolean] = js.undefined): LightBoxOptions = {
    val __obj = js.Dynamic.literal()
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (group != null) __obj.updateDynamic("group")(group.asInstanceOf[js.Any])
    if (!js.isUndefined(keyboard)) __obj.updateDynamic("keyboard")(keyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LightBoxOptions]
  }
}

