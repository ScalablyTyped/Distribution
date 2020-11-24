package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminResponseForReview extends js.Object {
  
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
  implicit class AdminResponseForReviewOps[Self <: AdminResponseForReview] (val x: Self) extends AnyVal {
    
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
    def setAdminResponseForReview(value: scala.Double): Self = this.set("adminResponseForReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteAdminReply(value: scala.Double): Self = this.set("deleteAdminReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletePublisherReply(value: scala.Double): Self = this.set("deletePublisherReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlagReview(value: scala.Double): Self = this.set("flagReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplyToReview(value: scala.Double): Self = this.set("replyToReview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateReview(value: scala.Double): Self = this.set("updateReview", value.asInstanceOf[js.Any])
  }
}
