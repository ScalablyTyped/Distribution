package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReturnurlString extends js.Object {
  var return_url: String
}

object ReturnurlString {
  @scala.inline
  def apply(return_url: String): ReturnurlString = {
    val __obj = js.Dynamic.literal(return_url = return_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnurlString]
  }
}

