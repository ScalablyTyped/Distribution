package typings
package wepyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DurationScrollTop extends js.Object {
  var duration: scala.Double
  var scrollTop: scala.Double
}

object Anon_DurationScrollTop {
  @scala.inline
  def apply(duration: scala.Double, scrollTop: scala.Double): Anon_DurationScrollTop = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("duration")(duration)
    __obj.updateDynamic("scrollTop")(scrollTop)
    __obj.asInstanceOf[Anon_DurationScrollTop]
  }
}

