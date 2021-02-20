package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Declineon extends StObject {
  
  /**
    * Automatically declines certain charge types regardless of whether the card
    * issuer accepted or declined the charge.
    */
  var decline_on: js.UndefOr[Avsfailure] = js.native
  
  /**
    * The default text that appears on credit card statements when a charge is
    * made. This field prefixes any dynamic statement_descriptor specified on the
    * charge. statement_descriptor_prefix is useful for maximizing descriptor space
    * for the dynamic portion.
    */
  var statement_descriptor_prefix: js.UndefOr[String] = js.native
}
object Declineon {
  
  @scala.inline
  def apply(): Declineon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Declineon]
  }
  
  @scala.inline
  implicit class DeclineonMutableBuilder[Self <: Declineon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecline_on(value: Avsfailure): Self = StObject.set(x, "decline_on", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecline_onUndefined: Self = StObject.set(x, "decline_on", js.undefined)
    
    @scala.inline
    def setStatement_descriptor_prefix(value: String): Self = StObject.set(x, "statement_descriptor_prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatement_descriptor_prefixUndefined: Self = StObject.set(x, "statement_descriptor_prefix", js.undefined)
  }
}
