package typings
package webixLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SizeInfo extends js.Object {
  var height: scala.Double
  var width: scala.Double
}

object SizeInfo {
  @scala.inline
  def apply(height: scala.Double, width: scala.Double): SizeInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[SizeInfo]
  }
}

