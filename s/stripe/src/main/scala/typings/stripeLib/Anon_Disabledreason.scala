package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disabledreason extends js.Object {
  /**
    * A string describing the reason for this account being unable to charge
    * and/or transfer, if that is the case. Possible values are "rejected.fraud",
    * "rejected.terms_of_service", "rejected.listed", "rejected.other",
    * "fields_needed", "listed", or "other".
    */
  var disabled_reason: java.lang.String
  /**
    * At what time the fields_needed must be provided. If this date is in
    * the past, the account is already in bad standing, and providing
    * fields_needed is necessary to re-enable transfers and prevent other
    * consequences. If this date is in the future, fields_needed must be
    * provided to ensure the account remains in good standing.
    */
  var due_by: scala.Double
  /**
    * Field names that need to be provided for the account to remain in good
    * standing. Nested fields are separated by "." (for example,
    * "legal_entity.first_name").
    */
  var fields_needed: js.Array[java.lang.String]
}

object Anon_Disabledreason {
  @scala.inline
  def apply(disabled_reason: java.lang.String, due_by: scala.Double, fields_needed: js.Array[java.lang.String]): Anon_Disabledreason = {
    val __obj = js.Dynamic.literal(disabled_reason = disabled_reason, due_by = due_by, fields_needed = fields_needed)
  
    __obj.asInstanceOf[Anon_Disabledreason]
  }
}

