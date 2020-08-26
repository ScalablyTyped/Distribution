package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailingSince extends js.Object {
  var failingSince: scala.Double = js.native
  var regular: scala.Double = js.native
}

object FailingSince {
  @scala.inline
  def apply(failingSince: scala.Double, regular: scala.Double): FailingSince = {
    val __obj = js.Dynamic.literal(failingSince = failingSince.asInstanceOf[js.Any], regular = regular.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailingSince]
  }
  @scala.inline
  implicit class FailingSinceOps[Self <: FailingSince] (val x: Self) extends AnyVal {
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
    def setFailingSince(value: scala.Double): Self = this.set("failingSince", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegular(value: scala.Double): Self = this.set("regular", value.asInstanceOf[js.Any])
  }
  
}

