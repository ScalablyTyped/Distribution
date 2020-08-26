package typings.yandexMetrikaTag.ym

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VisitParameters
  extends /* key */ StringDictionary[js.Any] {
  var currency: js.UndefOr[String] = js.native
  var order_price: js.UndefOr[Double] = js.native
}

object VisitParameters {
  @scala.inline
  def apply(): VisitParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisitParameters]
  }
  @scala.inline
  implicit class VisitParametersOps[Self <: VisitParameters] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrency: Self = this.set("currency", js.undefined)
    @scala.inline
    def setOrder_price(value: Double): Self = this.set("order_price", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder_price: Self = this.set("order_price", js.undefined)
  }
  
}

