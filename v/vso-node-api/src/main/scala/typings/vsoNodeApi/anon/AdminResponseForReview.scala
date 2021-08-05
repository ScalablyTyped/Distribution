package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AdminResponseForReview extends StObject {
  
  var adminResponseForReview: scala.Double
  
  var deleteAdminReply: scala.Double
  
  var deletePublisherReply: scala.Double
  
  var flagReview: scala.Double
  
  var replyToReview: scala.Double
  
  var updateReview: scala.Double
}
object AdminResponseForReview {
  
  inline def apply(
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
  
  extension [Self <: AdminResponseForReview](x: Self) {
    
    inline def setAdminResponseForReview(value: scala.Double): Self = StObject.set(x, "adminResponseForReview", value.asInstanceOf[js.Any])
    
    inline def setDeleteAdminReply(value: scala.Double): Self = StObject.set(x, "deleteAdminReply", value.asInstanceOf[js.Any])
    
    inline def setDeletePublisherReply(value: scala.Double): Self = StObject.set(x, "deletePublisherReply", value.asInstanceOf[js.Any])
    
    inline def setFlagReview(value: scala.Double): Self = StObject.set(x, "flagReview", value.asInstanceOf[js.Any])
    
    inline def setReplyToReview(value: scala.Double): Self = StObject.set(x, "replyToReview", value.asInstanceOf[js.Any])
    
    inline def setUpdateReview(value: scala.Double): Self = StObject.set(x, "updateReview", value.asInstanceOf[js.Any])
  }
}
