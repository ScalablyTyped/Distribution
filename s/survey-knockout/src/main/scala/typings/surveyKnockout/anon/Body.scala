package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Body extends js.Object {
  var body: String
  var header: ButtonCollapsed
  var root: String
}

object Body {
  @scala.inline
  def apply(body: String, header: ButtonCollapsed, root: String): Body = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], header = header.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Body]
  }
}

