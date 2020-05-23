package typings.vara.mod

import typings.vara.varaStrings.center
import typings.vara.varaStrings.left
import typings.vara.varaStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProperties extends js.Object {
  /**
    * Whether to animate the text automatically
    */
  var autoAnimation: js.UndefOr[Boolean] = js.undefined
  /**
    * Color of the text
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    * Duration of the animation in milliseconds
    */
  var duration: js.UndefOr[Double] = js.undefined
  /**
    * Size of the text
    */
  var fontSize: js.UndefOr[Double] = js.undefined
  /**
    * Space between each character
    */
  var letterSpacing: js.UndefOr[Double] = js.undefined
  /**
    * Whether the animation should be in a queue
    */
  var queued: js.UndefOr[Boolean] = js.undefined
  /**
    * Width / Thickness of the stroke
    */
  var strokeWidth: js.UndefOr[Double] = js.undefined
  /**
    * Text align, accepted values are left,center,right
    */
  var textAlign: js.UndefOr[left | center | right] = js.undefined
}

object TextProperties {
  @scala.inline
  def apply(
    autoAnimation: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    duration: js.UndefOr[Double] = js.undefined,
    fontSize: js.UndefOr[Double] = js.undefined,
    letterSpacing: js.UndefOr[Double] = js.undefined,
    queued: js.UndefOr[Boolean] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    textAlign: left | center | right = null
  ): TextProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoAnimation)) __obj.updateDynamic("autoAnimation")(autoAnimation.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(letterSpacing)) __obj.updateDynamic("letterSpacing")(letterSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queued)) __obj.updateDynamic("queued")(queued.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProperties]
  }
}

