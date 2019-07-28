package typings.videoDotJs.videoDotJsMod.videojsNs

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
    if (barName != null) __obj.updateDynamic("barName")(barName)
    if (children != null) __obj.updateDynamic("children")(children)
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical)
    __obj.asInstanceOf[SliderOptions]
  }
}

