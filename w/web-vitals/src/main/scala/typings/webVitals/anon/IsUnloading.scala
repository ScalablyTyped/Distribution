package typings.webVitals.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsUnloading extends js.Object {
  var isUnloading: Boolean = js.native
  var timeStamp: Double = js.native
}

object IsUnloading {
  @scala.inline
  def apply(isUnloading: Boolean, timeStamp: Double): IsUnloading = {
    val __obj = js.Dynamic.literal(isUnloading = isUnloading.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsUnloading]
  }
  @scala.inline
  implicit class IsUnloadingOps[Self <: IsUnloading] (val x: Self) extends AnyVal {
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
    def setIsUnloading(value: Boolean): Self = this.set("isUnloading", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeStamp(value: Double): Self = this.set("timeStamp", value.asInstanceOf[js.Any])
  }
  
}

