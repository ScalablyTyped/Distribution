package typings.wegameDashApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ShareMessageToFriendScene extends js.Object {
  /**
    * 需要传递的代表场景的数字，需要在 0 - 50 之间
    */
  var shareMessageToFriendScene: Double
}

object Anon_ShareMessageToFriendScene {
  @scala.inline
  def apply(shareMessageToFriendScene: Double): Anon_ShareMessageToFriendScene = {
    val __obj = js.Dynamic.literal(shareMessageToFriendScene = shareMessageToFriendScene)
  
    __obj.asInstanceOf[Anon_ShareMessageToFriendScene]
  }
}

