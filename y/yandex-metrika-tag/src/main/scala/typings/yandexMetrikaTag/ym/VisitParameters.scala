package typings.yandexMetrikaTag.ym

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisitParameters
  extends /* key */ StringDictionary[js.Any] {
  var currency: js.UndefOr[String] = js.undefined
  var order_price: js.UndefOr[Double] = js.undefined
}

object VisitParameters {
  @scala.inline
  def apply(
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    currency: String = null,
    order_price: js.UndefOr[Double] = js.undefined
  ): VisitParameters = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (currency != null) __obj.updateDynamic("currency")(currency.asInstanceOf[js.Any])
    if (!js.isUndefined(order_price)) __obj.updateDynamic("order_price")(order_price.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisitParameters]
  }
}

