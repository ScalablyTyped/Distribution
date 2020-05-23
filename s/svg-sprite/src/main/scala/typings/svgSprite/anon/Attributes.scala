package typings.svgSprite.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attributes extends js.Object {
  /**
    * Width and height attributes on embedded shapes
    */
  var attributes: js.UndefOr[Boolean] = js.undefined
  /**
    * Max. shape height
    */
  var maxHeight: js.UndefOr[Double] = js.undefined
  /**
    * Max. shape width
    */
  var maxWidth: js.UndefOr[Double] = js.undefined
  /**
    * Floating point precision
    */
  var precision: js.UndefOr[Double] = js.undefined
}

object Attributes {
  @scala.inline
  def apply(
    attributes: js.UndefOr[Boolean] = js.undefined,
    maxHeight: js.UndefOr[Double] = js.undefined,
    maxWidth: js.UndefOr[Double] = js.undefined,
    precision: js.UndefOr[Double] = js.undefined
  ): Attributes = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(attributes)) __obj.updateDynamic("attributes")(attributes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxHeight)) __obj.updateDynamic("maxHeight")(maxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxWidth)) __obj.updateDynamic("maxWidth")(maxWidth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(precision)) __obj.updateDynamic("precision")(precision.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attributes]
  }
}

