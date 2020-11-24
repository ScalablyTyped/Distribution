package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Review extends js.Object {
  
  /**
    * Admin Reply, if any, for this review
    */
  var adminReply: ReviewReply = js.native
  
  /**
    * Unique identifier of a review item
    */
  var id: Double = js.native
  
  /**
    * Flag for soft deletion
    */
  var isDeleted: Boolean = js.native
  
  var isIgnored: Boolean = js.native
  
  /**
    * Version of the product for which review was submitted
    */
  var productVersion: String = js.native
  
  /**
    * Rating procided by the user
    */
  var rating: Double = js.native
  
  /**
    * Reply, if any, for this review
    */
  var reply: ReviewReply = js.native
  
  /**
    * Text description of the review
    */
  var text: String = js.native
  
  /**
    * Title of the review
    */
  var title: String = js.native
  
  /**
    * Time when the review was edited/updated
    */
  var updatedDate: Date = js.native
  
  /**
    * Name of the user
    */
  var userDisplayName: String = js.native
  
  /**
    * Id of the user who submitted the review
    */
  var userId: String = js.native
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
    val __obj = js.Dynamic.literal(adminReply = adminReply.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], isIgnored = isIgnored.asInstanceOf[js.Any], productVersion = productVersion.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], userDisplayName = userDisplayName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Review]
  }
  
  @scala.inline
  implicit class ReviewOps[Self <: Review] (val x: Self) extends AnyVal {
    
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
    def setAdminReply(value: ReviewReply): Self = this.set("adminReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = this.set("isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIgnored(value: Boolean): Self = this.set("isIgnored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductVersion(value: String): Self = this.set("productVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRating(value: Double): Self = this.set("rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply(value: ReviewReply): Self = this.set("reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: Date): Self = this.set("updatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDisplayName(value: String): Self = this.set("userDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
