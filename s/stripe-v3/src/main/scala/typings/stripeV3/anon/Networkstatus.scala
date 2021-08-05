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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Networkstatus extends StObject {
  
  var network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval
  
  var reason: highest_risk_level | elevated_risk_level | rule | Null
  
  var risk_level: normal | elevated | highest | not_assessed | unknown_
  
  var risk_score: Double
  
  var rule: js.UndefOr[String] = js.undefined
  
  var seller_message: String
  
  var `type`: authorized | manual_review | issuer_declined | blocked | invalid
}
object Networkstatus {
  
  inline def apply(
    network_status: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval,
    risk_level: normal | elevated | highest | not_assessed | unknown_,
    risk_score: Double,
    seller_message: String,
    `type`: authorized | manual_review | issuer_declined | blocked | invalid
  ): Networkstatus = {
    val __obj = js.Dynamic.literal(network_status = network_status.asInstanceOf[js.Any], risk_level = risk_level.asInstanceOf[js.Any], risk_score = risk_score.asInstanceOf[js.Any], seller_message = seller_message.asInstanceOf[js.Any], reason = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Networkstatus]
  }
  
  extension [Self <: Networkstatus](x: Self) {
    
    inline def setNetwork_status(value: approved_by_network | declined_by_network | not_sent_to_network | reversed_after_approval): Self = StObject.set(x, "network_status", value.asInstanceOf[js.Any])
    
    inline def setReason(value: highest_risk_level | elevated_risk_level | rule): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonNull: Self = StObject.set(x, "reason", null)
    
    inline def setRisk_level(value: normal | elevated | highest | not_assessed | unknown_): Self = StObject.set(x, "risk_level", value.asInstanceOf[js.Any])
    
    inline def setRisk_score(value: Double): Self = StObject.set(x, "risk_score", value.asInstanceOf[js.Any])
    
    inline def setRule(value: String): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    inline def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    inline def setSeller_message(value: String): Self = StObject.set(x, "seller_message", value.asInstanceOf[js.Any])
    
    inline def setType(value: authorized | manual_review | issuer_declined | blocked | invalid): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
