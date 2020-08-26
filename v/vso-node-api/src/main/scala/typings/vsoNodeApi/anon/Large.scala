package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Large extends js.Object {
  var large: scala.Double = js.native
  var medium: scala.Double = js.native
  var small: scala.Double = js.native
}

object Large {
  @scala.inline
  def apply(large: scala.Double, medium: scala.Double, small: scala.Double): Large = {
    val __obj = js.Dynamic.literal(large = large.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[Large]
  }
  @scala.inline
  implicit class LargeOps[Self <: Large] (val x: Self) extends AnyVal {
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
    def setLarge(value: scala.Double): Self = this.set("large", value.asInstanceOf[js.Any])
    @scala.inline
    def setMedium(value: scala.Double): Self = this.set("medium", value.asInstanceOf[js.Any])
    @scala.inline
    def setSmall(value: scala.Double): Self = this.set("small", value.asInstanceOf[js.Any])
  }
  
}

