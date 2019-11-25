package typings.vsoDashNodeDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buy extends js.Object {
  var buy: Double
  var get: Double
  var install: Double
  var none: Double
  var purchaseRequest: Double
  var request: Double
  var `try`: Double
}

object Anon_Buy {
  @scala.inline
  def apply(
    buy: Double,
    get: Double,
    install: Double,
    none: Double,
    purchaseRequest: Double,
    request: Double,
    `try`: Double
  ): Anon_Buy = {
    val __obj = js.Dynamic.literal(buy = buy.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], install = install.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], purchaseRequest = purchaseRequest.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.updateDynamic("try")(`try`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Buy]
  }
}

