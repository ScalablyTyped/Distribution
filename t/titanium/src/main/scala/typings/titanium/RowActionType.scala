package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents the custom edit action for a ListItem.
  */
@js.native
trait RowActionType extends js.Object {
  /**
    * The background color of the row action.
    */
  var color: js.UndefOr[java.lang.String] = js.native
  /**
    * The [identifier](RowActionType. identifier) of the row action. Only included in the event
    * if previously defined. Available in Titanium 6.0.0 and later.
    */
  var identifier: js.UndefOr[java.lang.String] = js.native
  /**
    * The style of the row action.
    */
  var style: Double = js.native
  /**
    * The title of the row action.
    */
  var title: java.lang.String = js.native
}

object RowActionType {
  @scala.inline
  def apply(style: Double, title: java.lang.String): RowActionType = {
    val __obj = js.Dynamic.literal(style = style.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowActionType]
  }
  @scala.inline
  implicit class RowActionTypeOps[Self <: RowActionType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setStyle(value: Double): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: java.lang.String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    @scala.inline
    def setIdentifier(value: java.lang.String): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
  }
  
}

