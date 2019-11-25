package typings.waterline

import typings.waterline.waterlineStrings.date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Date extends js.Object {
  var `type`: date
}

object Anon_Date {
  @scala.inline
  def apply(`type`: date): Anon_Date = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Date]
  }
}

