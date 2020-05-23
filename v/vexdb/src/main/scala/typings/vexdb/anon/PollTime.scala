package typings.vexdb.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollTime extends js.Object {
  var pollTime: Double
}

object PollTime {
  @scala.inline
  def apply(pollTime: Double): PollTime = {
    val __obj = js.Dynamic.literal(pollTime = pollTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[PollTime]
  }
}

