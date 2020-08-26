package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Custom extends js.Object {
  var custom: scala.Double = js.native
  var latestOnBuild: scala.Double = js.native
  var latestOnQueue: scala.Double = js.native
}

object Custom {
  @scala.inline
  def apply(custom: scala.Double, latestOnBuild: scala.Double, latestOnQueue: scala.Double): Custom = {
    val __obj = js.Dynamic.literal(custom = custom.asInstanceOf[js.Any], latestOnBuild = latestOnBuild.asInstanceOf[js.Any], latestOnQueue = latestOnQueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Custom]
  }
  @scala.inline
  implicit class CustomOps[Self <: Custom] (val x: Self) extends AnyVal {
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
    def setCustom(value: scala.Double): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestOnBuild(value: scala.Double): Self = this.set("latestOnBuild", value.asInstanceOf[js.Any])
    @scala.inline
    def setLatestOnQueue(value: scala.Double): Self = this.set("latestOnQueue", value.asInstanceOf[js.Any])
  }
  
}

