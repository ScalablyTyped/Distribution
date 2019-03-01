package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Buy extends js.Object {
  var buy: scala.Double
  var get: scala.Double
  var install: scala.Double
  var none: scala.Double
  var purchaseRequest: scala.Double
  var request: scala.Double
  var `try`: scala.Double
}

object Anon_Buy {
  @scala.inline
  def apply(
    buy: scala.Double,
    get: scala.Double,
    install: scala.Double,
    none: scala.Double,
    purchaseRequest: scala.Double,
    request: scala.Double,
    `try`: scala.Double
  ): Anon_Buy = {
    val __obj = js.Dynamic.literal(`try` = `try`)
    __obj.updateDynamic("buy")(buy)
    __obj.updateDynamic("get")(get)
    __obj.updateDynamic("install")(install)
    __obj.updateDynamic("none")(none)
    __obj.updateDynamic("purchaseRequest")(purchaseRequest)
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[Anon_Buy]
  }
}

