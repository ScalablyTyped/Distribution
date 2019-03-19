package typings
package varaLib.varaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextStep extends TextProperties {
  /**
    * Delay before the animation starts in milliseconds
    */
  var delay: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the x or y coordinate should be from its calculated position,
    * ie the position if x or y coordinates were not applied
    */
  var fromCurrentPosition: js.UndefOr[varaLib.Anon_X] = js.undefined
  /**
    * String or integer, for if animations are called manually or when using the get() method.
    * Default is the index of the object.
    */
  var id: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Text to be shown
    */
  var text: java.lang.String
  /**
    * x coordinate of the text
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * y coordinate of the text
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object TextStep {
  @scala.inline
  def apply(
    text: java.lang.String,
    autoAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    delay: scala.Int | scala.Double = null,
    duration: scala.Int | scala.Double = null,
    fontSize: scala.Int | scala.Double = null,
    fromCurrentPosition: varaLib.Anon_X = null,
    id: java.lang.String | scala.Double = null,
    letterSpacing: scala.Int | scala.Double = null,
    queued: js.UndefOr[scala.Boolean] = js.undefined,
    strokeWidth: scala.Int | scala.Double = null,
    textAlign: varaLib.varaLibStrings.left | varaLib.varaLibStrings.center | varaLib.varaLibStrings.right = null,
    x: scala.Int | scala.Double = null,
    y: scala.Int | scala.Double = null
  ): TextStep = {
    val __obj = js.Dynamic.literal(text = text)
    if (!js.isUndefined(autoAnimation)) __obj.updateDynamic("autoAnimation")(autoAnimation)
    if (color != null) __obj.updateDynamic("color")(color)
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (fromCurrentPosition != null) __obj.updateDynamic("fromCurrentPosition")(fromCurrentPosition)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(queued)) __obj.updateDynamic("queued")(queued)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextStep]
  }
}

