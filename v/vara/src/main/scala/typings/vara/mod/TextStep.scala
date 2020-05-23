package typings.vara.mod

import typings.vara.anon.X
import typings.vara.varaStrings.center
import typings.vara.varaStrings.left
import typings.vara.varaStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStep extends TextProperties {
  /**
    * Delay before the animation starts in milliseconds
    */
  var delay: js.UndefOr[Double] = js.undefined
  /**
    * Whether the x or y coordinate should be from its calculated position,
    * ie the position if x or y coordinates were not applied
    */
  var fromCurrentPosition: js.UndefOr[X] = js.undefined
  /**
    * String or integer, for if animations are called manually or when using the get() method.
    * Default is the index of the object.
    */
  var id: js.UndefOr[String | Double] = js.undefined
  /**
    * Text to be shown
    */
  var text: String
  /**
    * x coordinate of the text
    */
  var x: js.UndefOr[Double] = js.undefined
  /**
    * y coordinate of the text
    */
  var y: js.UndefOr[Double] = js.undefined
}

object TextStep {
  @scala.inline
  def apply(
    text: String,
    autoAnimation: js.UndefOr[Boolean] = js.undefined,
    color: String = null,
    delay: js.UndefOr[Double] = js.undefined,
    duration: js.UndefOr[Double] = js.undefined,
    fontSize: js.UndefOr[Double] = js.undefined,
    fromCurrentPosition: X = null,
    id: String | Double = null,
    letterSpacing: js.UndefOr[Double] = js.undefined,
    queued: js.UndefOr[Boolean] = js.undefined,
    strokeWidth: js.UndefOr[Double] = js.undefined,
    textAlign: left | center | right = null,
    x: js.UndefOr[Double] = js.undefined,
    y: js.UndefOr[Double] = js.undefined
  ): TextStep = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAnimation)) __obj.updateDynamic("autoAnimation")(autoAnimation.get.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(delay)) __obj.updateDynamic("delay")(delay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(duration)) __obj.updateDynamic("duration")(duration.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fontSize)) __obj.updateDynamic("fontSize")(fontSize.get.asInstanceOf[js.Any])
    if (fromCurrentPosition != null) __obj.updateDynamic("fromCurrentPosition")(fromCurrentPosition.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(letterSpacing)) __obj.updateDynamic("letterSpacing")(letterSpacing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queued)) __obj.updateDynamic("queued")(queued.get.asInstanceOf[js.Any])
    if (!js.isUndefined(strokeWidth)) __obj.updateDynamic("strokeWidth")(strokeWidth.get.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStep]
  }
}

