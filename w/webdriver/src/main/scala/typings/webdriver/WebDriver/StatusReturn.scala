package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatusReturn extends ProtocolCommandResponse {
  var message: js.UndefOr[String] = js.undefined
  var ready: js.UndefOr[Boolean] = js.undefined
}

object StatusReturn {
  @scala.inline
  def apply(
    StringDictionary: StringDictionary[js.Any] = null,
    message: String = null,
    ready: js.UndefOr[Boolean] = js.undefined
  ): StatusReturn = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (message != null) __obj.updateDynamic("message")(message)
    if (!js.isUndefined(ready)) __obj.updateDynamic("ready")(ready)
    __obj.asInstanceOf[StatusReturn]
  }
}

