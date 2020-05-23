package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareMessageToFriendScene extends js.Object {
  /**
    * 需要传递的代表场景的数字，需要在 0 - 50 之间
    */
  var shareMessageToFriendScene: Double
}

object ShareMessageToFriendScene {
  @scala.inline
  def apply(shareMessageToFriendScene: Double): ShareMessageToFriendScene = {
    val __obj = js.Dynamic.literal(shareMessageToFriendScene = shareMessageToFriendScene.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareMessageToFriendScene]
  }
}

