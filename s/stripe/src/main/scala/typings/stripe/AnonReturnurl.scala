package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonReturnurl extends js.Object {
  var return_url: String
  var url: String
}

object AnonReturnurl {
  @scala.inline
  def apply(return_url: String, url: String): AnonReturnurl = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonReturnurl]
  }
}

