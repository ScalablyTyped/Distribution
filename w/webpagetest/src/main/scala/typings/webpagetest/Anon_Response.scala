package typings.webpagetest

import typings.webpagetest.webpagetestMod.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Response extends js.Object {
  var response: Response[Anon_Location]
}

object Anon_Response {
  @scala.inline
  def apply(response: Response[Anon_Location]): Anon_Response = {
    val __obj = js.Dynamic.literal(response = response)
  
    __obj.asInstanceOf[Anon_Response]
  }
}

