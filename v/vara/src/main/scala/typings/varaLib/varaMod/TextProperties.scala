package typings
package varaLib.varaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextProperties extends js.Object {
  /**
    * Whether to animate the text automatically
    */
  var autoAnimation: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Color of the text
    */
  var color: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Duration of the animation in milliseconds
    */
  var duration: js.UndefOr[scala.Double] = js.undefined
  /**
    * Size of the text
    */
  var fontSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Space between each character
    */
  var letterSpacing: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether the animation should be in a queue
    */
  var queued: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Width / Thickness of the stroke
    */
  var strokeWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Text align, accepted values are left,center,right
    */
  var textAlign: js.UndefOr[
    varaLib.varaLibStrings.left | varaLib.varaLibStrings.center | varaLib.varaLibStrings.right
  ] = js.undefined
}

object TextProperties {
  @scala.inline
  def apply(
    autoAnimation: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    duration: scala.Int | scala.Double = null,
    fontSize: scala.Int | scala.Double = null,
    letterSpacing: scala.Int | scala.Double = null,
    queued: js.UndefOr[scala.Boolean] = js.undefined,
    strokeWidth: scala.Int | scala.Double = null,
    textAlign: varaLib.varaLibStrings.left | varaLib.varaLibStrings.center | varaLib.varaLibStrings.right = null
  ): TextProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoAnimation)) __obj.updateDynamic("autoAnimation")(autoAnimation)
    if (color != null) __obj.updateDynamic("color")(color)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (fontSize != null) __obj.updateDynamic("fontSize")(fontSize.asInstanceOf[js.Any])
    if (letterSpacing != null) __obj.updateDynamic("letterSpacing")(letterSpacing.asInstanceOf[js.Any])
    if (!js.isUndefined(queued)) __obj.updateDynamic("queued")(queued)
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextProperties]
  }
}

