package typings.stripe.mod.accounts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAccountRequirements extends StObject {
  
  /**
    * The date the fields in currently_due must be collected by to keep payouts enabled for the account.
    * These fields might block payouts sooner if the next threshold is reached before these fields are collected.
    */
  var current_deadline: Double | Null
  
  /**
    * The fields that need to be collected to keep the account enabled. If not collected by the current_deadline, these fields appear in past_due as well, and the account is disabled.
    */
  var currently_due: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * If the account is disabled, this string describes why the account can’t create charges or receive payouts. Can be requirements.past_due, requirements.pending_verification, rejected.fraud, rejected.terms_of_service, rejected.listed, rejected.other, listed, under_review, or other.
    */
  var disabled_reason: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The fields that need to be collected assuming all volume thresholds are reached. As they become required, these fields appear in currently_due as well, and the current_deadline is set.
    */
  var eventually_due: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * The fields that weren’t collected by the current_deadline. These fields need to be collected to re-enable the account.
    */
  var past_due: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * Fields that may become required depending on the results of verification or review. An empty array unless an asynchronous verification is pending. If verification fails, the fields in this array become required and move to currently_due or past_due.
    */
  var pending_verification: js.UndefOr[js.Array[String]] = js.undefined
}
object IAccountRequirements {
  
  @scala.inline
  def apply(): IAccountRequirements = {
    val __obj = js.Dynamic.literal(current_deadline = null)
    __obj.asInstanceOf[IAccountRequirements]
  }
  
  @scala.inline
  implicit class IAccountRequirementsMutableBuilder[Self <: IAccountRequirements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrent_deadline(value: Double): Self = StObject.set(x, "current_deadline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent_deadlineNull: Self = StObject.set(x, "current_deadline", null)
    
    @scala.inline
    def setCurrently_due(value: js.Array[String]): Self = StObject.set(x, "currently_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrently_dueUndefined: Self = StObject.set(x, "currently_due", js.undefined)
    
    @scala.inline
    def setCurrently_dueVarargs(value: String*): Self = StObject.set(x, "currently_due", js.Array(value :_*))
    
    @scala.inline
    def setDisabled_reason(value: String): Self = StObject.set(x, "disabled_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabled_reasonNull: Self = StObject.set(x, "disabled_reason", null)
    
    @scala.inline
    def setDisabled_reasonUndefined: Self = StObject.set(x, "disabled_reason", js.undefined)
    
    @scala.inline
    def setEventually_due(value: js.Array[String]): Self = StObject.set(x, "eventually_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventually_dueUndefined: Self = StObject.set(x, "eventually_due", js.undefined)
    
    @scala.inline
    def setEventually_dueVarargs(value: String*): Self = StObject.set(x, "eventually_due", js.Array(value :_*))
    
    @scala.inline
    def setPast_due(value: js.Array[String]): Self = StObject.set(x, "past_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPast_dueUndefined: Self = StObject.set(x, "past_due", js.undefined)
    
    @scala.inline
    def setPast_dueVarargs(value: String*): Self = StObject.set(x, "past_due", js.Array(value :_*))
    
    @scala.inline
    def setPending_verification(value: js.Array[String]): Self = StObject.set(x, "pending_verification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPending_verificationUndefined: Self = StObject.set(x, "pending_verification", js.undefined)
    
    @scala.inline
    def setPending_verificationVarargs(value: String*): Self = StObject.set(x, "pending_verification", js.Array(value :_*))
  }
}
