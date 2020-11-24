package typings.vsoNodeApi.galleryInterfacesMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserReportedConcern extends js.Object {
  
  /**
    * Category of the concern
    */
  var category: ConcernCategory = js.native
  
  /**
    * User comment associated with the report
    */
  var concernText: String = js.native
  
  /**
    * Id of the review which was reported
    */
  var reviewId: Double = js.native
  
  /**
    * Date the report was submitted
    */
  var submittedDate: Date = js.native
  
  /**
    * Id of the user who reported a review
    */
  var userId: String = js.native
}
object UserReportedConcern {
  
  @scala.inline
  def apply(
    category: ConcernCategory,
    concernText: String,
    reviewId: Double,
    submittedDate: Date,
    userId: String
  ): UserReportedConcern = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], concernText = concernText.asInstanceOf[js.Any], reviewId = reviewId.asInstanceOf[js.Any], submittedDate = submittedDate.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserReportedConcern]
  }
  
  @scala.inline
  implicit class UserReportedConcernOps[Self <: UserReportedConcern] (val x: Self) extends AnyVal {
    
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
    def setCategory(value: ConcernCategory): Self = this.set("category", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConcernText(value: String): Self = this.set("concernText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReviewId(value: Double): Self = this.set("reviewId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubmittedDate(value: Date): Self = this.set("submittedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
}
