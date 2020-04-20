package typings.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationReturn extends js.Object {
  var x: Double
  var y: Double
}

object LocationReturn {
  @scala.inline
  def apply(x: Double, y: Double): LocationReturn = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationReturn]
  }
}

