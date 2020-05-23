package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ItemValueRoot extends js.Object {
  var itemValue: String
  var root: String
}

object ItemValueRoot {
  @scala.inline
  def apply(itemValue: String, root: String): ItemValueRoot = {
    val __obj = js.Dynamic.literal(itemValue = itemValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemValueRoot]
  }
}

