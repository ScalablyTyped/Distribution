package typings.teslajs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var response: Boolean
}

object Response {
  @scala.inline
  def apply(response: Boolean): Response = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

