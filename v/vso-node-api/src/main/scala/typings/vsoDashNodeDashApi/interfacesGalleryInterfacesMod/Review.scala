package typings.vsoDashNodeDashApi.interfacesGalleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Review extends js.Object {
  /**
    * Admin Reply, if any, for this review
    */
  var adminReply: ReviewReply
  /**
    * Unique identifier of a review item
    */
  var id: Double
  /**
    * Flag for soft deletion
    */
  var isDeleted: Boolean
  var isIgnored: Boolean
  /**
    * Version of the product for which review was submitted
    */
  var productVersion: String
  /**
    * Rating procided by the user
    */
  var rating: Double
  /**
    * Reply, if any, for this review
    */
  var reply: ReviewReply
  /**
    * Text description of the review
    */
  var text: String
  /**
    * Title of the review
    */
  var title: String
  /**
    * Time when the review was edited/updated
    */
  var updatedDate: Date
  /**
    * Name of the user
    */
  var userDisplayName: String
  /**
    * Id of the user who submitted the review
    */
  var userId: String
}

object Review {
  @scala.inline
  def apply(
    adminReply: ReviewReply,
    id: Double,
    isDeleted: Boolean,
    isIgnored: Boolean,
    productVersion: String,
    rating: Double,
    reply: ReviewReply,
    text: String,
    title: String,
    updatedDate: Date,
    userDisplayName: String,
    userId: String
  ): Review = {
    val __obj = js.Dynamic.literal(adminReply = adminReply, id = id, isDeleted = isDeleted, isIgnored = isIgnored, productVersion = productVersion, rating = rating, reply = reply, text = text, title = title, updatedDate = updatedDate, userDisplayName = userDisplayName, userId = userId)
  
    __obj.asInstanceOf[Review]
  }
}

