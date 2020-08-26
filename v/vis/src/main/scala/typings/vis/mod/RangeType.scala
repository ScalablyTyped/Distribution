package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RangeType extends js.Object {
  var max: IdType = js.native
  var min: IdType = js.native
}

object RangeType {
  @scala.inline
  def apply(max: IdType, min: IdType): RangeType = {
    val __obj = js.Dynamic.literal(max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeType]
  }
  @scala.inline
  implicit class RangeTypeOps[Self <: RangeType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMax(value: IdType): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: IdType): Self = this.set("min", value.asInstanceOf[js.Any])
  }
  
}

