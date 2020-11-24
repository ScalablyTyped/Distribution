package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AdminReply extends js.Object {
  
  var adminReply: scala.Double = js.native
  
  var publisherReply: scala.Double = js.native
  
  var review: scala.Double = js.native
}
object AdminReply {
  
  @scala.inline
  def apply(adminReply: scala.Double, publisherReply: scala.Double, review: scala.Double): AdminReply = {
    val __obj = js.Dynamic.literal(adminReply = adminReply.asInstanceOf[js.Any], publisherReply = publisherReply.asInstanceOf[js.Any], review = review.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdminReply]
  }
  
  @scala.inline
  implicit class AdminReplyOps[Self <: AdminReply] (val x: Self) extends AnyVal {
    
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
    def setAdminReply(value: scala.Double): Self = this.set("adminReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisherReply(value: scala.Double): Self = this.set("publisherReply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReview(value: scala.Double): Self = this.set("review", value.asInstanceOf[js.Any])
  }
}
