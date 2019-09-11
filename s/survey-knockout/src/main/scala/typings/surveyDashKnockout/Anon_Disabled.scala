package typings.surveyDashKnockout

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabled extends js.Object {
  var disabled: String
  var item: String
  var itemText: String
  var maxText: String
  var minText: String
  var root: String
  var selected: String
}

object Anon_Disabled {
  @scala.inline
  def apply(
    disabled: String,
    item: String,
    itemText: String,
    maxText: String,
    minText: String,
    root: String,
    selected: String
  ): Anon_Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled, item = item, itemText = itemText, maxText = maxText, minText = minText, root = root, selected = selected)
  
    __obj.asInstanceOf[Anon_Disabled]
  }
}

