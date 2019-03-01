package typings
package surveyDashKnockoutLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ItemTitleItemValue extends js.Object {
  var itemTitle: java.lang.String
  var itemValue: java.lang.String
  var root: java.lang.String
}

object Anon_ItemTitleItemValue {
  @scala.inline
  def apply(itemTitle: java.lang.String, itemValue: java.lang.String, root: java.lang.String): Anon_ItemTitleItemValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("itemTitle")(itemTitle)
    __obj.updateDynamic("itemValue")(itemValue)
    __obj.updateDynamic("root")(root)
    __obj.asInstanceOf[Anon_ItemTitleItemValue]
  }
}

