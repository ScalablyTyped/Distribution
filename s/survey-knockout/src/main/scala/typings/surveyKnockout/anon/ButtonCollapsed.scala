package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ButtonCollapsed extends js.Object {
  var button: String
  var buttonCollapsed: String
  var buttonExpanded: String
  var root: String
  var title: String
}

object ButtonCollapsed {
  @scala.inline
  def apply(button: String, buttonCollapsed: String, buttonExpanded: String, root: String, title: String): ButtonCollapsed = {
    val __obj = js.Dynamic.literal(button = button.asInstanceOf[js.Any], buttonCollapsed = buttonCollapsed.asInstanceOf[js.Any], buttonExpanded = buttonExpanded.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonCollapsed]
  }
}

