package typings
package webdriverioLib.WebdriverIONs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocationReturn extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object LocationReturn {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): LocationReturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[LocationReturn]
  }
}

