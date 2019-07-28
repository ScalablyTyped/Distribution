package typings.wiiu.wiiuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPlayer extends js.Object {
  var viewMode: Double
  def end(): Boolean
}

object VideoPlayer {
  @scala.inline
  def apply(end: () => Boolean, viewMode: Double): VideoPlayer = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), viewMode = viewMode)
  
    __obj.asInstanceOf[VideoPlayer]
  }
}

