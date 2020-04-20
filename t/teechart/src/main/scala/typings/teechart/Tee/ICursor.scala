package typings.teechart.Tee

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICursor extends js.Object {
  var cursor: String
}

object ICursor {
  @scala.inline
  def apply(cursor: String): ICursor = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICursor]
  }
}

