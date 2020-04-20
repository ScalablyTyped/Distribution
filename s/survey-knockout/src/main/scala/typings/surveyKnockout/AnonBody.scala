package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBody extends js.Object {
  var body: String
  var header: AnonButtonCollapsed
  var root: String
}

object AnonBody {
  @scala.inline
  def apply(body: String, header: AnonButtonCollapsed, root: String): AnonBody = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBody]
  }
}

