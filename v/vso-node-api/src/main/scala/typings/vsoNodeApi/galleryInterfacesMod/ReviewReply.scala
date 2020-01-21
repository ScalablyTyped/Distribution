package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReviewReply extends js.Object {
  /**
    * Id of the reply
    */
  var id: Double
  /**
    * Flag for soft deletion
    */
  var isDeleted: Boolean
  /**
    * Version of the product when the reply was submitted or updated
    */
  var productVersion: String
  /**
    * Content of the reply
    */
  var replyText: String
  /**
    * Id of the review, to which this reply belongs
    */
  var reviewId: Double
  /**
    * Title of the reply
    */
  var title: String
  /**
    * Date the reply was submitted or updated
    */
  var updatedDate: Date
  /**
    * Id of the user who left the reply
    */
  var userId: String
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
}

