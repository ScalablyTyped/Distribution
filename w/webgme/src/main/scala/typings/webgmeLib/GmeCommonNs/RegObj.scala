package typings
package webgmeLib.GmeCommonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegObj extends js.Object {
  var x: scala.Double
  var y: scala.Double
}

object RegObj {
  @scala.inline
  def apply(x: scala.Double, y: scala.Double): RegObj = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("x")(x)
    __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[RegObj]
  }
}

