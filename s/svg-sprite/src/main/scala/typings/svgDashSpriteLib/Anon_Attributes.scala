package typings
package svgDashSpriteLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Attributes extends js.Object {
  /**
    * Width and height attributes on embedded shapes
    */
  var attributes: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Max. shape height
    */
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Max. shape width
    */
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Floating point precision
    */
  var precision: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Attributes {
  @scala.inline
  def apply(
    attributes: js.UndefOr[scala.Boolean] = js.undefined,
    maxHeight: scala.Int | scala.Double = null,
    maxWidth: scala.Int | scala.Double = null,
    precision: scala.Int | scala.Double = null
  ): Anon_Attributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attributes)) __obj.updateDynamic("attributes")(attributes)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Attributes]
  }
}

