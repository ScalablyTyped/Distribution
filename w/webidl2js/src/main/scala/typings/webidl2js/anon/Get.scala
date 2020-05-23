package typings.webidl2js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Get extends js.Object {
  var get: String
  var set: String
}

object Get {
  @scala.inline
  def apply(get: String, set: String): Get = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[Get]
  }
}

