package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// webdriver.json
@js.native
trait SessionReturn
  extends DesiredCapabilities
     with ProtocolCommandResponse

object SessionReturn {
  @scala.inline
  def apply(): SessionReturn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionReturn]
  }
}

