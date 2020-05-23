package typings.websql

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// synchronous database API error
trait SQLException extends js.Object {
   // = 7;
  var code: Double
  var message: DOMString
}

object SQLException {
  @scala.inline
  def apply(code: Double, message: DOMString): SQLException = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[SQLException]
  }
}

