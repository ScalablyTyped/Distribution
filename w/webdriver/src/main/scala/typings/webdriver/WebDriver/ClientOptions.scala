package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var isChrome: Boolean
  var isW3C: Boolean
}

object ClientOptions {
  @scala.inline
  def apply(isChrome: Boolean, isW3C: Boolean): ClientOptions = {
    val __obj = js.Dynamic.literal(isChrome = isChrome.asInstanceOf[js.Any], isW3C = isW3C.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

