package typings.xmlrpc

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpires extends js.Object {
  var expires: Date
  var secure: Boolean
}

object AnonExpires {
  @scala.inline
  def apply(expires: Date, secure: Boolean): AnonExpires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpires]
  }
}

