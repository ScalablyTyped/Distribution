package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Icon extends js.Object {
  var icon: String
  var item: String
  var locationBottom: String
  var locationTop: String
  var root: String
}

object Icon {
  @scala.inline
  def apply(icon: String, item: String, locationBottom: String, locationTop: String, root: String): Icon = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], locationBottom = locationBottom.asInstanceOf[js.Any], locationTop = locationTop.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[Icon]
  }
}

