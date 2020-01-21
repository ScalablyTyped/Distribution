package typings.webpagetest

import typings.webpagetest.mod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonResponse extends js.Object {
  var response: Response[AnonLocation]
}

object AnonResponse {
  @scala.inline
  def apply(response: Response[AnonLocation]): AnonResponse = {
    val __obj = js.Dynamic.literal(response = response.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonResponse]
  }
}

