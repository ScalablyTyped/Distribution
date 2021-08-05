package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Currentlydue extends StObject {
  
  /**
    * Fields that need to be collected to keep the person’s account enabled.
    * If not collected by the account’s current_deadline, these fields appear in past_due as well, and the account is disabled.
    */
  var currently_due: js.Array[String]
  
  /**
    * Fields that need to be collected assuming all volume thresholds are reached.
    * As fields are needed, they are moved to currently_due and the account’s current_deadline is set.
    */
  var eventually_due: js.Array[String]
  
  /**
    * Fields that weren’t collected by the account’s current_deadline.
    * These fields need to be collected to enable payouts for the person’s account.
    */
  var past_due: js.Array[String]
  
  /**
    * Fields that may become required depending on the results of verification or review.
    * An empty array unless an asynchronous verification is pending.
    * If verification fails, the fields in this array become required and move to currently_due or past_due.
    */
  var pending_verification: js.Array[String]
}
object Currentlydue {
  
  inline def apply(
    currently_due: js.Array[String],
    eventually_due: js.Array[String],
    past_due: js.Array[String],
    pending_verification: js.Array[String]
  ): Currentlydue = {
    val __obj = js.Dynamic.literal(currently_due = currently_due.asInstanceOf[js.Any], eventually_due = eventually_due.asInstanceOf[js.Any], past_due = past_due.asInstanceOf[js.Any], pending_verification = pending_verification.asInstanceOf[js.Any])
    __obj.asInstanceOf[Currentlydue]
  }
  
  extension [Self <: Currentlydue](x: Self) {
    
    inline def setCurrently_due(value: js.Array[String]): Self = StObject.set(x, "currently_due", value.asInstanceOf[js.Any])
    
    inline def setCurrently_dueVarargs(value: String*): Self = StObject.set(x, "currently_due", js.Array(value :_*))
    
    inline def setEventually_due(value: js.Array[String]): Self = StObject.set(x, "eventually_due", value.asInstanceOf[js.Any])
    
    inline def setEventually_dueVarargs(value: String*): Self = StObject.set(x, "eventually_due", js.Array(value :_*))
    
    inline def setPast_due(value: js.Array[String]): Self = StObject.set(x, "past_due", value.asInstanceOf[js.Any])
    
    inline def setPast_dueVarargs(value: String*): Self = StObject.set(x, "past_due", js.Array(value :_*))
    
    inline def setPending_verification(value: js.Array[String]): Self = StObject.set(x, "pending_verification", value.asInstanceOf[js.Any])
    
    inline def setPending_verificationVarargs(value: String*): Self = StObject.set(x, "pending_verification", js.Array(value :_*))
  }
}
