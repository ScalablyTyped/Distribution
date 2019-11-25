package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Declineon extends js.Object {
  /**
    * Automatically declines certain charge types regardless of whether the card
    * issuer accepted or declined the charge.
    */
  var decline_on: js.UndefOr[Anon_Avsfailure] = js.undefined
  /**
    * The default text that appears on credit card statements when a charge is
    * made. This field prefixes any dynamic statement_descriptor specified on the
    * charge. statement_descriptor_prefix is useful for maximizing descriptor space
    * for the dynamic portion.
    */
  var statement_descriptor_prefix: js.UndefOr[String] = js.undefined
}

object Anon_Declineon {
  @scala.inline
  def apply(decline_on: Anon_Avsfailure = null, statement_descriptor_prefix: String = null): Anon_Declineon = {
    val __obj = js.Dynamic.literal()
    if (decline_on != null) __obj.updateDynamic("decline_on")(decline_on.asInstanceOf[js.Any])
    if (statement_descriptor_prefix != null) __obj.updateDynamic("statement_descriptor_prefix")(statement_descriptor_prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Declineon]
  }
}

