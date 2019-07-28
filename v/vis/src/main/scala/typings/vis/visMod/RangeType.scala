package typings.vis.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RangeType extends js.Object {
  var max: IdType
  var min: IdType
}

object RangeType {
  @scala.inline
  def apply(max: IdType, min: IdType): RangeType = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RangeType]
  }
}

