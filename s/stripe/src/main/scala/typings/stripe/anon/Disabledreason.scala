package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disabledreason extends js.Object {
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
  def apply(
    disabled_reason: String,
    due_by: Double,
    fields_needed: js.Array[String],
    requested_capabilities: js.Array[String] = null
  ): Disabledreason = {
    val __obj = js.Dynamic.literal(disabled_reason = disabled_reason.asInstanceOf[js.Any], due_by = due_by.asInstanceOf[js.Any], fields_needed = fields_needed.asInstanceOf[js.Any])
    if (requested_capabilities != null) __obj.updateDynamic("requested_capabilities")(requested_capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabledreason]
  }
}

