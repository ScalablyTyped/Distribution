package typings.stripeV3.anon

import typings.stripeV3.stripeV3Strings.approved_by_network
import typings.stripeV3.stripeV3Strings.authorized
import typings.stripeV3.stripeV3Strings.blocked
import typings.stripeV3.stripeV3Strings.declined_by_network
import typings.stripeV3.stripeV3Strings.elevated
import typings.stripeV3.stripeV3Strings.elevated_risk_level
import typings.stripeV3.stripeV3Strings.highest
import typings.stripeV3.stripeV3Strings.highest_risk_level
import typings.stripeV3.stripeV3Strings.invalid
import typings.stripeV3.stripeV3Strings.issuer_declined
import typings.stripeV3.stripeV3Strings.manual_review
import typings.stripeV3.stripeV3Strings.normal
import typings.stripeV3.stripeV3Strings.not_assessed
import typings.stripeV3.stripeV3Strings.not_sent_to_network
import typings.stripeV3.stripeV3Strings.reversed_after_approval
import typings.stripeV3.stripeV3Strings.rule
import typings.stripeV3.stripeV3Strings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Networkstatus extends js.Object {
  var network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval = js.native
  var reason: highest_risk_level | elevated_risk_level | rule | Null = js.native
  var risk_level: normal | elevated | highest | not_assessed | unknown_ = js.native
  var risk_score: Double = js.native
  var rule: js.UndefOr[String] = js.native
  var seller_message: String = js.native
  var `type`: authorized | manual_review | issuer_declined | blocked | invalid = js.native
}

object Networkstatus {
  @scala.inline
  def apply(
    network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval,
    risk_level: normal | elevated | highest | not_assessed | unknown_,
    risk_score: Double,
    seller_message: String,
    `type`: authorized | manual_review | issuer_declined | blocked | invalid
  ): Networkstatus = {
    val __obj = js.Dynamic.literal(network_status = network_status.asInstanceOf[js.Any], risk_level = risk_level.asInstanceOf[js.Any], risk_score = risk_score.asInstanceOf[js.Any], seller_message = seller_message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Networkstatus]
  }
  @scala.inline
  implicit class NetworkstatusOps[Self <: Networkstatus] (val x: Self) extends AnyVal {
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
    def setNetwork_status(value: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval): Self = this.set("network_status", value.asInstanceOf[js.Any])
    @scala.inline
    def setRisk_level(value: normal | elevated | highest | not_assessed | unknown_): Self = this.set("risk_level", value.asInstanceOf[js.Any])
    @scala.inline
    def setRisk_score(value: Double): Self = this.set("risk_score", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeller_message(value: String): Self = this.set("seller_message", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: authorized | manual_review | issuer_declined | blocked | invalid): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: highest_risk_level | elevated_risk_level | rule): Self = this.set("reason", value.asInstanceOf[js.Any])
    @scala.inline
    def setReasonNull: Self = this.set("reason", null)
    @scala.inline
    def setRule(value: String): Self = this.set("rule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRule: Self = this.set("rule", js.undefined)
  }
  
}

