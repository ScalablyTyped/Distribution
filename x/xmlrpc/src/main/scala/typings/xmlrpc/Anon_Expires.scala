package typings.xmlrpc

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expires extends js.Object {
  var expires: Date
  var secure: Boolean
}

object Anon_Expires {
  @scala.inline
  def apply(expires: Date, secure: Boolean): Anon_Expires = {
    val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Expires]
  }
}

