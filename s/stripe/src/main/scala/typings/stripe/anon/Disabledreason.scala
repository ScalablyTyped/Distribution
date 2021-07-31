package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Disabledreason extends StObject {
  
  /**
    * A string describing the reason for this account being unable to charge
    * and/or transfer, if that is the case. Possible values are "rejected.fraud",
    * "rejected.terms_of_service", "rejected.listed", "rejected.other",
    * "fields_needed", "listed", or "other".
    */
  var disabled_reason: String
  
  /**
    * At what time the fields_needed must be provided. If this date is in
    * the past, the account is already in bad standing, and providing
    * fields_needed is necessary to re-enable transfers and prevent other
    * consequences. If this date is in the future, fields_needed must be
    * provided to ensure the account remains in good standing.
    */
  var due_by: Double
  
  /**
    * Field names that need to be provided for the account to remain in good
    * standing. Nested fields are separated by "." (for example,
    * "legal_entity.first_name").
    */
  var fields_needed: js.Array[String]
  
  /**
    * The set of capabilities you want to unlock for this account (US only).
    * Each capability will be inactive until you have provided its specific requirements and Stripe has verified them.
    * An account may have some of its requested capabilities be active and some be inactive.
    */
  var requested_capabilities: js.UndefOr[js.Array[String]] = js.undefined
}
object Disabledreason {
  
  @scala.inline
  def apply(disabled_reason: String, due_by: Double, fields_needed: js.Array[String]): Disabledreason = {
    val __obj = js.Dynamic.literal(disabled_reason = disabled_reason.asInstanceOf[js.Any], due_by = due_by.asInstanceOf[js.Any], fields_needed = fields_needed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabledreason]
  }
  
  @scala.inline
  implicit class DisabledreasonMutableBuilder[Self <: Disabledreason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled_reason(value: String): Self = StObject.set(x, "disabled_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDue_by(value: Double): Self = StObject.set(x, "due_by", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields_needed(value: js.Array[String]): Self = StObject.set(x, "fields_needed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields_neededVarargs(value: String*): Self = StObject.set(x, "fields_needed", js.Array(value :_*))
    
    @scala.inline
    def setRequested_capabilities(value: js.Array[String]): Self = StObject.set(x, "requested_capabilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequested_capabilitiesUndefined: Self = StObject.set(x, "requested_capabilities", js.undefined)
    
    @scala.inline
    def setRequested_capabilitiesVarargs(value: String*): Self = StObject.set(x, "requested_capabilities", js.Array(value :_*))
  }
}
