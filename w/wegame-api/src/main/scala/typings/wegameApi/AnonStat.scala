package typings.wegameApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStat extends js.Object {
  var stat: Stats
}

object AnonStat {
  @scala.inline
  def apply(stat: Stats): AnonStat = {
    val __obj = js.Dynamic.literal(stat = stat.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStat]
  }
}

