package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReviewReply extends js.Object {
  /**
    * Id of the reply
    */
  var id: Double = js.native
  /**
    * Flag for soft deletion
    */
  var isDeleted: Boolean = js.native
  /**
    * Version of the product when the reply was submitted or updated
    */
  var productVersion: String = js.native
  /**
    * Content of the reply
    */
  var replyText: String = js.native
  /**
    * Id of the review, to which this reply belongs
    */
  var reviewId: Double = js.native
  /**
    * Title of the reply
    */
  var title: String = js.native
  /**
    * Date the reply was submitted or updated
    */
  var updatedDate: Date = js.native
  /**
    * Id of the user who left the reply
    */
  var userId: String = js.native
}

object ReviewReply {
  @scala.inline
  def apply(
    id: Double,
    isDeleted: Boolean,
    productVersion: String,
    replyText: String,
    reviewId: Double,
    title: String,
    updatedDate: Date,
    userId: String
  ): ReviewReply = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], productVersion = productVersion.asInstanceOf[js.Any], replyText = replyText.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReviewReply]
  }
  @scala.inline
  implicit class ReviewReplyOps[Self <: ReviewReply] (val x: Self) extends AnyVal {
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
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductVersion(value: String): Self = this.set("productVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplyText(value: String): Self = this.set("replyText", value.asInstanceOf[js.Any])
    @scala.inline
    def setReviewId(value: Double): Self = this.set("reviewId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdatedDate(value: Date): Self = this.set("updatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

