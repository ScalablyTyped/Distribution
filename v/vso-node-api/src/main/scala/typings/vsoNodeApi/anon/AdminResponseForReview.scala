package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminResponseForReview extends StObject {
  
  var adminResponseForReview: scala.Double = js.native
  
  var deleteAdminReply: scala.Double = js.native
  
  var deletePublisherReply: scala.Double = js.native
  
  var flagReview: scala.Double = js.native
  
  var replyToReview: scala.Double = js.native
  
  var updateReview: scala.Double = js.native
}
object AdminResponseForReview {
  
  @scala.inline
  def apply(
    adminResponseForReview: scala.Double,
    deleteAdminReply: scala.Double,
    deletePublisherReply: scala.Double,
    flagReview: scala.Double,
    replyToReview: scala.Double,
    updateReview: scala.Double
  ): AdminResponseForReview = {
    val __obj = js.Dynamic.literal(adminResponseForReview = adminResponseForReview.asInstanceOf[js.Any], deleteAdminReply = deleteAdminReply.asInstanceOf[js.Any], deletePublisherReply = deletePublisherReply.asInstanceOf[js.Any], flagReview = flagReview.asInstanceOf[js.Any], replyToReview = replyToReview.asInstanceOf[js.Any], updateReview = updateReview.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminResponseForReview]
  }
  
  @scala.inline
  implicit class AdminResponseForReviewMutableBuilder[Self <: AdminResponseForReview] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdminResponseForReview(value: scala.Double): Self = StObject.set(x, "adminResponseForReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAdminReply(value: scala.Double): Self = StObject.set(x, "deleteAdminReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePublisherReply(value: scala.Double): Self = StObject.set(x, "deletePublisherReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagReview(value: scala.Double): Self = StObject.set(x, "flagReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToReview(value: scala.Double): Self = StObject.set(x, "replyToReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateReview(value: scala.Double): Self = StObject.set(x, "updateReview", value.asInstanceOf[js.Any])
  }
}
