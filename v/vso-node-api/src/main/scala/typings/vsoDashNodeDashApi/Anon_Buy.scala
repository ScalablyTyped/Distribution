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
    val __obj = js.Dynamic.literal(buy = buy, get = get, install = install, none = none, purchaseRequest = purchaseRequest, request = request)
    __obj.updateDynamic("try")(`try`)
    __obj.asInstanceOf[Anon_Buy]
  }
}

