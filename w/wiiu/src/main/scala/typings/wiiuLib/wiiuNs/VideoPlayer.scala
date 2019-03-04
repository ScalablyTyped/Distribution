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
  def apply(end: js.Function0[scala.Boolean], viewMode: scala.Double): VideoPlayer = {
    val __obj = js.Dynamic.literal(end = end, viewMode = viewMode)
  
    __obj.asInstanceOf[VideoPlayer]
  }
}

