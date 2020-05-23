package typings.xmlrpc.anon

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expires extends js.Object {
  var expires: Date
  var secure: Boolean
}

object Expires {
  @scala.inline
  def apply(expires: Date, secure: Boolean): Expires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expires]
  }
}

