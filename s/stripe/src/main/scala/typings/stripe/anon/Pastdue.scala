package typings.stripe.anon

import typings.stripe.stripeStrings.listed
import typings.stripe.stripeStrings.rejectedDotlisted
import typings.stripe.stripeStrings.under_review
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pastdue extends StObject {
  
  /**
    * If the cardholder is disabled, this string describes why. Can be one of listed, rejected.listed, or under_review.
    */
  var disabled_reason: listed | rejectedDotlisted | under_review = js.native
  
  /**
    * If not empty, this field contains the list of fields that need to be collected in order to verify and re-enabled the cardholder.
    */
  var past_due: js.Array[String] = js.native
}
object Pastdue {
  
  @scala.inline
  def apply(disabled_reason: listed | rejectedDotlisted | under_review, past_due: js.Array[String]): Pastdue = {
    val __obj = js.Dynamic.literal(disabled_reason = disabled_reason.asInstanceOf[js.Any], past_due = past_due.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pastdue]
  }
  
  @scala.inline
  implicit class PastdueMutableBuilder[Self <: Pastdue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisabled_reason(value: listed | rejectedDotlisted | under_review): Self = StObject.set(x, "disabled_reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPast_due(value: js.Array[String]): Self = StObject.set(x, "past_due", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPast_dueVarargs(value: String*): Self = StObject.set(x, "past_due", js.Array(value :_*))
  }
}
