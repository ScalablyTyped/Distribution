package typings.thepiratebay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryGroup extends Category {
  var subcategories: js.Array[Category]
}

object CategoryGroup {
  @scala.inline
  def apply(id: String, name: String, subcategories: js.Array[Category]): CategoryGroup = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subcategories = subcategories.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CategoryGroup]
  }
}

