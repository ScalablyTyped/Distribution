package typings.uiSelect.mod.ui.select

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRepeatExpression extends js.Object {
  var filters: String = js.native
  var itemName: String = js.native
  var keyName: String = js.native
  var modelMapper: String = js.native
  var source: String = js.native
  var trackByExp: String = js.native
  def repeatExpression(grouped: Boolean): String = js.native
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
  @scala.inline
  implicit class IRepeatExpressionOps[Self <: IRepeatExpression] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFilters(value: String): Self = this.set("filters", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemName(value: String): Self = this.set("itemName", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyName(value: String): Self = this.set("keyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setModelMapper(value: String): Self = this.set("modelMapper", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepeatExpression(value: Boolean => String): Self = this.set("repeatExpression", js.Any.fromFunction1(value))
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTrackByExp(value: String): Self = this.set("trackByExp", value.asInstanceOf[js.Any])
  }
  
}

