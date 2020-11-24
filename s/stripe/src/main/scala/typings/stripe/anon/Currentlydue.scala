package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Currentlydue extends js.Object {
  
  /**
    * Fields that need to be collected to keep the person’s account enabled.
    * If not collected by the account’s current_deadline, these fields appear in past_due as well, and the account is disabled.
    */
  var currently_due: js.Array[String] = js.native
  
  /**
    * Fields that need to be collected assuming all volume thresholds are reached.
    * As fields are needed, they are moved to currently_due and the account’s current_deadline is set.
    */
  var eventually_due: js.Array[String] = js.native
  
  /**
    * Fields that weren’t collected by the account’s current_deadline.
    * These fields need to be collected to enable payouts for the person’s account.
    */
  var past_due: js.Array[String] = js.native
  
  /**
    * Fields that may become required depending on the results of verification or review.
    * An empty array unless an asynchronous verification is pending.
    * If verification fails, the fields in this array become required and move to currently_due or past_due.
    */
  var pending_verification: js.Array[String] = js.native
}
object Currentlydue {
  
  @scala.inline
  def apply(
    currently_due: js.Array[String],
    eventually_due: js.Array[String],
    past_due: js.Array[String],
    pending_verification: js.Array[String]
  ): Currentlydue = {
    val __obj = js.Dynamic.literal(currently_due = currently_due.asInstanceOf[js.Any], eventually_due = eventually_due.asInstanceOf[js.Any], past_due = past_due.asInstanceOf[js.Any], pending_verification = pending_verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentlydue]
  }
  
  @scala.inline
  implicit class CurrentlydueOps[Self <: Currentlydue] (val x: Self) extends AnyVal {
    
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
    def setCurrently_dueVarargs(value: String*): Self = this.set("currently_due", js.Array(value :_*))
    
    @scala.inline
    def setCurrently_due(value: js.Array[String]): Self = this.set("currently_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventually_dueVarargs(value: String*): Self = this.set("eventually_due", js.Array(value :_*))
    
    @scala.inline
    def setEventually_due(value: js.Array[String]): Self = this.set("eventually_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPast_dueVarargs(value: String*): Self = this.set("past_due", js.Array(value :_*))
    
    @scala.inline
    def setPast_due(value: js.Array[String]): Self = this.set("past_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending_verificationVarargs(value: String*): Self = this.set("pending_verification", js.Array(value :_*))
    
    @scala.inline
    def setPending_verification(value: js.Array[String]): Self = this.set("pending_verification", value.asInstanceOf[js.Any])
  }
}
