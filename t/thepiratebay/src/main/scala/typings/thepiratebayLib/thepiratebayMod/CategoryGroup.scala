package typings
package thepiratebayLib.thepiratebayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryGroup extends Category {
  var subcategories: js.Array[Category]
}

object CategoryGroup {
  @scala.inline
  def apply(id: java.lang.String, name: java.lang.String, subcategories: js.Array[Category]): CategoryGroup = {
    val __obj = js.Dynamic.literal(id = id, name = name, subcategories = subcategories)
  
    __obj.asInstanceOf[CategoryGroup]
  }
}

