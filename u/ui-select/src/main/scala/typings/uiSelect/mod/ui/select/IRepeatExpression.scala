package typings.uiSelect.mod.ui.select

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRepeatExpression extends js.Object {
  var filters: String
  var itemName: String
  var keyName: String
  var modelMapper: String
  var source: String
  var trackByExp: String
  def repeatExpression(grouped: Boolean): String
}

object IRepeatExpression {
  @scala.inline
  def apply(
    filters: String,
    itemName: String,
    keyName: String,
    modelMapper: String,
    repeatExpression: Boolean => String,
    source: String,
    trackByExp: String
  ): IRepeatExpression = {
    val __obj = js.Dynamic.literal(filters = filters.asInstanceOf[js.Any], itemName = itemName.asInstanceOf[js.Any], keyName = keyName.asInstanceOf[js.Any], modelMapper = modelMapper.asInstanceOf[js.Any], repeatExpression = js.Any.fromFunction1(repeatExpression), source = source.asInstanceOf[js.Any], trackByExp = trackByExp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRepeatExpression]
  }
}

