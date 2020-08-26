package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QnAItem extends js.Object {
  /**
    * Time when the review was first created
    */
  var createdDate: Date = js.native
  /**
    * Unique identifier of a QnA item
    */
  var id: Double = js.native
  /**
    * Get status of item
    */
  var status: QnAItemStatus = js.native
  /**
    * Text description of the QnA item
    */
  var text: String = js.native
  /**
    * Time when the review was edited/updated
    */
  var updatedDate: Date = js.native
  /**
    * User details for the item.
    */
  var user: UserIdentityRef = js.native
}

object QnAItem {
  @scala.inline
  def apply(
    createdDate: Date,
    id: Double,
    status: QnAItemStatus,
    text: String,
    updatedDate: Date,
    user: UserIdentityRef
  ): QnAItem = {
    val __obj = js.Dynamic.literal(createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[QnAItem]
  }
  @scala.inline
  implicit class QnAItemOps[Self <: QnAItem] (val x: Self) extends AnyVal {
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
    def setCreatedDate(value: Date): Self = this.set("createdDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(value: QnAItemStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedDate(value: Date): Self = this.set("updatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setUser(value: UserIdentityRef): Self = this.set("user", value.asInstanceOf[js.Any])
  }
  
}

