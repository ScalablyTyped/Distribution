package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QnAItem extends js.Object {
  /**
    * Time when the review was first created
    */
  var createdDate: stdLib.Date
  /**
    * Unique identifier of a QnA item
    */
  var id: scala.Double
  /**
    * Get status of item
    */
  var status: QnAItemStatus
  /**
    * Text description of the QnA item
    */
  var text: java.lang.String
  /**
    * Time when the review was edited/updated
    */
  var updatedDate: stdLib.Date
  /**
    * User details for the item.
    */
  var user: UserIdentityRef
}

object QnAItem {
  @scala.inline
  def apply(
    createdDate: stdLib.Date,
    id: scala.Double,
    status: QnAItemStatus,
    text: java.lang.String,
    updatedDate: stdLib.Date,
    user: UserIdentityRef
  ): QnAItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("updatedDate")(updatedDate)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[QnAItem]
  }
}

