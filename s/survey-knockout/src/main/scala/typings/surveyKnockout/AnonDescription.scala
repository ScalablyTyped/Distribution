package typings.surveyKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  var description: String
  var root: String
  var title: String
}

object AnonDescription {
  @scala.inline
  def apply(description: String, root: String, title: String): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

