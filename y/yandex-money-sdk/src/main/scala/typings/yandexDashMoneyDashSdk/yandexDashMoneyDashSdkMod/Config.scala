package typings.yandexDashMoneyDashSdk.yandexDashMoneyDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Config extends js.Object {
  var MONEY_URL: String
  var SP_MONEY_URL: String
}

object Config {
  @scala.inline
  def apply(MONEY_URL: String, SP_MONEY_URL: String): Config = {
    val __obj = js.Dynamic.literal(MONEY_URL = MONEY_URL, SP_MONEY_URL = SP_MONEY_URL)
  
    __obj.asInstanceOf[Config]
  }
}

