package typings
package wxDashJsDashSdkDashDtLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenProductSpecificViewConfig extends WxBaseRequestConfig {
  /**
    * 商品id
    */
  var productId: java.lang.String
  /**
    * 0.默认值，普通商品详情页; 1.扫一扫商品详情页; 2.小店商品详情页
    */
  var viewType: js.UndefOr[scala.Double] = js.undefined
}

object OpenProductSpecificViewConfig {
  @scala.inline
  def apply(
    productId: java.lang.String,
    cancel: js.Function0[scala.Unit] = null,
    complete: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    fail: js.Function1[/* error */ js.UndefOr[js.Any], scala.Unit] = null,
    success: js.Function1[/* res */ js.UndefOr[js.Any], scala.Unit] = null,
    viewType: scala.Int | scala.Double = null
  ): OpenProductSpecificViewConfig = {
    val __obj = js.Dynamic.literal(productId = productId)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (success != null) __obj.updateDynamic("success")(success)
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenProductSpecificViewConfig]
  }
}

