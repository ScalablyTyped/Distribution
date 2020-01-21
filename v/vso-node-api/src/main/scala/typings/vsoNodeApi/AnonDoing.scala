package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDoing extends js.Object {
  var doing: Double
  var done: Double
  var followed: Double
}

object AnonDoing {
  @scala.inline
  def apply(doing: Double, done: Double, followed: Double): AnonDoing = {
    val __obj = js.Dynamic.literal(doing = doing.asInstanceOf[js.Any], done = done.asInstanceOf[js.Any], followed = followed.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDoing]
  }
}

