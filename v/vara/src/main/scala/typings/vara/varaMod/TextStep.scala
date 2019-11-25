package typings.vara.varaMod

import typings.vara.Anon_X
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
  var fromCurrentPosition: js.UndefOr[Anon_X] = js.undefined
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
    delay: Int | Double = null,
    duration: Int | Double = null,
    fontSize: Int | Double = null,
    fromCurrentPosition: Anon_X = null,
    id: String | Double = null,
    letterSpacing: Int | Double = null,
    queued: js.UndefOr[Boolean] = js.undefined,
    strokeWidth: Int | Double = null,
    textAlign: left | center | right = null,
    x: Int | Double = null,
    y: Int | Double = null
  ): TextStep = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAnimation)) __obj.updateDynamic("autoAnimation")(autoAnimation.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fromCurrentPosition != null) __obj.updateDynamic("fromCurrentPosition")(fromCurrentPosition.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(queued)) __obj.updateDynamic("queued")(queued.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStep]
  }
}

