package typings.webpagetest.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Response extends js.Object {
  var response: typings.webpagetest.mod.Response[Location]
}

object Response {
  @scala.inline
  def apply(response: typings.webpagetest.mod.Response[Location]): Response = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[Response]
  }
}

