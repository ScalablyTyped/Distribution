package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import typings.std.Date
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
    createdDate: Date,
    id: Double,
    status: QnAItemStatus,
    text: String,
    updatedDate: Date,
    user: UserIdentityRef
  ): Concern = {
    val __obj = js.Dynamic.literal(category = category, createdDate = createdDate, id = id, status = status, text = text, updatedDate = updatedDate, user = user)
  
    __obj.asInstanceOf[Concern]
  }
}

