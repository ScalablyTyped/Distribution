package typings.webidl2js

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGet extends js.Object {
  var get: String
  var set: String
}

object AnonGet {
  @scala.inline
  def apply(get: String, set: String): AnonGet = {
    val __obj = js.Dynamic.literal(get = get.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonGet]
  }
}

