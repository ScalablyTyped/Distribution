package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Doing extends js.Object {
  var doing: scala.Double = js.native
  var done: scala.Double = js.native
  var followed: scala.Double = js.native
}

object Doing {
  @scala.inline
  def apply(doing: scala.Double, done: scala.Double, followed: scala.Double): Doing = {
    val __obj = js.Dynamic.literal(doing = doing.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], followed = followed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Doing]
  }
  @scala.inline
  implicit class DoingOps[Self <: Doing] (val x: Self) extends AnyVal {
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
    def setDoing(value: scala.Double): Self = this.set("doing", value.asInstanceOf[js.Any])
    @scala.inline
    def setDone(value: scala.Double): Self = this.set("done", value.asInstanceOf[js.Any])
    @scala.inline
    def setFollowed(value: scala.Double): Self = this.set("followed", value.asInstanceOf[js.Any])
  }
  
}

