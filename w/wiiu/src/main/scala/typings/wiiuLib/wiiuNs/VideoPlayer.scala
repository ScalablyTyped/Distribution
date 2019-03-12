package typings
package wiiuLib.wiiuNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoPlayer extends js.Object {
  var viewMode: scala.Double
  def end(): scala.Boolean
}

object VideoPlayer {
  @scala.inline
  def apply(end: () => scala.Boolean, viewMode: scala.Double): VideoPlayer = {
    val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), viewMode = viewMode)
  
    __obj.asInstanceOf[VideoPlayer]
  }
}

