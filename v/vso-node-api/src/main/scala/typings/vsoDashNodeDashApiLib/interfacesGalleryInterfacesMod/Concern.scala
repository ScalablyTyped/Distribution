package typings
package vsoDashNodeDashApiLib.interfacesGalleryInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Concern extends QnAItem {
  /**
    * Category of the concern
    */
  var category: ConcernCategory
}

object Concern {
  @scala.inline
  def apply(
    category: ConcernCategory,
    createdDate: stdLib.Date,
    id: scala.Double,
    status: QnAItemStatus,
    text: java.lang.String,
    updatedDate: stdLib.Date,
    user: UserIdentityRef
  ): Concern = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("createdDate")(createdDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("status")(status)
    __obj.updateDynamic("text")(text)
    __obj.updateDynamic("updatedDate")(updatedDate)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[Concern]
  }
}

