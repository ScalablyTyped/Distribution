package typings.weixinApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCursor extends js.Object {
  var cursor: Double
  var value: String
}

object AnonCursor {
  @scala.inline
  def apply(cursor: Double, value: String): AnonCursor = {
    val __obj = js.Dynamic.literal(cursor = cursor.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCursor]
  }
}

