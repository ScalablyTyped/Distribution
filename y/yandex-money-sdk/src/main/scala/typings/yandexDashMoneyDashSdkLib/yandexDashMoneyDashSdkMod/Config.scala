package typings
package yandexDashMoneyDashSdkLib.yandexDashMoneyDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var MONEY_URL: java.lang.String
  var SP_MONEY_URL: java.lang.String
}

object Config {
  @scala.inline
  def apply(MONEY_URL: java.lang.String, SP_MONEY_URL: java.lang.String): Config = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MONEY_URL")(MONEY_URL)
    __obj.updateDynamic("SP_MONEY_URL")(SP_MONEY_URL)
    __obj.asInstanceOf[Config]
  }
}

