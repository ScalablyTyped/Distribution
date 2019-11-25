package typings.waterline

import typings.waterline.waterlineStrings.time
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Time extends js.Object {
  var `type`: time
}

object Anon_Time {
  @scala.inline
  def apply(`type`: time): Anon_Time = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Time]
  }
}

