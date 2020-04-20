package typings.webdriverio.WebdriverIO

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeReturn extends js.Object {
  var height: Double
  var width: Double
}

object SizeReturn {
  @scala.inline
  def apply(height: Double, width: Double): SizeReturn = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeReturn]
  }
}

