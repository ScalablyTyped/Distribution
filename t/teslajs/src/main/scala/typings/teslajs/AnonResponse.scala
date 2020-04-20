package typings.teslajs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResponse extends js.Object {
  var response: Boolean
}

object AnonResponse {
  @scala.inline
  def apply(response: Boolean): AnonResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonResponse]
  }
}

