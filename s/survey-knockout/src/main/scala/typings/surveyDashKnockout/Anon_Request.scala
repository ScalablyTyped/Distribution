package typings.surveyDashKnockout

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: XMLHttpRequest
}

object Anon_Request {
  @scala.inline
  def apply(request: XMLHttpRequest): Anon_Request = {
    val __obj = js.Dynamic.literal(request = request)
  
    __obj.asInstanceOf[Anon_Request]
  }
}

