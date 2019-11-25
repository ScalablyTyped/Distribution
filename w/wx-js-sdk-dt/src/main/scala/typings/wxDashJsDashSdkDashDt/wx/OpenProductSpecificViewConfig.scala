package typings.wxDashJsDashSdkDashDt.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenProductSpecificViewConfig extends WxBaseRequestConfig {
  /**
    * 商品id
    */
  var productId: String
  /**
    * 0.默认值，普通商品详情页; 1.扫一扫商品详情页; 2.小店商品详情页
    */
  var viewType: js.UndefOr[Double] = js.undefined
}

object OpenProductSpecificViewConfig {
  @scala.inline
  def apply(
    productId: String,
    cancel: () => Unit = null,
    complete: /* res */ js.UndefOr[js.Any] => Unit = null,
    fail: /* error */ js.UndefOr[js.Any] => Unit = null,
    success: /* res */ js.UndefOr[js.Any] => Unit = null,
    viewType: Int | Double = null
  ): OpenProductSpecificViewConfig = {
    val __obj = js.Dynamic.literal(productId = productId.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (viewType != null) __obj.updateDynamic("viewType")(viewType.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenProductSpecificViewConfig]
  }
}

