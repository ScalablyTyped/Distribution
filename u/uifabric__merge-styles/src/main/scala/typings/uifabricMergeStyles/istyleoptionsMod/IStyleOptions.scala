package typings.uifabricMergeStyles.istyleoptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStyleOptions extends js.Object {
  var rtl: js.UndefOr[Boolean] = js.undefined
  var specificityMultiplier: js.UndefOr[Double] = js.undefined
}

object IStyleOptions {
  @scala.inline
  def apply(rtl: js.UndefOr[Boolean] = js.undefined, specificityMultiplier: js.UndefOr[Double] = js.undefined): IStyleOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(rtl)) __obj.updateDynamic("rtl")(rtl.get.asInstanceOf[js.Any])
    if (!js.isUndefined(specificityMultiplier)) __obj.updateDynamic("specificityMultiplier")(specificityMultiplier.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStyleOptions]
  }
}

