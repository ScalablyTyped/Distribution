package typings.winrtUwp.Windows.Perception.People

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeadPose extends js.Object {
  var forwardDirection: js.Any
   /* unmapped type */ var position: js.Any
   /* unmapped type */ var upDirection: js.Any
}

object HeadPose {
  @scala.inline
  def apply(forwardDirection: js.Any, position: js.Any, upDirection: js.Any): HeadPose = {
    val __obj = js.Dynamic.literal(forwardDirection = forwardDirection.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], upDirection = upDirection.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadPose]
  }
}

