package typings
package webdriverLib.WebDriverNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FirefoxLogObject extends js.Object {
  var level: FirefoxLogLevels
}

object FirefoxLogObject {
  @scala.inline
  def apply(level: FirefoxLogLevels): FirefoxLogObject = {
    val __obj = js.Dynamic.literal(level = level)
  
    __obj.asInstanceOf[FirefoxLogObject]
  }
}

