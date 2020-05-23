package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Queued extends js.Object {
  var all: scala.Double
  var queued: scala.Double
  var running: scala.Double
}

object Queued {
  @scala.inline
  def apply(all: scala.Double, queued: scala.Double, running: scala.Double): Queued = {
    val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any], queued = queued.asInstanceOf[js.Any], running = running.asInstanceOf[js.Any])
    __obj.asInstanceOf[Queued]
  }
}

