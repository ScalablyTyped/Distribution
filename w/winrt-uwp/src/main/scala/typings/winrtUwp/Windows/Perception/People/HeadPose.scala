package typings.winrtUwp.Windows.Perception.People

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HeadPose extends js.Object {
  var forwardDirection: js.Any = js.native
   /* unmapped type */ var position: js.Any = js.native
   /* unmapped type */ var upDirection: js.Any = js.native
}

object HeadPose {
  @scala.inline
  def apply(forwardDirection: js.Any, position: js.Any, upDirection: js.Any): HeadPose = {
    val __obj = js.Dynamic.literal(forwardDirection = forwardDirection.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], upDirection = upDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadPose]
  }
  @scala.inline
  implicit class HeadPoseOps[Self <: HeadPose] (val x: Self) extends AnyVal {
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
    def setForwardDirection(value: js.Any): Self = this.set("forwardDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpDirection(value: js.Any): Self = this.set("upDirection", value.asInstanceOf[js.Any])
  }
  
}

