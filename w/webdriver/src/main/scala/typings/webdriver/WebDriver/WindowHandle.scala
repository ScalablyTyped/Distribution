package typings.webdriver.WebDriver

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
    val __obj = js.Dynamic.literal(handle = handle.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowHandle]
  }
}

