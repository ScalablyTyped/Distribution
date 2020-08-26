package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Concern extends QnAItem {
  /**
    * Category of the concern
    */
  var category: ConcernCategory = js.native
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
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], createdDate = createdDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[Concern]
  }
  @scala.inline
  implicit class ConcernOps[Self <: Concern] (val x: Self) extends AnyVal {
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
    def setCategory(value: ConcernCategory): Self = this.set("category", value.asInstanceOf[js.Any])
  }
  
}

