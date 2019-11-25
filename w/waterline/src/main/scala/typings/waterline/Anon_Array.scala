package typings.waterline

import typings.waterline.waterlineStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  var `type`: array
}

object Anon_Array {
  @scala.inline
  def apply(`type`: array): Anon_Array = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Array]
  }
}

