package typings.testingbotApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TestingBotOptions extends js.Object {
  var api_key: js.UndefOr[String] = js.undefined
  var api_secret: js.UndefOr[String] = js.undefined
}

object TestingBotOptions {
  @scala.inline
  def apply(api_key: String = null, api_secret: String = null): TestingBotOptions = {
    val __obj = js.Dynamic.literal()
    if (api_key != null) __obj.updateDynamic("api_key")(api_key.asInstanceOf[js.Any])
    if (api_secret != null) __obj.updateDynamic("api_secret")(api_secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestingBotOptions]
  }
}

