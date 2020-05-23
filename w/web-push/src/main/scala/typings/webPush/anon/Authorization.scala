package typings.webPush.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Authorization extends js.Object {
  var Authorization: String
}

object Authorization {
  @scala.inline
  def apply(Authorization: String): Authorization = {
    val __obj = js.Dynamic.literal(Authorization = Authorization.asInstanceOf[js.Any])
    __obj.asInstanceOf[Authorization]
  }
}

