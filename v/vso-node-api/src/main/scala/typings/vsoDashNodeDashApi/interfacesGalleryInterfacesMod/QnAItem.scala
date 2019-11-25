package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QnAItem extends js.Object {
  /**
    * Time when the review was first created
    */
  var createdDate: Date
  /**
    * Unique identifier of a QnA item
    */
  var id: Double
  /**
    * Get status of item
    */
  var status: QnAItemStatus
  /**
    * Text description of the QnA item
    */
  var text: String
  /**
    * Time when the review was edited/updated
    */
  var updatedDate: Date
  /**
    * User details for the item.
    */
  var user: UserIdentityRef
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
}

