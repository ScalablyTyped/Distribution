package typings
package visLib.visMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimelineWindow extends js.Object {
  var end: stdLib.Date
  var start: stdLib.Date
}

object TimelineWindow {
  @scala.inline
  def apply(end: stdLib.Date, start: stdLib.Date): TimelineWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("start")(start)
    __obj.asInstanceOf[TimelineWindow]
  }
}

