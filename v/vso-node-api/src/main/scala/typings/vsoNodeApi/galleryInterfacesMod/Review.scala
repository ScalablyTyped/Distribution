package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Review extends StObject {
  
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
  implicit class ReviewMutableBuilder[Self <: Review] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminReply(value: ReviewReply): Self = StObject.set(x, "adminReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIgnored(value: Boolean): Self = StObject.set(x, "isIgnored", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProductVersion(value: String): Self = StObject.set(x, "productVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReply(value: ReviewReply): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdatedDate(value: Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDisplayName(value: String): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
