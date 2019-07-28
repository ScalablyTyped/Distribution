package typings.uiDashBox

import typings.uiDashBox.distTypesEnhancersMod.BoxPropValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Clearfix extends js.Object {
  /**
    * Utility property for easily adding clearfix styles to the element.
    */
  var clearfix: js.UndefOr[Boolean] = js.undefined
  /**
    * Sets `marginLeft` and `marginRight` to the same value
    */
  var marginX: js.UndefOr[BoxPropValue] = js.undefined
  /**
    * Sets `marginTop` and `marginBottom` to the same value
    */
  var marginY: js.UndefOr[BoxPropValue] = js.undefined
  /**
    * Sets `paddingLeft` and `paddingRight` to the same value
    */
  var paddingX: js.UndefOr[BoxPropValue] = js.undefined
  /**
    * Sets `paddingTop` and `paddingBottom` to the same value
    */
  var paddingY: js.UndefOr[BoxPropValue] = js.undefined
}

object Anon_Clearfix {
  @scala.inline
  def apply(
    clearfix: js.UndefOr[Boolean] = js.undefined,
    marginX: BoxPropValue = null,
    marginY: BoxPropValue = null,
    paddingX: BoxPropValue = null,
    paddingY: BoxPropValue = null
  ): Anon_Clearfix = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clearfix)) __obj.updateDynamic("clearfix")(clearfix)
    if (marginX != null) __obj.updateDynamic("marginX")(marginX.asInstanceOf[js.Any])
    if (marginY != null) __obj.updateDynamic("marginY")(marginY.asInstanceOf[js.Any])
    if (paddingX != null) __obj.updateDynamic("paddingX")(paddingX.asInstanceOf[js.Any])
    if (paddingY != null) __obj.updateDynamic("paddingY")(paddingY.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Clearfix]
  }
}

