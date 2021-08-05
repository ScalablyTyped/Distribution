package typings.stripe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Declineon extends StObject {
  
  /**
    * Automatically declines certain charge types regardless of whether the card
    * issuer accepted or declined the charge.
    */
  var decline_on: js.UndefOr[Avsfailure] = js.undefined
  
  /**
    * The default text that appears on credit card statements when a charge is
    * made. This field prefixes any dynamic statement_descriptor specified on the
    * charge. statement_descriptor_prefix is useful for maximizing descriptor space
    * for the dynamic portion.
    */
  var statement_descriptor_prefix: js.UndefOr[String] = js.undefined
}
object Declineon {
  
  inline def apply(): Declineon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Declineon]
  }
  
  extension [Self <: Declineon](x: Self) {
    
    inline def setDecline_on(value: Avsfailure): Self = StObject.set(x, "decline_on", value.asInstanceOf[js.Any])
    
    inline def setDecline_onUndefined: Self = StObject.set(x, "decline_on", js.undefined)
    
    inline def setStatement_descriptor_prefix(value: String): Self = StObject.set(x, "statement_descriptor_prefix", value.asInstanceOf[js.Any])
    
    inline def setStatement_descriptor_prefixUndefined: Self = StObject.set(x, "statement_descriptor_prefix", js.undefined)
  }
}
