package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsOverlapping extends js.Object {
  var isOverlapping: scala.Double = js.native
  var oK: scala.Double = js.native
}

object IsOverlapping {
  @scala.inline
  def apply(isOverlapping: scala.Double, oK: scala.Double): IsOverlapping = {
    val __obj = js.Dynamic.literal(isOverlapping = isOverlapping.asInstanceOf[js.Any], oK = oK.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsOverlapping]
  }
  @scala.inline
  implicit class IsOverlappingOps[Self <: IsOverlapping] (val x: Self) extends AnyVal {
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
    def setIsOverlapping(value: scala.Double): Self = this.set("isOverlapping", value.asInstanceOf[js.Any])
    @scala.inline
    def setOK(value: scala.Double): Self = this.set("oK", value.asInstanceOf[js.Any])
  }
  
}

