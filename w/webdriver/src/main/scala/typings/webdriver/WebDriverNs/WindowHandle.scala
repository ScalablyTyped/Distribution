package typings.webdriver.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WindowHandle extends js.Object {
  var handle: String
  var `type`: String
}

object WindowHandle {
  @scala.inline
  def apply(handle: String, `type`: String): WindowHandle = {
    val __obj = js.Dynamic.literal(handle = handle)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WindowHandle]
  }
}

