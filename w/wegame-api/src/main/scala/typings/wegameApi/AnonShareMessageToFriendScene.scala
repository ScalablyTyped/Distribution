package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonShareMessageToFriendScene extends js.Object {
  /**
    * 需要传递的代表场景的数字，需要在 0 - 50 之间
    */
  var shareMessageToFriendScene: Double
}

object AnonShareMessageToFriendScene {
  @scala.inline
  def apply(shareMessageToFriendScene: Double): AnonShareMessageToFriendScene = {
    val __obj = js.Dynamic.literal(shareMessageToFriendScene = shareMessageToFriendScene.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonShareMessageToFriendScene]
  }
}

