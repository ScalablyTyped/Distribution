package typings.vsoNodeApi.galleryInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Review extends StObject {
  
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
  var updatedDate: js.Date
  
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
  
  inline def apply(
    adminReply: ReviewReply,
    id: Double,
    isDeleted: Boolean,
    isIgnored: Boolean,
    productVersion: String,
    rating: Double,
    reply: ReviewReply,
    text: String,
    title: String,
    updatedDate: js.Date,
    userDisplayName: String,
    userId: String
  ): Review = {
    val __obj = js.Dynamic.literal(adminReply = adminReply.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], isDeleted = isDeleted.asInstanceOf[js.Any], isIgnored = isIgnored.asInstanceOf[js.Any], productVersion = productVersion.asInstanceOf[js.Any], rating = rating.asInstanceOf[js.Any], reply = reply.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], updatedDate = updatedDate.asInstanceOf[js.Any], userDisplayName = userDisplayName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Review]
  }
  
  extension [Self <: Review](x: Self) {
    
    inline def setAdminReply(value: ReviewReply): Self = StObject.set(x, "adminReply", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIsDeleted(value: Boolean): Self = StObject.set(x, "isDeleted", value.asInstanceOf[js.Any])
    
    inline def setIsIgnored(value: Boolean): Self = StObject.set(x, "isIgnored", value.asInstanceOf[js.Any])
    
    inline def setProductVersion(value: String): Self = StObject.set(x, "productVersion", value.asInstanceOf[js.Any])
    
    inline def setRating(value: Double): Self = StObject.set(x, "rating", value.asInstanceOf[js.Any])
    
    inline def setReply(value: ReviewReply): Self = StObject.set(x, "reply", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setUpdatedDate(value: js.Date): Self = StObject.set(x, "updatedDate", value.asInstanceOf[js.Any])
    
    inline def setUserDisplayName(value: String): Self = StObject.set(x, "userDisplayName", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
