package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Buy extends js.Object {
  var buy: scala.Double = js.native
  var get: scala.Double = js.native
  var install: scala.Double = js.native
  var none: scala.Double = js.native
  var purchaseRequest: scala.Double = js.native
  var request: scala.Double = js.native
  var `try`: scala.Double = js.native
}

object Buy {
  @scala.inline
  def apply(
    buy: scala.Double,
    get: scala.Double,
    install: scala.Double,
    none: scala.Double,
    purchaseRequest: scala.Double,
    request: scala.Double,
    `try`: scala.Double
  ): Buy = {
    val __obj = js.Dynamic.literal(buy = buy.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], purchaseRequest = purchaseRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("try")(`try`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Buy]
  }
  @scala.inline
  implicit class BuyOps[Self <: Buy] (val x: Self) extends AnyVal {
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
    def setBuy(value: scala.Double): Self = this.set("buy", value.asInstanceOf[js.Any])
    @scala.inline
    def setGet(value: scala.Double): Self = this.set("get", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstall(value: scala.Double): Self = this.set("install", value.asInstanceOf[js.Any])
    @scala.inline
    def setNone(value: scala.Double): Self = this.set("none", value.asInstanceOf[js.Any])
    @scala.inline
    def setPurchaseRequest(value: scala.Double): Self = this.set("purchaseRequest", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: scala.Double): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setTry(value: scala.Double): Self = this.set("try", value.asInstanceOf[js.Any])
  }
  
}

