package typings.webdriver.WebDriver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirefoxLogObject extends js.Object {
  var level: FirefoxLogLevels
}

object FirefoxLogObject {
  @scala.inline
  def apply(level: FirefoxLogLevels): FirefoxLogObject = {
    val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirefoxLogObject]
  }
}

