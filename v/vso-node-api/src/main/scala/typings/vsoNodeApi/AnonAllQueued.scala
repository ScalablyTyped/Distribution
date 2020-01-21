package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllQueued extends js.Object {
  var all: Double
  var queued: Double
  var running: Double
}

object AnonAllQueued {
  @scala.inline
  def apply(all: Double, queued: Double, running: Double): AnonAllQueued = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAllQueued]
  }
}

