package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Request extends js.Object {
  var request: stdLib.XMLHttpRequest
}

object Anon_Request {
  @scala.inline
  def apply(request: stdLib.XMLHttpRequest): Anon_Request = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("request")(request)
    __obj.asInstanceOf[Anon_Request]
  }
}

