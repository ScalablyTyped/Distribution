package typings
package vueDashSplitpaneLib.vueDashSplitpaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitpaneData extends js.Object {
  var active: scala.Boolean
  var hasMoved: scala.Boolean
  var height: js.Any
   // null number string
  var percent: scala.Double
  var resizeType: java.lang.String
  var `type`: java.lang.String
}

object SplitpaneData {
  @scala.inline
  def apply(
    active: scala.Boolean,
    hasMoved: scala.Boolean,
    height: js.Any,
    percent: scala.Double,
    resizeType: java.lang.String,
    `type`: java.lang.String
  ): SplitpaneData = {
    val __obj = js.Dynamic.literal(active = active, hasMoved = hasMoved, height = height, percent = percent, resizeType = resizeType)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SplitpaneData]
  }
}

