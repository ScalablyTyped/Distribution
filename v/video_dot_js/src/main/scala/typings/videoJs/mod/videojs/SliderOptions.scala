package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderOptions extends ComponentOptions {
  /**
    * Set property names to bar to match with the child Slider class is looking for
    */
  var barName: js.UndefOr[String] = js.undefined
  /**
    * Set a horizontal or vertical class on the slider depending on the slider type
    */
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object SliderOptions {
  @scala.inline
  def apply(
    barName: String = null,
    children: js.Array[Child] = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): SliderOptions = {
    val __obj = js.Dynamic.literal()
    if (barName != null) __obj.updateDynamic("barName")(barName.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderOptions]
  }
}

